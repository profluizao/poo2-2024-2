package br.com.apirest.vetshop.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.apirest.vetshop.model.Pedido;
import br.com.apirest.vetshop.service.PedidoServico;

@RestController
@RequestMapping("/api/vetshop/pedidos")
public class PedidoController extends BaseRestController<Pedido> {

    // public PedidoController(BaseServicoJPA<Pedido> srv) {
    //     super(srv);
    // }

    public PedidoController(PedidoServico srv) {
        super(srv);
    }

}
