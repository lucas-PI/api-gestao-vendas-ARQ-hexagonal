package com.lucasPI.api_gestao_vendas.domain;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

public class Pedido {
    private Long id;
    private LocalDateTime data;
    private Set<ItemPedido> itensPedido;

    public Pedido(Long id, LocalDateTime data) {
        this.id = id;
        this.data = data;
        this.itensPedido = new HashSet<>();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public Set<ItemPedido> getItensPedido() {
        return itensPedido;
    }

    public void setItensPedido(Set<ItemPedido> itensPedido) {
        this.itensPedido = itensPedido;
    }
}
