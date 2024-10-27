package br.com.apirest.vetshop.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.apirest.vetshop.model.Categoria;
import br.com.apirest.vetshop.model.Veiculo;
import br.com.apirest.vetshop.repository.IVeiculoRepositorio;

@Service
public class VeiculoServico implements IBaseServicoJPA<Veiculo> {

    @Autowired
    private IVeiculoRepositorio repositorio;

    public VeiculoServico(IVeiculoRepositorio repo){
        this.repositorio = repo;
    }

    @Override
    public List<Veiculo> Browse() {
        return this.repositorio.findAll();
    }

    @Override
    public Optional<Veiculo> Read(Long chave) {
        return this.repositorio.findById(chave);
    }

    @Override
    public Veiculo Edit(Veiculo obj) {
        Optional<Veiculo> old = this.repositorio.findById(obj.getId());
        if (old.isPresent()){
            Veiculo vcl = old.get();
            vcl.setMarca(obj.getMarca());
            vcl.setModelo(obj.getModelo());
            vcl.setPlaca(obj.getPlaca());
            this.repositorio.save(vcl);
            return vcl;
        }
        else{
            return null;
        }
    }

    @Override
    public Veiculo Add(Veiculo obj) {
        return this.repositorio.save(obj);
    }

    @Override
    public Veiculo Delete(Long chave) {
        Optional<Veiculo> old = this.repositorio.findById(chave);
        if (old.isPresent()){
            this.repositorio.delete(old.get());
            return old.get();
        }
        else{
            return null;
        }
    }
}
