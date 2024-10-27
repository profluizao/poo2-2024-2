package br.com.apirest.vetshop.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.apirest.vetshop.model.Veiculo;
import br.com.apirest.vetshop.service.VeiculoServico;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("api/vetshop/veiculos")
public class VeiculoController {
    
    @Autowired
    private VeiculoServico servico;

    public VeiculoController(VeiculoServico srv){
        this.servico = srv;
    }

    @GetMapping
    public ResponseEntity<List<Veiculo>> getAll() {
        List<Veiculo> lista = this.servico.Browse();
        return new ResponseEntity<>(lista, HttpStatus.OK);
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
}
