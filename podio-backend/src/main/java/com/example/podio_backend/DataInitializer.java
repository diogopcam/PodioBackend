package com.example.podio_backend;

import com.example.podio_backend.entidades.Atleta;
import com.example.podio_backend.repositorios.RepositorioAtleta;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.bson.types.Binary;

import java.time.LocalDate;

@Configuration
public class DataInitializer {

    @Bean
    public CommandLineRunner loadData(RepositorioAtleta atletaRepository) {
        return args -> {
            atletaRepository.save(new Atleta(1, "Guilherme Teodoro", "Tênis de Mesa", LocalDate.parse("2000-01-01"), 'A', ""));
            atletaRepository.save(new Atleta(2, "Hugo Calderano", "Tênis de Mesa", LocalDate.parse("1998-05-15"), 'B', ""));
            atletaRepository.save(new Atleta(3, "Vitor Ishiy", "Tênis de Mesa", LocalDate.parse("1997-11-20"), 'C', ""));
            // Adicione mais dados conforme necessário
        };
    }
}