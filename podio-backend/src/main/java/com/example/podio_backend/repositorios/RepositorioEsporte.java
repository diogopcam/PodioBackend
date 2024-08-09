package com.example.podio_backend.repositorios;

import com.example.podio_backend.entidades.Esporte;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RepositorioEsporte extends MongoRepository<Esporte, Integer> {

}
