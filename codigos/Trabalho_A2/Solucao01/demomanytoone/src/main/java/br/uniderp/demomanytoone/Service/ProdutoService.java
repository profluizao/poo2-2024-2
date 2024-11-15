package br.uniderp.demomanytoone.Service;

import org.springframework.stereotype.Service;

import br.uniderp.demomanytoone.model.Produto;
import br.uniderp.demomanytoone.repository.IProdutoRepository;

import java.util.List;

@Service
public class ProdutoService {
    private final IProdutoRepository produtoRepository;

    public ProdutoService(IProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    public List<Produto> ListarTodos() {
        return produtoRepository.findAll();
    }

    public Produto Salvar(Produto produto) {
        return produtoRepository.save(produto);
    }
}
