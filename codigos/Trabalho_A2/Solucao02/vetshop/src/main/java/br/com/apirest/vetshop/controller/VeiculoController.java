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

import br.com.apirest.vetshop.model.Veiculo;
import br.com.apirest.vetshop.service.VeiculoService;

@RestController
@RequestMapping("api/vetshop/veiculos")
public class VeiculoController {
    @Autowired
    private VeiculoService servico;

    public VeiculoController(VeiculoService srv){
        this.servico = srv;
    }
    
    @GetMapping
    public ResponseEntity<List<Veiculo>> getAll(){
        List<Veiculo> cp = this.servico.Browse();
        return new ResponseEntity<>(cp, HttpStatus.OK);
    }

    @GetMapping("/{codigo}")
    public ResponseEntity<Veiculo> getById(@PathVariable Long codigo){
        Optional<Veiculo> opt = this.servico.Read(codigo);
        if (opt.isPresent()){
            return new ResponseEntity<>(opt.get(), HttpStatus.OK);
        }
        else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping
    public ResponseEntity<Veiculo> post(@RequestBody Veiculo cp) {
        Veiculo catnew = this.servico.Add(cp);
        return new ResponseEntity<>(catnew, HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<Veiculo> put(@RequestBody Veiculo cp){
        Veiculo catalt = this.servico.Edit(cp);
        if (catalt != null){
            return new ResponseEntity<>(catalt, HttpStatus.OK);
        }
        else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{codigo}")
    public ResponseEntity<Veiculo> delete(@PathVariable Long codigo){
        Veiculo catdel = this.servico.Delete(codigo);
        if (catdel != null){
            return new ResponseEntity<>(catdel, HttpStatus.NO_CONTENT);
        }
        else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
