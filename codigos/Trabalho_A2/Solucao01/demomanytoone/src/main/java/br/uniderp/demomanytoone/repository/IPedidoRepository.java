package br.uniderp.demomanytoone.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.uniderp.demomanytoone.model.Pedido;

public interface IPedidoRepository extends JpaRepository<Pedido, Long> {
    
}
