package br.uniderp.demomanytoone.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.uniderp.demomanytoone.model.Produto;

public interface IProdutoRepository extends JpaRepository<Produto, Long> {
    
}
