package com.Programacao.domain;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Programacao.domain.cliente.ClienteRepository;
import com.Programacao.web.fatec.api.fatec.entities.cliente;

@Service
public class ClienteService {
    @Autowired
    private ClienteRepository clienteRepository;

    public List<cliente> listarClientes(){
        return clienteRepository.findAll();
    }

    
}
