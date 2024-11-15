package br.com.apirest.vetshop.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.apirest.vetshop.model.Fornecedor;
import br.com.apirest.vetshop.service.BaseServicoJPA;

@RestController
@RequestMapping("/api/vetshop/fornecedores")
public class FornecedorController extends BaseRestController<Fornecedor> {

    public FornecedorController(BaseServicoJPA<Fornecedor> srv) {
        super(srv);
    }
    
}
