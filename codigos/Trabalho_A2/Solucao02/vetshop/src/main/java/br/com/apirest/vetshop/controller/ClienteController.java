package br.com.apirest.vetshop.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.apirest.vetshop.model.Cliente;
import br.com.apirest.vetshop.service.BaseServicoJPA;

@RestController
@RequestMapping("/api/vetshop/clientes")
public class ClienteController extends BaseRestController<Cliente> {

    public ClienteController(BaseServicoJPA<Cliente> srv) {
        super(srv);
    }
    
}
