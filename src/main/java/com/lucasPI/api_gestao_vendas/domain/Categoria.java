package com.lucasPI.api_gestao_vendas.domain;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Categoria {

    private Long categoriaId;
    private String nome;
    private Set<Produto> produtoSet;

    public Categoria(Long id, String nome) {
        this.categoriaId = id;
        this.nome = nome;
        this.produtoSet = new HashSet<>();
    }

    public Long getCategoriaId() {
        return categoriaId;
    }

    public void setCategoriaId(Long categoriaId) {
        this.categoriaId = categoriaId;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Produto> getProdutoSet() {
        return produtoSet;
    }

    public void setProdutoSet(Set<Produto> produtoSet) {
        this.produtoSet = produtoSet;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Categoria categoria = (Categoria) o;
        return Objects.equals(categoriaId, categoria.categoriaId) && Objects.equals(nome, categoria.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(categoriaId, nome);
    }
}
