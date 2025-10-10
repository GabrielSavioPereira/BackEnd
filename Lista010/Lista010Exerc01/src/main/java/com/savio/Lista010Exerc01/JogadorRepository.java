package com.savio.Lista010Exerc01;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface JogadorRepository extends JpaRepository<Jogador, Long> {
    List<Jogador> findByNomeContainingIgnoreCase(String nome);
}