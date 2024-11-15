package br.com.apirest.vetshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.apirest.vetshop.model.Pedido;

public interface IPedidoRepository extends JpaRepository<Pedido, Long> {
    
}
