package br.com.senai.dao;

import br.com.senai.conexao.ConnectionFactory;
import br.com.senai.modelo.BebidaBean;
import br.com.senai.modelo.ClienteBean;
import java.awt.Component;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class DAO {

    private final Connection connection;

    public DAO() {
        this.connection = ConnectionFactory.createConnection();
    }

    public void deletaBebida(Component parent, String nomeBebida) {
        String delete = "DELETE FROM bebida WHERE nome = ?";

        PreparedStatement statement;
        try {
            statement = this.connection.prepareStatement(delete);
            statement.setString(1, nomeBebida);
            statement.execute();
            statement.close();
            JOptionPane.showMessageDialog(parent, "Deletado com sucesso", "Deletar", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            System.out.println("Impossível deletar bebida" + ex.getStackTrace());
            ex.printStackTrace();
            JOptionPane.showMessageDialog(parent, "Erro ao deletar", "Erro", JOptionPane.ERROR_MESSAGE);
        }

    }

    public void deletaCliente(Component parent, String nomeCliente) {
        String delete = "DELETE FROM cliente WHERE nome = ?";

        PreparedStatement statement;
        try {
            statement = this.connection.prepareStatement(delete);
            statement.setString(1, nomeCliente);
            statement.execute();
            statement.close();
            JOptionPane.showMessageDialog(parent, "Deletado com sucesso", "Deletar", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            System.out.println("Impossível deletar cliente" + ex.getStackTrace());
            ex.printStackTrace();
            JOptionPane.showMessageDialog(parent, "Erro ao deletar", "Erro", JOptionPane.ERROR_MESSAGE);
        }

    }

    public double getTotalGasto(ClienteBean cliente) {
        String select = "SELECT SUM(valor_venda) AS 'soma' FROM venda WHERE id_cliente = ?";
        double valor = -1;
        try {
            PreparedStatement statement = connection.prepareStatement(select);
            statement.setInt(1, cliente.getIdCliente());

            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                return resultSet.getDouble("soma");
            }
            statement.close();
            resultSet.close();

        } catch (SQLException ex) {
            System.out.println("Impossível selecionar em venda" + ex.getStackTrace());
            ex.printStackTrace();
        }

        return valor;
    }

    public void addBebida(int adicional, String nomeBebida) {
        String update = "SELECT quantidade FROM bebida WHERE nome = ?";
        int quantidadeVelha = Integer.MIN_VALUE;

        try {
            PreparedStatement statement = connection.prepareStatement(update);
            statement.setString(1, nomeBebida);

            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                quantidadeVelha = resultSet.getInt(1);
            }

            this.atualizaQtdBebida(nomeBebida, quantidadeVelha + adicional);
        } catch (SQLException ex) {
            System.out.println("Impossível selecionar bebida" + ex.getStackTrace());
            ex.printStackTrace();
        }
    }

    public void realizaVenda(Component parent, String nomeCliente, String nomeBebida, int quantidade) {

        BebidaBean bebida = null;
        int idCliente = -1;

        try {
            PreparedStatement selecionaBebida = connection.prepareStatement("SELECT id_bebida, preco, quantidade FROM bebida WHERE nome = ?");
            selecionaBebida.setString(1, nomeBebida);

            ResultSet resultadoB = selecionaBebida.executeQuery();

            if (resultadoB.next()) {
                bebida = new BebidaBean(resultadoB.getInt(1), resultadoB.getDouble(2), resultadoB.getInt(3));
            }

            PreparedStatement selecionaCliente = connection.prepareStatement("SELECT id_cliente FROM cliente WHERE nome = ?");
            selecionaCliente.setString(1, nomeCliente);

            ResultSet resultadoC = selecionaCliente.executeQuery();

            if (resultadoC.next()) {

                idCliente = resultadoC.getInt(1);
            }

            if (bebida.getQuantidade() < quantidade) {
                JOptionPane.showMessageDialog(parent, "Erro", "Quantidade indisponível", JOptionPane.ERROR_MESSAGE);
            } else {

                PreparedStatement insereVenda = connection.prepareStatement("INSERT INTO venda (id_cliente, id_bebida, valor_venda) values (?, ?, ?)");
                insereVenda.setInt(1, idCliente);
                insereVenda.setInt(2, bebida.getIdBebida());
                insereVenda.setDouble(3, quantidade * bebida.getPreco());

                insereVenda.execute();
                insereVenda.close();
                this.atualizaQtdBebida(nomeBebida, bebida.getQuantidade() - quantidade);
                JOptionPane.showMessageDialog(parent, "Venda concluída com sucesso!\nBebida: " + nomeBebida + "\nPreço unitário: R$ " + bebida.getPreco() + "\nQuantidade: " + quantidade + "\nTotal: R$ " + quantidade * bebida.getPreco());
            }

            selecionaBebida.close();
            selecionaCliente.close();
            resultadoB.close();
            resultadoC.close();

        } catch (SQLException ex) {
            System.out.println("Impossível inserir em venda" + ex.getStackTrace());
            ex.printStackTrace();
        }
    }

    public void cadastraBebida(BebidaBean bebida) throws SQLException {
        String sqlInsert = "INSERT INTO bebida (nome, preco, quantidade) VALUES (?, ?, ?)";

        try {
            PreparedStatement stmp = connection.prepareStatement(sqlInsert);
            stmp.setString(1, bebida.getNome());
            stmp.setDouble(2, bebida.getPreco());
            stmp.setInt(3, bebida.getQuantidade());

            stmp.execute();
            stmp.close();
        } catch (SQLException ex) {
            throw new SQLException("Impossível cadastrar bebida", ex.getSQLState(), ex);
        }
    }

    public ArrayList<BebidaBean> getListaBebida() {
        ArrayList<BebidaBean> listaBebidas = new ArrayList<>();

        String select = "SELECT * FROM BEBIDA";

        try {
            PreparedStatement seleciona = connection.prepareStatement(select);
            ResultSet resultset = seleciona.executeQuery();

            while (resultset.next()) {
                BebidaBean bebida = new BebidaBean(
                        resultset.getInt(1),
                        resultset.getDouble(3),
                        resultset.getString(2),
                        resultset.getInt(4));

                listaBebidas.add(bebida);
            }

            seleciona.close();
            resultset.close();

        } catch (SQLException ex) {
            System.out.println("Impossível selecionar" + ex.getStackTrace());
        }

        return listaBebidas;

    }

    public void cadastraCliente(ClienteBean cliente) throws SQLException {
        String sqlInsert = "INSERT INTO cliente (nome, idade, cpf) VALUES (?, ?, ?)";

        try {
            PreparedStatement stmp = connection.prepareStatement(sqlInsert);
            stmp.setString(1, cliente.getNomeCliente());
            stmp.setInt(2, cliente.getIdadeCliente());
            stmp.setString(3, cliente.getCpfCliente());

            stmp.execute();
            stmp.close();
        } catch (SQLException ex) {
            throw new SQLException("Impossível cadastrar cliente", ex.getSQLState(), ex);
        }
    }

    public ArrayList<ClienteBean> getListaCliente() {
        ArrayList<ClienteBean> listaClientes = new ArrayList<>();

        String select = "SELECT * FROM CLIENTE";

        try {
            PreparedStatement seleciona = connection.prepareStatement(select);
            ResultSet resultset = seleciona.executeQuery();

            while (resultset.next()) {
                ClienteBean cliente = new ClienteBean(
                        resultset.getInt(1),
                        resultset.getString(2),
                        resultset.getInt(3),
                        resultset.getString(4));

                listaClientes.add(cliente);
            }

            seleciona.close();
            resultset.close();

        } catch (SQLException ex) {
            System.out.println("Impossível selecionar" + ex.getStackTrace());
        }

        return listaClientes;

    }

    private void atualizaQtdBebida(String nome, int quantidade) {
        String update = "UPDATE BEBIDA SET quantidade = ? WHERE nome = ?";

        try {
            PreparedStatement stmp = connection.prepareStatement(update);
            stmp.setInt(1, quantidade);
            stmp.setString(2, nome);

            stmp.execute();
            stmp.close();
        } catch (SQLException ex) {
            System.out.println("Impossível atualizar " + ex.getStackTrace());
        }

    }

    public void atualizaNomeBebida(String nomeVelho, String nomeNovo) {
        String update = "UPDATE BEBIDA SET nome = ? WHERE nome = ?";

        try {
            PreparedStatement stmp = connection.prepareStatement(update);
            stmp.setString(1, nomeNovo);
            stmp.setString(2, nomeVelho);

            stmp.execute();
            stmp.close();
        } catch (SQLException ex) {
            System.out.println("Impossível atualizar " + ex.getStackTrace());
        }

    }

    public void atualizaPrecoBebida(String nome, double preco) {
        String update = "UPDATE BEBIDA SET preco = ? WHERE nome = ?";

        try {
            PreparedStatement stmp = connection.prepareStatement(update);
            stmp.setDouble(1, preco);
            stmp.setString(2, nome);

            stmp.execute();
            stmp.close();
        } catch (SQLException ex) {
            System.out.println("Impossível atualizar " + ex.getStackTrace());
        }

    }

    public void atualizaNomeCliente(String nomeVelho, String nomeNovo) {
        String update = "UPDATE cliente SET nome = ? WHERE nome = ?";

        try {
            PreparedStatement stmp = connection.prepareStatement(update);
            stmp.setString(1, nomeNovo);
            stmp.setString(2, nomeVelho);

            stmp.execute();
            stmp.close();
        } catch (SQLException ex) {
            System.out.println("Impossível atualizar " + ex.getStackTrace());
        }

    }

    public void atualizaCpfCliente(String nome, String cpf) {
        String update = "UPDATE cliente SET cpf = ? WHERE nome = ?";

        try {
            PreparedStatement stmp = connection.prepareStatement(update);
            stmp.setString(1, cpf);
            stmp.setString(2, nome);

            stmp.execute();
            stmp.close();
        } catch (SQLException ex) {
            System.out.println("Impossível atualizar " + ex.getStackTrace());
        }

    }

    public void atualizaIdadeCliente(String nome, int idade) {
        String update = "UPDATE cliente SET idade = ? WHERE nome = ?";

        try {
            PreparedStatement stmp = connection.prepareStatement(update);
            stmp.setInt(1, idade);
            stmp.setString(2, nome);

            stmp.execute();
            stmp.close();
        } catch (SQLException ex) {
            System.out.println("Impossível atualizar " + ex.getStackTrace());
        }

    }
}
