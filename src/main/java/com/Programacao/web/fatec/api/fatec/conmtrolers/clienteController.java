package com.Programacao.web.fatec.api.fatec.conmtrolers;

import org.springframework.web.bind.annotation.*;

import com.Programacao.web.fatec.api.fatec.entities.cliente;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;




@RestController
@RequestMapping("/api/cliente")

public class clienteController {

    @PostMapping("/criar-cliente")
    public String criarCliente(@RequestBody cliente cliente) {
        //TODO: process POST request
        
        return "o cliente "+ cliente.getNome() +"de idade"+cliente.getIdade()+"foi criado";
    }

}
