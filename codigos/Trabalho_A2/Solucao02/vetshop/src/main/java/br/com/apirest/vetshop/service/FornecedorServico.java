package br.com.apirest.vetshop.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import br.com.apirest.vetshop.model.Fornecedor;

import br.com.apirest.vetshop.repository.IFornecedorRepository;

@Service
public class FornecedorServico extends BaseServicoJPA<Fornecedor>{

    @Override
    public Fornecedor Edit(Long id, Fornecedor obj){
        Optional<Fornecedor> old = this.repositorio.findById(obj.getId());
        if (old.isPresent()){
            Fornecedor cp = old.get();
            cp.setRazaoSocial(obj.getRazaoSocial());
            cp.setNomeFantasia(obj.getNomeFantasia());
            cp.setCnpj(obj.getCnpj());
            cp.setEmail(obj.getEmail());
            cp.setTelefone(obj.getTelefone());
            this.repositorio.save(cp);
            return cp;
        }
        else{
            return null;
        } 
    }

    public FornecedorServico(IFornecedorRepository repo){
        super(repo);
    }    
}
