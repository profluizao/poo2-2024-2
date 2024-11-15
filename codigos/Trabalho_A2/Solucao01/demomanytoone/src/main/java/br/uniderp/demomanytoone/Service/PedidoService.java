package br.uniderp.demomanytoone.Service;

import org.springframework.stereotype.Service;

import br.uniderp.demomanytoone.model.Pedido;
import br.uniderp.demomanytoone.repository.IPedidoRepository;

import java.util.List;

@Service
public class PedidoService {
    private final IPedidoRepository pedidoRepository;

    public PedidoService(IPedidoRepository pedidoRepository) {
        this.pedidoRepository = pedidoRepository;
    }

    public List<Pedido> ListarTodos() {
        return pedidoRepository.findAll();
    }

    public Pedido Salvar(Pedido pedido) {
        return pedidoRepository.save(pedido);
    }
}
