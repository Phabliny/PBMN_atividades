package com.example.onetomany.controllers;

import java.util.List;

import com.example.onetomany.entities.Curso;
import com.example.onetomany.repositories.CursoRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/curso")
public class CursoController {
    @Autowired
    private CursoRespository repoCurso;
    // Read
    @GetMapping
    public List<Curso> getCursos()
    {
        return repoCurso.findAll();
    }
    // Create
    @PostMapping
    public Curso saveCurso(@RequestBody Curso curso)
    {
        return repoCurso.save(curso);
    }

    // Update
    @PutMapping
    public Curso updateCurso(@RequestBody Curso curso)
    {
        if( curso != null && !curso.getId().isEmpty())
            return repoCurso.save(curso);
        return null;
    }
    // Delete
    @DeleteMapping
    public void deleteCurso(@RequestBody Curso curso)
    {
        if( curso != null && !curso.getId().isEmpty())
        {
            repoCurso.delete(curso);
        }
    }
}