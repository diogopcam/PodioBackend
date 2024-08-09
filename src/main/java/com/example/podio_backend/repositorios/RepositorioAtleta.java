package com.example.podio_backend.repositorios;

import com.example.podio_backend.entidades.Atleta;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface RepositorioAtleta extends MongoRepository<Atleta, String> {
//    // Consultas derivadas
//    List<Atleta> findByNome(String nome);
//
//    // Consultas personalizadas
//    @Query("{ 'esporte' : ?0 }")
//    List<Atleta> findByEsporte(String esporte);
//
//    // Métodos de contagem
//    long countByCategoria(Character categoria);
}
