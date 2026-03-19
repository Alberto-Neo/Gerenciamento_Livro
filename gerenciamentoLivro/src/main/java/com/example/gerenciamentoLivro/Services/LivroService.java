package com.example.gerenciamentoLivro.Services;

import com.example.gerenciamentoLivro.Models.Livro;
import com.example.gerenciamentoLivro.Repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LivroService {

    @Autowired
    private LivroRepository livroRepository;

    public LivroService(LivroRepository livroRepository) {
        this.livroRepository = livroRepository;
    }

    public List<Livro> Listar() {
        return livroRepository.findAll();
    }

    public Livro salvarLivro(Livro livro){
        return livroRepository.save(livro);
    }

    public void deletarLivro(Integer id){
        livroRepository.deleteById(id);
    }

    public Livro buscar(Integer id){
        return livroRepository.findById(id).get();
    }
}
