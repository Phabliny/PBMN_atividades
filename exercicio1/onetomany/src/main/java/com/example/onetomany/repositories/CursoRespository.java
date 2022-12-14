package com.example.onetomany.repositories;

import com.example.onetomany.entities.Curso;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CursoRespository extends MongoRepository<Curso, String> {
}