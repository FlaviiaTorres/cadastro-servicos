package com.servico.backservico.entity;

import java.sql.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

@Entity
@Table(name = "servico")
@Data
public class Servico {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String nomeCliente;

    @JsonFormat(pattern = "dd/MM/yyyy")
    private Date dataInicio;

    @JsonFormat(pattern = "dd/MM/yyyy")
    private Date dataTermino;

    private String descricaoServico;

    private Double valorServico;

    private Double valorPago;

    @JsonFormat(pattern = "dd/MM/yyyy")
    private Date dataPagamento;

    private String status; 
    

    
}
