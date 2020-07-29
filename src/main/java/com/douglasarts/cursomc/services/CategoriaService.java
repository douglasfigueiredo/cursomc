package com.douglasarts.cursomc.services;

import java.util.Optional;

import com.douglasarts.cursomc.domain.Categoria;
import com.douglasarts.cursomc.exceptions.ObjectNotFoundException;
import com.douglasarts.cursomc.repositories.CategoriaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoriaService {

  @Autowired
  private CategoriaRepository repo;

  public Categoria buscar(Integer id) {
    Optional<Categoria> obj = repo.findById(id);
    return obj.orElseThrow(() -> new ObjectNotFoundException(
        "Objeto não encontrado! Id: " + id + ", Tipo: " + Categoria.class.getName(), null));
  }

}