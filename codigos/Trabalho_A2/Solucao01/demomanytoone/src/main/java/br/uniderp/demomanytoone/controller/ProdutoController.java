package br.uniderp.demomanytoone.controller;

import org.springframework.web.bind.annotation.*;

import br.uniderp.demomanytoone.Service.ProdutoService;
import br.uniderp.demomanytoone.model.Produto;

import java.util.List;

@RestController
@RequestMapping("/api/demo/produtos")
public class ProdutoController {
    private final ProdutoService produtoService;

    public ProdutoController(ProdutoService produtoService) {
        this.produtoService = produtoService;
    }

    @GetMapping
    public List<Produto> ListarTodos() {
        return produtoService.ListarTodos();
    }

    @PostMapping
    public Produto Salvar(@RequestBody Produto produto) {
        return produtoService.Salvar(produto);
    }
}
