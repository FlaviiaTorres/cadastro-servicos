package com.servico.backservico.entity;

import java.sql.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "servico")
@Data
public class Servico {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String nomeCliente;

    private Date dataInicio;

    private Date dataTermino;

    private String descricaoServico;

    private Double valorServico;

    private Double valorPago;

    private Date dataPagamento;

    private String status; 
    

    
}
