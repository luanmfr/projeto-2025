package com.Programacao.web.fatec.api.fatec.conmtrolers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class ExercicoControler {

    @GetMapping()
    public String hello() {
        return "GET";
    }

    @GetMapping("/get-idade/{idade}")
    public String retronaidade(@PathVariable Integer idade) {
        try {
            if (idade < 0) {
                throw new NumberFormatException();
            }
            if (idade < 12) {
                return "criança";
            } else if (idade <= 18) {
                return "adolecente";
            } else if (idade >= 60) {
                return "idoso";
            } else {
                return "adulto";
            }

        } catch (Exception e) {
            return "idade invalida";
        }
    }

    @Override
    public String toString() {
        return "ExercicoControler []";
    }
    @GetMapping("/get-par/{par}")
    public String retronaPar(@PathVariable Integer par){
   
        if (par % 2 == 0){
            return "par";
        }else{
            return "impar";
        }
   
}

        }

