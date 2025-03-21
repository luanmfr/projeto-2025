package com.Programacao.web.fatec.api.fatec.config;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;

@Configurable

public class swaggerConfig{
    @Bean 
    public OpenAPI custonOpenAPI()
    {
        return new OpenAPI()
        .info(new Info()
        .title("API projeto 2025 - semestre 1 ")
        .version("1.0")
        .description("Documentação da API do projeto 2025 - semestre 1")
        );
    }
}