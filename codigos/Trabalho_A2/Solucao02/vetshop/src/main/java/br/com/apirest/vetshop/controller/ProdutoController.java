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

import br.com.apirest.vetshop.model.Produto;
import br.com.apirest.vetshop.service.ProdutoService;

@RestController
@RequestMapping("/api/vetshop/produtos")
public class ProdutoController {
    
    @Autowired
    private ProdutoService servico;

    public ProdutoController(ProdutoService srv){
        this.servico = srv;
    }

    @GetMapping
    public ResponseEntity<List<Produto>> getAll(){
        List<Produto> cp = this.servico.Browse();
        return new ResponseEntity<>(cp, HttpStatus.OK);
    }

    @GetMapping("/{codigo}")
    public ResponseEntity<Produto> getById(@PathVariable Long codigo){
        Optional<Produto> opt = this.servico.Read(codigo);
        if (opt.isPresent()){
            return new ResponseEntity<>(opt.get(), HttpStatus.OK);
        }
        else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    } 

    @PostMapping
    public ResponseEntity<Produto> post(@RequestBody Produto cp) {
        Produto prdnew = this.servico.Add(cp);
        return new ResponseEntity<>(prdnew, HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<Produto> put(@RequestBody Produto cp){
        Produto prdalt = this.servico.Edit(cp);
        if (prdalt != null){
            return new ResponseEntity<>(prdalt, HttpStatus.OK);
        }
        else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{codigo}")
    public ResponseEntity<Produto> delete(@PathVariable Long codigo){
        Produto prddel = this.servico.Delete(codigo);
        if (prddel != null){
            return new ResponseEntity<>(prddel, HttpStatus.NO_CONTENT);
        }
        else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
