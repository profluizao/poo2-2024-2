package br.uniderp.demomanytoone.controller;

import org.springframework.web.bind.annotation.*;

import br.uniderp.demomanytoone.Service.ClienteService;
import br.uniderp.demomanytoone.model.Cliente;

import java.util.List;

@RestController
@RequestMapping("/api/demo/clientes")
public class ClienteController {
    private final ClienteService clienteService;

    public ClienteController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    @GetMapping
    public List<Cliente> listarTodos() {
        return clienteService.ListarTodos();
    }

    @PostMapping
    public Cliente salvar(@RequestBody Cliente cliente) {
        return clienteService.Salvar(cliente);
    }
}
