package br.uniderp.demomanytoone.controller;

import org.springframework.web.bind.annotation.*;

import br.uniderp.demomanytoone.Service.PedidoService;
import br.uniderp.demomanytoone.model.Pedido;

import java.util.List;

@RestController
@RequestMapping("/api/demo/pedidos")
public class PedidoController {
    private final PedidoService pedidoService;

    public PedidoController(PedidoService pedidoService) {
        this.pedidoService = pedidoService;
    }

    @GetMapping
    public List<Pedido> ListarTodos() {
        return pedidoService.ListarTodos();
    }

    @PostMapping
    public Pedido Salvar(@RequestBody Pedido pedido) {
        return pedidoService.Salvar(pedido);
    }
}
