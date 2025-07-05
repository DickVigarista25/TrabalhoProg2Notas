package br.edu.compras02.model;

public class Produto {
    private String nome;
    private int quantidade;
    private double preco;
    private String codigo;

    public Produto() {
    }

    public Produto(String nome, int quantidade, double preco, String codigo) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
        this.codigo = codigo;
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

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Produto{" + "nome=" + nome + ", quantidade=" + quantidade + ", preco=" + preco + ", codigo=" + codigo + '}';
    }
}
