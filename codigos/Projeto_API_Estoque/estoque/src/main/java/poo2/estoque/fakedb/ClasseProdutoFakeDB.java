package poo2.estoque.fakedb;

import java.time.LocalDate;
import java.util.ArrayList;

import poo2.estoque.domain.ClasseProduto;

public class ClasseProdutoFakeDB extends BaseFakeDB<ClasseProduto> {

    public ClasseProdutoFakeDB(){
        super();
    }

    @Override
    protected void preencherLista() {
        if (this.lista == null){
            this.lista = new ArrayList<>();
        }
        this.lista.add(new ClasseProduto(1L, "Carnes", LocalDate.now()));
        this.lista.add(new ClasseProduto(2L, "Bebidas", LocalDate.now()));
        this.lista.add(new ClasseProduto(3L, "Laticínios", LocalDate.now()));
        this.lista.add(new ClasseProduto(4L, "Biscoitos", LocalDate.now()));
        this.lista.add(new ClasseProduto(5L, "Limpeza", LocalDate.now()));
    }    
}