package br.com.apirest.vetshop.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Proprietario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    // Relacionamento "um para um" com a entidade Veiculo
    @OneToOne(cascade = CascadeType.ALL)
    // Chave estrangeira para associar Veiculo
    @JoinColumn(name = "veiculo_id")  
    private Veiculo veiculo;

    // Construtores, Getters, Setters
    public Proprietario() {}

    public Proprietario(String nome, Veiculo veiculo) {
        this.nome = nome;
        this.veiculo = veiculo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }    
}
