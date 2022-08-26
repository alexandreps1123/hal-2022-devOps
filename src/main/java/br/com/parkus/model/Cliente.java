package br.com.parkus.model;

import java.util.List;

public class Cliente {
    private String nome;
    private String email;

    private List<Produto> produto;
    private List<Cliente> clientes;
    //    contrutores
    public Cliente() {
    }

    public Cliente(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public Cliente(String nome, String email, List<Produto> produto) {
        this.nome = nome;
        this.email = email;
        this.produto = produto;
    }

    public Cliente salvar () {
        this.setClientes(cliente);

        return null;
    }

    //    getter e setter
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Produto> getProduto() {
        return produto;
    }

    public void setProduto(List<Produto> produto) {
        this.produto = produto;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(Cliente cliente) {
        this.clientes.add(cliente);
    }
}
