package com.lucasPI.api_gestao_vendas.domain.PKcompostas;

import com.lucasPI.api_gestao_vendas.domain.Pedido;
import com.lucasPI.api_gestao_vendas.domain.Produto;

import java.util.Objects;

public class ItemPedidoId {
    private Pedido pedido;
    private Produto produto;

    public ItemPedidoId(Pedido pedido, Produto produto) {
        this.pedido = Objects.requireNonNull(pedido);
        this.produto = Objects.requireNonNull(produto);
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedidoId(Pedido pedidoId) {
        this.pedido = pedidoId;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProdutoId(Produto produtoId) {
        this.produto = produtoId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ItemPedidoId that = (ItemPedidoId) o;
        return Objects.equals(pedido, that.pedido) && Objects.equals(produto, that.produto);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pedido, produto);
    }
}
