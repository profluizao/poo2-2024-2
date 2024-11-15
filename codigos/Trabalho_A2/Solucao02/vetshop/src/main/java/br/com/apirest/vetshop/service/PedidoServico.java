package br.com.apirest.vetshop.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import br.com.apirest.vetshop.model.Pedido;

import br.com.apirest.vetshop.repository.IPedidoRepository;

@Service
public class PedidoServico extends BaseServicoJPA<Pedido> {

    @Override
    public Pedido Edit(Long id, Pedido obj) {
        Optional<Pedido> old = this.repositorio.findById(obj.getId());
        if (old.isPresent()){
            Pedido cp = old.get();
            cp.setNome(obj.getNome());
            cp.setDataDeAlteracao(obj.getDataDeAlteracao());
            this.repositorio.save(cp);
            return cp;
        }
        else{
            return null;
        } 
    }

    public PedidoServico(IPedidoRepository repo){
        super(repo);
    }
    
}
