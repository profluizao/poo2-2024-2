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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.apirest.vetshop.model.Proprietario;
import br.com.apirest.vetshop.service.ProprietarioService;

@RestController
@RequestMapping("api/vetshop/proprietarios")
public class ProprietarioController {

    @Autowired
    private ProprietarioService servico;

    public ProprietarioController(ProprietarioService srv){
        this.servico = srv;
    }

    @GetMapping
    public ResponseEntity<List<Proprietario>> getAll(){
        List<Proprietario> cp = this.servico.Browse();
        return new ResponseEntity<>(cp, HttpStatus.OK);
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

    @PostMapping
    public ResponseEntity<Proprietario> post(@RequestBody Proprietario cp) {
        Proprietario catnew = this.servico.Add(cp);
        return new ResponseEntity<>(catnew, HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<Proprietario> put(@RequestBody Proprietario cp){
        Proprietario catalt = this.servico.Edit(cp);
        if (catalt != null){
            return new ResponseEntity<>(catalt, HttpStatus.OK);
        }
        else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{codigo}")
    public ResponseEntity<Proprietario> delete(@PathVariable Long codigo){
        Proprietario catdel = this.servico.Delete(codigo);
        if (catdel != null){
            return new ResponseEntity<>(catdel, HttpStatus.NO_CONTENT);
        }
        else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
