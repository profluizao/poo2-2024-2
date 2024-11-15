package br.com.apirest.vetshop.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import br.com.apirest.vetshop.service.BaseServicoJPA;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class BaseRestController<TModelo> {
    
    @Autowired
    protected BaseServicoJPA<TModelo> servico;

    public BaseRestController(BaseServicoJPA<TModelo> s){
        this.servico = s;
    }

    @GetMapping("")
    public ResponseEntity<List<TModelo>> getAll(){
        List<TModelo> td = this.servico.Browse();
        
        if(td.size() == 0)
            return new ResponseEntity<>(td, HttpStatus.NO_CONTENT);
        else
            return new ResponseEntity<>(td, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<TModelo> getById(@PathVariable Long id){        
        Optional<TModelo> opt = this.servico.Read(id);
        
        if(opt.isPresent()){
            return new ResponseEntity<>(opt.get(), HttpStatus.OK);
        }else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("")
    public ResponseEntity<TModelo> post(@RequestBody TModelo td) {
        TModelo tdnew = this.servico.Add(td);
        return new ResponseEntity<>(tdnew, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<TModelo> put(@PathVariable Long id, @RequestBody TModelo td){
        TModelo opt = this.servico.Edit(id, td);
        if(opt != null){
            return new ResponseEntity<>(opt, HttpStatus.OK);
        }else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<TModelo> delete(@PathVariable Long id){
        TModelo opt = this.servico.Delete(id);
        if(opt != null){
            return new ResponseEntity<>(opt, HttpStatus.NO_CONTENT);
        }else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

}
