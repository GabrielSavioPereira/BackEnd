package com.savio.Lista010Exerc01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/jogadores")
public class JogadorController {

    @Autowired
    private JogadorRepository jogadorRepository;

    // GET - todos os jogadores
    @GetMapping
    public List<Jogador> getJogadores(@RequestParam(required = false) String nome) {
        if (nome != null) {
            return jogadorRepository.findByNomeContainingIgnoreCase(nome);
        }
        return jogadorRepository.findAll();
    }

    // GET - jogador específico
    @GetMapping("/{id}")
    public Optional<Jogador> getJogadorById(@PathVariable Long id) {
        return jogadorRepository.findById(id);
    }

    // POST - adicionar jogador
    @PostMapping
    public Jogador adicionarJogador(@RequestBody Jogador jogador) {
        return jogadorRepository.save(jogador);
    }

    // DELETE - deletar jogador
    @DeleteMapping("/{id}")
    public void deletarJogador(@PathVariable Long id) {
        jogadorRepository.deleteById(id);
    }
}