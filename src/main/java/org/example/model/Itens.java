package org.example.model;

public class Itens {
    private String nome;
    private double preco;
    private int codigo;

    public Itens(String nome, double preco, int codigo) {
        this.setNome(nome);
        this.setPreco(preco);
        this.setCodigo(codigo);
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }
}
