package br.uniderp.demomanytoone.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.uniderp.demomanytoone.Service.FornecedorService;
import br.uniderp.demomanytoone.model.Fornecedor;

@RestController
@RequestMapping("/api/demo/fornecedores")
public class FornecedorController {
    private final FornecedorService fornecedorService;

    public FornecedorController(FornecedorService fornecedorService) {
        this.fornecedorService = fornecedorService;
    }

    @GetMapping
    public List<Fornecedor> ListarTodos() {
        return this.fornecedorService.ListarTodos();
    }

    @PostMapping
    public Fornecedor salvar(@RequestBody Fornecedor fornecedor) {
        return this.fornecedorService.Salvar(fornecedor);
    }
}
