package com.example.gerenciamentoLivro.Repository;

import com.example.gerenciamentoLivro.Models.Livro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LivroRepository extends JpaRepository<Livro,Integer> {

}
