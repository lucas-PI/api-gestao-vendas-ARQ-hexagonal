package com.lucasPI.api_gestao_vendas.adapter.outbound.entity;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.HashSet;

@Entity
@Table(name = "tb_cliente")
@Setter
@Getter
@EqualsAndHashCode
public class JpaClienteEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private String cpfjOuCnpj;
    @OneToMany(mappedBy = "cliente")
    private HashSet<JpaPedidoEntity> pedidos;
}
