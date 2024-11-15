package br.uniderp.demomanytoone.Service;

import org.springframework.stereotype.Service;

import br.uniderp.demomanytoone.model.Cliente;
import br.uniderp.demomanytoone.repository.IClienteRepository;

import java.util.List;

@Service
public class ClienteService {
    private final IClienteRepository clienteRepository;

    public ClienteService(IClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    public List<Cliente> ListarTodos() {
        return clienteRepository.findAll();
    }

    public Cliente Salvar(Cliente cliente) {
        return clienteRepository.save(cliente);
    }
}
