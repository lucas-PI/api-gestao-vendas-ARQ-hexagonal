package com.lucasPI.api_gestao_vendas.domain;

import java.util.HashSet;
import java.util.Objects;

public class Cliente {
    private Long id;
    private String nome;
    private String email;
    private String cpfOuCnpj;
    private HashSet<Pedido> pedidos;

    public Cliente() {
    }

    public Cliente(Long id, String nome, String email, String cpfOuCnpj, HashSet<Pedido> pedidos) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.cpfOuCnpj = cpfOuCnpj;
        this.pedidos = pedidos;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    public String getCpfOuCnpj() {
        return cpfOuCnpj;
    }

    public void setCpfOuCnpj(String cpfOuCnpj) {
        this.cpfOuCnpj = cpfOuCnpj;
    }

    public HashSet<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(HashSet<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return Objects.equals(id, cliente.id) && Objects.equals(cpfOuCnpj, cliente.cpfOuCnpj);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, cpfOuCnpj);
    }
}
