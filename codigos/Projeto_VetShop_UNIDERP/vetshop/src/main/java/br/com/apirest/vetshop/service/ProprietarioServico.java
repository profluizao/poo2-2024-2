package br.com.apirest.vetshop.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.apirest.vetshop.model.Proprietario;
import br.com.apirest.vetshop.model.Veiculo;
import br.com.apirest.vetshop.repository.IProprietarioRepositorio;

@Service
public class ProprietarioServico implements IBaseServicoJPA<Proprietario> {

    @Autowired
    private IProprietarioRepositorio repositorio;

    public ProprietarioServico(IProprietarioRepositorio repo){
        this.repositorio = repo;
    }

    @Override
    public List<Proprietario> Browse() {
        return this.repositorio.findAll();
    }

    @Override
    public Optional<Proprietario> Read(Long chave) {
        return this.repositorio.findById(chave);
    }

    @Override
    public Proprietario Edit(Proprietario obj) {
        Optional<Proprietario> old = this.repositorio.findById(obj.getId());
        if (old.isPresent()){
            Proprietario prop = old.get();
            prop.setNome(obj.getNome());
            this.repositorio.save(prop);
            return prop;
        }
        else{
            return null;
        }
    }

    @Override
    public Proprietario Add(Proprietario obj) {
        return this.repositorio.save(obj);
    }

    @Override
    public Proprietario Delete(Long chave) {
        Optional<Proprietario> old = this.repositorio.findById(chave);
        if (old.isPresent()){
            this.repositorio.delete(old.get());
            return old.get();
        }
        else{
            return null;
        }
    }
}
