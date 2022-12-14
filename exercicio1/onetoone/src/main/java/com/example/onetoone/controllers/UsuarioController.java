package com.example.onetoone.controllers;

import com.example.onetoone.entities.Usuario;
import com.example.onetoone.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/usuario")
public class UsuarioController  {
    @Autowired
    private UsuarioRepository repo;
    // Read
    @GetMapping
    public List<Usuario> getUsuarios()
    {
        return repo.findAll();
    }
    // Create
    @PostMapping
    public Usuario saveUsuario(@RequestBody Usuario user)
    {
        return repo.save(user);
    }
    // Update
    @PutMapping
    public Usuario updateUsuario(@RequestBody  Usuario user)
    {
        if( user != null && !user.getId().isEmpty())
            return repo.save(user);
        return null;
    }
    // Delete
    @DeleteMapping
    public void deleteUsuario(@RequestBody Usuario user)
    {
        if( user != null && !user.getId().isEmpty())
        {
            repo.delete(user);
        }
    }
}