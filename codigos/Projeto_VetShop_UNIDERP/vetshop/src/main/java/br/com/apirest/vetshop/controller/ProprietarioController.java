package br.com.apirest.vetshop.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.apirest.vetshop.model.Proprietario;
import br.com.apirest.vetshop.service.ProprietarioServico;

@RestController
@RequestMapping("api/vetshop/proprietarios")
public class ProprietarioController {
    @Autowired
    private ProprietarioServico servico;

    public ProprietarioController(ProprietarioServico srv){
        this.servico = srv;
    }

    @GetMapping
    public ResponseEntity<List<Proprietario>> getAll() {
        List<Proprietario> lista = this.servico.Browse();
        return new ResponseEntity<>(lista, HttpStatus.OK);
    }
    
    @GetMapping("/{codigo}")
    public ResponseEntity<Proprietario> getById(@PathVariable Long codigo){
        Optional<Proprietario> opt = this.servico.Read(codigo);
        if (opt.isPresent()){
            return new ResponseEntity<>(opt.get(), HttpStatus.OK);
        }
        else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }    
}
