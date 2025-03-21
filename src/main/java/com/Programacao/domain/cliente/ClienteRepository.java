package com.Programacao.domain.cliente;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Programacao.web.fatec.api.fatec.entities.cliente;

public interface ClienteRepository extends JpaRepository<cliente, Long>{

}
