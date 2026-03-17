package com.example.gerenciamentoLivro.Models;

import jakarta.persistence.Entity;

@Entity
public class Livro {
    private long id;
    private String titulo;
    private String autor;
    private Integer anoPublicacao;
}
