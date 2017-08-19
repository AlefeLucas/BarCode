package br.com.senai.modelo;

public class VendaBean {

    private int idVenda;
    private int idCliente;
    private int idBebida;
    private double valorVenda;

    public VendaBean() {
    }

    public VendaBean(int idVenda, int idCliente, int idBebida, double valorVenda) {
        this.idVenda = idVenda;
        this.idCliente = idCliente;
        this.idBebida = idBebida;
        this.valorVenda = valorVenda;
    }

    public VendaBean(int idCliente, int idBebida, double valorVenda) {
        this.idCliente = idCliente;
        this.idBebida = idBebida;
        this.valorVenda = valorVenda;
    }



    public int getIdVenda() {
        return idVenda;
    }

    public void setIdVenda(int idVenda) {
        this.idVenda = idVenda;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getIdBebida() {
        return idBebida;
    }

    public void setIdBebida(int idBebida) {
        this.idBebida = idBebida;
    }

    public double getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(double valorVenda) {
        this.valorVenda = valorVenda;
    }
}
