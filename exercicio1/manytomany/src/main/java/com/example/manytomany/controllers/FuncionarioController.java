package com.example.manytomany.controllers;

import com.example.manytomany.entities.Funcionario;
import com.example.manytomany.repositories.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/projeto")
public class FuncionarioController {
    @Autowired
    private FuncionarioRepository repoFun;
    // Read
    @GetMapping
    public List<Funcionario> getFuncionarios()
    {
        return repoFun.findAll();
    }
    // Create
    @PostMapping
    public Funcionario saveFuncionario(@RequestBody Funcionario fun)
    {
        return repoFun.save(fun);
    }
    // Update
    @PutMapping
    public Funcionario updateFuncionario(@RequestBody Funcionario fun)
    {
        if( fun != null && !fun.getId().isEmpty())
            return repoFun.save(fun);
        return null;
    }
    // Delete
    @DeleteMapping
    public void deleteFuncionario(@RequestBody Funcionario fun)
    {
        if( fun != null && !fun.getId().isEmpty())
        {
            repoFun.delete(fun);
        }
    }
}
