package com.lucasPI.api_gestao_vendas.adapter.outbound.entity;

import com.lucasPI.api_gestao_vendas.domain.Categoria;
import com.lucasPI.api_gestao_vendas.domain.ItemPedido;
import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "tb_produto")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@EqualsAndHashCode
public class JpaProdutoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private Double price;
    private String imgURL;
    @OneToMany(mappedBy = "id.produto")
    private Set<JpaItemPedidoEntity> itemPedidos = new HashSet<>();
    @ManyToMany
    @JoinTable(name = "tb_produto_categoria",
    joinColumns = @JoinColumn(name = "produto_id"),
    inverseJoinColumns = @JoinColumn(name = "categoria_id"))
    private HashSet<JpaCategoriaEntity> categorias;
}
