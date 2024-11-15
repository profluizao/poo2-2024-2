package br.uniderp.demomanytoone.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.uniderp.demomanytoone.model.Fornecedor;

public interface IFornecedorRepository extends JpaRepository<Fornecedor, Long> {
    
}
