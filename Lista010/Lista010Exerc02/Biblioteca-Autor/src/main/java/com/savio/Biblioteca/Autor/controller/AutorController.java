package com.savio.Biblioteca.Autor.controller;

import com.savio.Biblioteca.Autor.model.Autor;
import com.savio.Biblioteca.Autor.repository.AutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/autores")
public class AutorController {

    @Autowired
    private AutorRepository autorRepository;

    @GetMapping
    public List<Autor> listar() {
        return autorRepository.findAll();
    }

    @GetMapping("/{id}")
    public Autor buscar(@PathVariable Long id) {
        return autorRepository.findById(id).orElseThrow();
    }

    @PostMapping
    public Autor criar(@RequestBody Autor autor) {
        return autorRepository.save(autor);
    }

    @PatchMapping("/{id}")
    public Autor atualizar(@PathVariable Long id, @RequestBody Autor dados) {
        Autor autor = autorRepository.findById(id).orElseThrow();
        if (dados.getNome() != null) autor.setNome(dados.getNome());
        if (dados.getNacionalidade() != null) autor.setNacionalidade(dados.getNacionalidade());
        if (dados.getDataNascimento() != null) autor.setDataNascimento(dados.getDataNascimento());
        return autorRepository.save(autor);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        autorRepository.deleteById(id);
    }
}