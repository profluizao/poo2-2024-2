package br.com.apirest.vetshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.apirest.vetshop.model.Veiculo;

public interface IVeiculoRepository extends JpaRepository<Veiculo, Long> {
    
}
