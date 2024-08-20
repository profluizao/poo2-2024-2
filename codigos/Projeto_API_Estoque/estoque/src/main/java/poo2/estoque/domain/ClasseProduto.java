package poo2.estoque.domain;

import java.time.LocalDate;

import jakarta.persistence.Entity;

@Entity
public class ClasseProduto extends BaseIdentificador {
    public ClasseProduto(){
        super();
    }

    public ClasseProduto(Long codigo, String descricao, LocalDate dataInclusao){
        super(codigo, descricao, dataInclusao);
    }
}
