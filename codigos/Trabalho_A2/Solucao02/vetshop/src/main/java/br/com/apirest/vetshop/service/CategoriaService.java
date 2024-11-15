package br.com.apirest.vetshop.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import br.com.apirest.vetshop.model.Categoria;
import br.com.apirest.vetshop.repository.ICategoriaRepository;

@Service
public class CategoriaService extends BaseServicoJPA<Categoria> {

    @Override
    public Categoria Edit(Long id, Categoria obj) {
        Optional<Categoria> old = this.repositorio.findById(obj.getId());
        if (old.isPresent()){
            Categoria cp = old.get();
            cp.setNome(obj.getNome());
            this.repositorio.save(cp);
            return cp;
        }
        else{
            return null;
        } 
    }

    public CategoriaService(ICategoriaRepository repo){
        super(repo);
    }
    
}
