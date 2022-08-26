package br.com.parkus.model;

public class Produto {
    String codBarras;
    String nome;
    Integer quantidade;

    public Produto() {
    }

    public Produto(String codBarras, String nome, Integer quantidade) {
        this.codBarras = codBarras;
        this.nome = nome;
        this.quantidade = quantidade;
    }

    public String getCodBarras() {
        return codBarras;
    }

    public void setCodBarras(String codBarras) {
        this.codBarras = codBarras;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }
}
