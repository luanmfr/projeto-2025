package com.Programacao.web.fatec.api.fatec.conmtrolers;

import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExercicoControler {
     @GetMapping("{nome}")
    public String Heloword(@PathVariable Optional<String> nome){
        return nome.isPresent() ? nome.get():"dd";
    }
    
    
}
