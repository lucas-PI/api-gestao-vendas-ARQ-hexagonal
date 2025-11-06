package com.lucasPI.api_gestao_vendas.adapter.outbound.entity;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.HashSet;

@Entity
@Table(name = "tb_categoria")
@Setter
@Getter
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class JpaCategoriaEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long categoriaId;
    private String nome;
    @ManyToMany(mappedBy = "categorias")
    private HashSet<JpaProdutoEntity > produto;
}
