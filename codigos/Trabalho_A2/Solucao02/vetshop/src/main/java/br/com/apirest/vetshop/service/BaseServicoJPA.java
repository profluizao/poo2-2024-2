package br.com.apirest.vetshop.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class BaseServicoJPA<TModelo> {

    @Autowired
    protected JpaRepository<TModelo, Long> repositorio;

    public BaseServicoJPA(JpaRepository<TModelo, Long> repositorio) {
        this.repositorio = repositorio;
    }
    
    public List<TModelo> Browse() {
        return this.repositorio.findAll();
    }

    public Optional<TModelo> Read(Long id) {
        return this.repositorio.findById(id);
    }

    public abstract TModelo Edit(Long id, TModelo obj);

    public TModelo Add(TModelo obj) {
        return this.repositorio.save(obj);
    }

    public TModelo Delete(Long id) {
        Optional<TModelo> old = this.repositorio.findById(id);
        if(old.isPresent()) {
            this.repositorio.delete(old.get());
        }
        return old.get();
    }    
}