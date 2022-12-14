package com.example.manytomany.controllers;

import com.example.manytomany.entities.Projeto;
import com.example.manytomany.repositories.ProjetoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/projeto")
public class ProjetoController {
    @Autowired
    private ProjetoRepository repoPro;
    // Read
    @GetMapping
    public List<Projeto> getProjetos()
    {
        return repoPro.findAll();
    }
    // Create
    @PostMapping
    public Projeto saveProjeto(@RequestBody Projeto pro)
    {
        return repoPro.save(pro);
    }
    // Update
    @PutMapping
    public Projeto updateProjeto(@RequestBody Projeto pro)
    {
        if( pro != null && !pro.getId().isEmpty())
            return repoPro.save(pro);
        return null;
    }
    // Delete
    @DeleteMapping
    public void deleteProjeto(@RequestBody Projeto pro)
    {
        if( pro != null && !pro.getId().isEmpty())
        {
            repoPro.delete(pro);
        }
    }
}