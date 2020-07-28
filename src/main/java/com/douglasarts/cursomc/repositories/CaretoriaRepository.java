package com.douglasarts.cursomc.repositories;

import com.douglasarts.cursomc.domain.Categoria;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CaretoriaRepository extends JpaRepository<Categoria, Integer> {

}