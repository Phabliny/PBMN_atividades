package com.example.onetomany.controllers;

import com.example.onetomany.entities.Categoria;
import com.example.onetomany.repositories.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categoria")
public class CategoriasController {
    @Autowired
    private CategoriaRepository repoCat;
    // Read
    @GetMapping
    public List<Categoria> getCategorias()
    {
        return repoCat.findAll();
    }
    // Create
    @PostMapping
    public Categoria saveCategoria(@RequestBody Categoria cat) {
        return repoCat.save(cat);
    }
    // Update
    @PutMapping
    public Categoria updateEmployee(@RequestBody Categoria cat)
    {
        if( cat != null && !cat.getId().isEmpty())
            return repoCat.save(cat);
        return null;
    }
    // Delete
    @DeleteMapping
    public void deleteEmployee(@RequestBody Categoria cat)
    {
        if( cat != null && !cat.getId().isEmpty())
        {
            repoCat.delete(cat);
        }
    }
}
