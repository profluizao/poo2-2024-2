package br.com.apirest.vetshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.apirest.vetshop.model.Categoria;

public interface ICategoriaRepository extends JpaRepository<Categoria, Long> {
    
}    
