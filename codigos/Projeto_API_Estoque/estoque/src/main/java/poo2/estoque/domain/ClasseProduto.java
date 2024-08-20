package poo2.estoque.domain;

import java.time.LocalDate;

public class ClasseProduto extends BaseIdentificador {
    public ClasseProduto(){
        super();
    }

    public ClasseProduto(Long codigo, String descricao, LocalDate dataInclusao){
        super(codigo, descricao, dataInclusao);
    }
}
