package com.example.manytomany.repositories;

import com.example.manytomany.entities.Funcionario;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface FuncionarioRepository extends MongoRepository<Funcionario, String> {
}