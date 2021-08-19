package petshop.PetShop.modulos.remedio.model;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
public class remedio implements Serializable {

    private static final long serialVersionUID = -299569408537971270L;


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_remedio")
    private int id;

    private String nome;
    private String composicao;
    private String dosagem;
    private String laboratorio;
    private LocalDate validade;

    private String descricao;


    public remedio(int id, String nome, String composicao, String dosagem, String laboratorio, LocalDate validade, String descricao) {
        this.id = id;
        this.nome = nome;
        this.composicao = composicao;
        this.dosagem = dosagem;
        this.laboratorio = laboratorio;
        this.validade = validade;
        this.descricao = descricao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getComposicao() {
        return composicao;
    }

    public void setComposicao(String composicao) {
        this.composicao = composicao;
    }

    public String getDosagem() {
        return dosagem;
    }

    public void setDosagem(String dosagem) {
        this.dosagem = dosagem;
    }

    public String getLaboratorio() {
        return laboratorio;
    }

    public void setLaboratorio(String laboratorio) {
        this.laboratorio = laboratorio;
    }

    public LocalDate getValidade() {
        return validade;
    }

    public void setValidade(LocalDate validade) {
        this.validade = validade;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
