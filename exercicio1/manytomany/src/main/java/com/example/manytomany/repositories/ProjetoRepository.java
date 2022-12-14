package com.example.manytomany.repositories;

import com.example.manytomany.entities.Projeto;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProjetoRepository extends MongoRepository<Projeto, String> {
}
