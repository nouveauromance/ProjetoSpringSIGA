package com.siga.entity;

import jakarta.persistence.*;

@Entity

public class Aluno {

    @Id
    @GenerateValue(strategy = GenerationTypes.IDENTITY)
    @Column(name = "Id")
    private Long id;

    @Column(name = "Usuario", nullable = false, length = 100)
    private String usuario;

    @Column(name = "Senha", nullable = false, length = 100)
    private String senha;

    @Column(name = "Nome", nullable =  false, length = 100)
    private String nome;

    @Column(name = "Curso", nullable = false, length = 100)
    private String curso;

    @Column(name = "Email", nullable = false, length = 100)
    private String email;

    @Column(name = "Telefone", nullable = false, length = 100)
    private String telefone;

    @Column(name = "Status", nullable = false, length = 100)
    private String status;

    @Column(name = "Disciplina", nullable = false, length = 100)
    private String disciplina;

    @Column(name = "Nota1")
    private double nota1;

    @Column(name = "Nota2")
    private double nota2;

    @Column(name = "Media")
    private double media;
}