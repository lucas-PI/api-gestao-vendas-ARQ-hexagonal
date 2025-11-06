package com.lucasPI.api_gestao_vendas.adapter.outbound.entity;

import com.lucasPI.api_gestao_vendas.adapter.outbound.entity.PK.JpaItemPedidoPK;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Table(name = "tb_item_Pedido")
@Setter
@Getter
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class JpaItemPedidoEntity {

    @EmbeddedId
    private JpaItemPedidoPK id;
    private Integer descontoPorcentagem;
    private Integer quantidade;
    private Double preco;

}
