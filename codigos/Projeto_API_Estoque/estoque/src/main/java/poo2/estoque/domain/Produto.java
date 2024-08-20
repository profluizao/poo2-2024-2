package poo2.estoque.domain;

import java.time.LocalDate;

import jakarta.persistence.Entity;

@Entity
public class Produto extends BaseIdentificador {
    private Long codigoSubclasse;
    private Double valor;
    public Long getCodigoSubclasse() {
        return codigoSubclasse;
    }
    public void setCodigoSubclasse(Long codigoSubclasse) {
        this.codigoSubclasse = codigoSubclasse;
    }
    public Double getValor() {
        return valor;
    }
    public void setValor(Double valor) {
        this.valor = valor;
    }
    public Produto() {
        super();
    }
    public Produto(Long codigo, String descricao, LocalDate dataInclusao, Long codigoSubclasse, Double valor) {
        super(codigo, descricao, dataInclusao);
        this.codigoSubclasse = codigoSubclasse;
        this.valor = valor;
    }
}
