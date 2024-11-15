package br.uniderp.demomanytoone.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.uniderp.demomanytoone.model.Fornecedor;
import br.uniderp.demomanytoone.repository.IFornecedorRepository;

@Service
public class FornecedorService {
    private final IFornecedorRepository fornecedorRepository;

    public FornecedorService(IFornecedorRepository fornecedorRepository) {
        this.fornecedorRepository = fornecedorRepository;
    }

    public List<Fornecedor> ListarTodos() {
        return this.fornecedorRepository.findAll();
    }

    public Fornecedor Salvar(Fornecedor fornecedor) {
        return this.fornecedorRepository.save(fornecedor);
    }
}
