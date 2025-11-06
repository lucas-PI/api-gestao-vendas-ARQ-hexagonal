package com.lucasPI.api_gestao_vendas.adapter.outbound.entity;

import com.lucasPI.api_gestao_vendas.adapter.outbound.entity.PK.JpaItemPedidoPK;
import com.lucasPI.api_gestao_vendas.domain.ItemPedido;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "tb_Pedido")
public class JpaPedidoEntity {
    private Long id;
    private LocalDateTime data;
    private Set<JpaItemPedidoEntity> itensPedido;
}
