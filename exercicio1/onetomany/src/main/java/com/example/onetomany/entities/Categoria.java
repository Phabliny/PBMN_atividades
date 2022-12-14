package com.example.onetomany.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection="categoria")
public class Categoria {
    @Id
    private String id;
    private String nome;
    @DBRef
    private List<Curso> cursos;

    public Categoria(String id, String nome, List<Curso> cursos) {
        this.id = id;
        this.nome = nome;
        this.cursos = cursos;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(List<Curso> cursos) {
        this.cursos = cursos;
    }
}
