package com.servico.backservico.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.servico.backservico.entity.Servico;

public interface ServicoRepository extends JpaRepository<Servico, Long>{
    
}
