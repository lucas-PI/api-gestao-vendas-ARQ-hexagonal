package com.lucasPI.api_gestao_vendas.domain;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Produto {

    private Long id;
    private String nome;
    private Double price;
    private String imgURL;
    private Set<Categoria> categorias;

    public Produto(Long id, String nome, Double price, String imgURL) {
        this.id = id;
        this.nome = nome;
        this.price = price;
        this.imgURL = imgURL;
        this.categorias = new HashSet<>();
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

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getImgURL() {
        return imgURL;
    }

    public void setImgURL(String imgURL) {
        this.imgURL = imgURL;
    }

    public Set<Categoria> getCategorias() {
        return categorias;
    }

    public void setCategorias(Set<Categoria> categorias) {
        this.categorias = categorias;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Produto produto = (Produto) o;
        return Objects.equals(id, produto.id) && Objects.equals(nome, produto.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome);
    }
}
