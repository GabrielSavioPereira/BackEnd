package com.savio.Biblioteca.Autor.controller;

import com.savio.Biblioteca.Autor.model.Livro;
import com.savio.Biblioteca.Autor.model.Autor;
import com.savio.Biblioteca.Autor.repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/livros")
public class LivroController {

    @Autowired
    private LivroRepository livroRepository;

    @GetMapping
    public List<Livro> listar(@RequestParam(required = false) String titulo) {
        if (titulo != null) return livroRepository.findByTituloContainingIgnoreCase(titulo);
        return livroRepository.findAll();
    }

    @GetMapping("/{id}")
    public Livro buscar(@PathVariable Long id) {
        return livroRepository.findById(id).orElseThrow();
    }

    @PostMapping
    public Livro criar(@RequestBody Livro livro) {
        return livroRepository.save(livro);
    }

    @PatchMapping("/{id}")
    public Livro atualizar(@PathVariable Long id, @RequestBody Livro dados) {
        Livro livro = livroRepository.findById(id).orElseThrow();
        if (dados.getTitulo() != null) livro.setTitulo(dados.getTitulo());
        if (dados.getGenero() != null) livro.setGenero(dados.getGenero());
        if (dados.getAnoPublicacao() != 0) livro.setAnoPublicacao(dados.getAnoPublicacao());
        return livroRepository.save(livro);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        livroRepository.deleteById(id);
    }
}