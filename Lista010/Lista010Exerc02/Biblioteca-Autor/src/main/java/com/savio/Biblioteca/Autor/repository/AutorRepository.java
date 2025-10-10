package com.savio.Biblioteca.Autor.repository;

import com.savio.Biblioteca.Autor.model.Autor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AutorRepository extends JpaRepository<Autor, Long> { }