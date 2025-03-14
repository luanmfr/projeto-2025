package com.Programacao.web.fatec.api.fatec.conmtrolers;

import java.util.ArrayList;
import java.util.List;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.integration.IntegrationProperties.RSocket.Client;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.Programacao.web.fatec.api.fatec.entities.cliente;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;




@RestController
@RequestMapping("/api/cliente")

public class clienteController {
    private static final Logger logger = LoggerFactory.getLogger(clienteController.class.getName());

        private final List<cliente> clientes = new ArrayList<>();
        private Long idCount = 1L;
    
    @PostMapping("/criar-cliente")
    public ResponseEntity<cliente> criarCliente(@RequestBody cliente cliente) {

        cliente.setId(idCount++);
        clientes.add(cliente);

        logger.info("recebido JSON: nome+{}, idade+{}", cliente.getNome(),cliente.getIdade());
        //return "o cliente "+ cliente.getNome() +"de idade"+cliente.getIdade()+" do endereco"+ cliente.getEndereco()+" foi criado";
        return new ResponseEntity<>(cliente, HttpStatus.OK);
    }
    @GetMapping("/listarclientes")
    public List<cliente> listarClientes(){
            return clientes;

    }
    
    @DeleteMapping("/Delertarcliente/{id}")
    public String DeletarClientes(@PathVariable Long id ){
        try{
        for( cliente c: clientes){
            if (c.getId().equals(id)){
                clientes.remove(c);
                return " cliente com id: "+id+" apagado ";
            }

        }

        return " não existe cliente com id: "+id;
    }catch(Exception ex){
        return ""+ex;
    }
    }
}
