package poo2.estoque.domain;

import java.time.LocalDate;

public abstract class BaseIdentificador {
    private Long codigo;
    private String descricao;
    private LocalDate dataInclusao;
    public Long getCodigo() {
        return codigo;
    }
    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public LocalDate getDataInclusao() {
        return dataInclusao;
    }
    public void setDataInclusao(LocalDate dataInclusao) {
        this.dataInclusao = dataInclusao;
    }
    public BaseIdentificador() {
    }
    public BaseIdentificador(Long codigo, String descricao, LocalDate dataInclusao) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.dataInclusao = dataInclusao;
    }
}
