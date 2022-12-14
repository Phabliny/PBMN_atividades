package com.example.onetomany.repositories;

import com.example.onetomany.entities.Categoria;
import org.springframework.data.mongodb.repository.MongoRepository;
public interface CategoriaRepository extends MongoRepository<Categoria, String> {
}