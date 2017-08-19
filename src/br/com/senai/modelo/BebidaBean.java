
package br.com.senai.modelo;

public class BebidaBean {
    private int idBebida;
    private double preco;

    public BebidaBean() {
    }

    public BebidaBean(double preco, String nome, int quantidade) {
        this.preco = preco;
        this.nome = nome;
        this.quantidade = quantidade;
    }

    public BebidaBean(int idBebida, double preco, String nome, int quantidade) {
        this.idBebida = idBebida;
        this.preco = preco;
        this.nome = nome;
        this.quantidade = quantidade;
    }

    public BebidaBean(int idBebida, double preco, int quantidade) {
        this.idBebida = idBebida;
        this.preco = preco;
        this.quantidade = quantidade;
    }
    private String nome;
    private int quantidade;

    public int getIdBebida() {
        return idBebida;
    }

    public void setIdBebida(int idBebida) {
        this.idBebida = idBebida;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
