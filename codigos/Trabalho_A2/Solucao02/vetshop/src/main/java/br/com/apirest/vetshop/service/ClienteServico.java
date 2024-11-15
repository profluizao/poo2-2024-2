package br.com.apirest.vetshop.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import br.com.apirest.vetshop.model.Cliente;
import br.com.apirest.vetshop.repository.IClienteRepository;

@Service
public class ClienteServico extends BaseServicoJPA<Cliente> {

    @Override
    public Cliente Edit(Long id, Cliente obj) {
        Optional<Cliente> old = this.repositorio.findById(obj.getId());
        if (old.isPresent()){
            Cliente cp = old.get();
            cp.setNome(obj.getNome());
            this.repositorio.save(cp);
            return cp;
        }
        else{
            return null;
        }
    }

    public ClienteServico(IClienteRepository repo){
        super(repo);
    }
}
