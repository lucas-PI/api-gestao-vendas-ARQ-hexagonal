package com.lucasPI.api_gestao_vendas.domain;

import com.lucasPI.api_gestao_vendas.domain.PKcompostas.ItemPedidoId;

public class ItemPedido {

    private ItemPedidoId id;
    private Integer quantidade;
    private Double price;

    public ItemPedido(Produto produto,Pedido pedido, Integer quantidade, Double price) {
        this.id = new ItemPedidoId(pedido, produto);
        this.quantidade = quantidade;
        this.price = price;
    }

    public Long getProdutcid(){
      return id.getProduto().getId();
    }

    public Long getPedidoId(){
        return id.getPedido().getId();
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
