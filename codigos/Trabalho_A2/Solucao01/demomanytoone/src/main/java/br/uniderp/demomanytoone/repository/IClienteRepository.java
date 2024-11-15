package br.uniderp.demomanytoone.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.uniderp.demomanytoone.model.Cliente;

public interface IClienteRepository extends JpaRepository<Cliente, Long>{
    
}
