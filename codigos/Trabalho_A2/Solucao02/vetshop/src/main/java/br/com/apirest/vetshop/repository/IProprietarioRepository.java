package br.com.apirest.vetshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.apirest.vetshop.model.Proprietario;

public interface IProprietarioRepository extends JpaRepository<Proprietario, Long>{
    
}
