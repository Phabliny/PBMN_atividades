package com.example.manytomany.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection="funcionario")
public class Funcionario {
    @Id
    private String id;
    private String nome;
    private String cargo;
    private String setor;
    @DBRef
    @JsonBackReference
    private List<Projeto> projetos;

    public Funcionario(String id, String nome, String cargo, String setor, List<Projeto> projetos) {
        this.id = id;
        this.nome = nome;
        this.cargo = cargo;
        this.setor = setor;
        this.projetos = projetos;
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

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public List<Projeto> getProjetos() {
        return projetos;
    }

    public void setProjetos(List<Projeto> projetos) {
        this.projetos = projetos;
    }
}
