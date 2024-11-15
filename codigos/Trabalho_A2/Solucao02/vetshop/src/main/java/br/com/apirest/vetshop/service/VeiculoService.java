package br.com.apirest.vetshop.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.apirest.vetshop.model.Veiculo;
import br.com.apirest.vetshop.repository.IVeiculoRepository;

@Service
public class VeiculoService implements IBaseServicoJPA<Veiculo>{

    @Autowired
    private IVeiculoRepository repositorio;

    public VeiculoService(IVeiculoRepository repo){
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
            Veiculo veic = old.get();
            veic.setMarca(obj.getMarca());
            veic.setModelo(obj.getModelo());
            veic.setPlaca(obj.getPlaca());
            this.repositorio.save(veic);
            return veic;
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
