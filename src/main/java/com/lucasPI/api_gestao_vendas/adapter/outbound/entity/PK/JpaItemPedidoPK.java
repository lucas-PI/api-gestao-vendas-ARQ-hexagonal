package com.lucasPI.api_gestao_vendas.adapter.outbound.entity.PK;

import com.lucasPI.api_gestao_vendas.adapter.outbound.entity.JpaPedidoEntity;
import com.lucasPI.api_gestao_vendas.adapter.outbound.entity.JpaProdutoEntity;
import com.lucasPI.api_gestao_vendas.domain.Pedido;
import com.lucasPI.api_gestao_vendas.domain.Produto;
import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.*;

import java.io.Serializable;

@Embeddable
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
public class JpaItemPedidoPK implements Serializable {

    @ManyToOne
    @JoinColumn(name = "produto_id")
    private JpaProdutoEntity produto;

    @ManyToOne
    @JoinColumn(name = "pedido_id")
    private JpaPedidoEntity pedido;
}
