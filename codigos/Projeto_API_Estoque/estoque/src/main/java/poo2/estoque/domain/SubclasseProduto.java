package poo2.estoque.domain;

import java.time.LocalDate;

import jakarta.persistence.Entity;

@Entity
public class SubclasseProduto extends BaseIdentificador {
    private Long codigoClasse;

    public Long getCodigoClasse() {
        return codigoClasse;
    }

    public void setCodigoClasse(Long codigoClasse) {
        this.codigoClasse = codigoClasse;
    }
    
    public SubclasseProduto(){

    }

    public SubclasseProduto(Long codigo, String descricao, LocalDate dataInclusao, Long codigoClasse) {
        super(codigo, descricao, dataInclusao);
        this.codigoClasse = codigoClasse;
    }
}
