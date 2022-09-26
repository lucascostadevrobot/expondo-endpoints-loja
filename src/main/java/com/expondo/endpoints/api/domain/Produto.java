package com.expondo.endpoints.api.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@RequiredArgsConstructor
@AllArgsConstructor
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "get_id", nullable = false)
    private Long getId;

    //Atributos
    private Long id;
    private  String nome;
    private Double preco;
    private String descricao;

}
