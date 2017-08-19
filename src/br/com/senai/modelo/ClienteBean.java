
package br.com.senai.modelo;


public class ClienteBean {
 
    private int idCliente;
    private String nomeCliente;
    private int idadeCliente;
    private String cpfCliente;

    public ClienteBean(String nomeCliente, int idadeCliente, String cpfCliente) {
        this.nomeCliente = nomeCliente;
        this.idadeCliente = idadeCliente;
        this.cpfCliente = cpfCliente;
    }

    public ClienteBean(int idCliente, String nomeCliente, int idadeCliente, String cpfCliente) {
        this.idCliente = idCliente;
        this.nomeCliente = nomeCliente;
        this.idadeCliente = idadeCliente;
        this.cpfCliente = cpfCliente;
    }

    public ClienteBean() {
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public int getIdadeCliente() {
        return idadeCliente;
    }

    public void setIdadeCliente(int idadeCliente) {
        this.idadeCliente = idadeCliente;
    }

    public String getCpfCliente() {
        return cpfCliente;
    }

    public void setCpfCliente(String cpfCliente) {
        this.cpfCliente = cpfCliente;
    }
    
}
