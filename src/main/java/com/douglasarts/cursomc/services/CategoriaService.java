package com.douglasarts.cursomc.services;

import java.util.Optional;

import com.douglasarts.cursomc.domain.Categoria;
import com.douglasarts.cursomc.repositories.CaretoriaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoriaService {

  @Autowired
  private CaretoriaRepository repo;

  public Categoria buscar(Integer id) {
    Optional<Categoria> obj = repo.findById(id);
    return obj.orElse(null);
  }

}