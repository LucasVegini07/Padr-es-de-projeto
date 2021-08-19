package petshop.PetShop.modulos.vacina.model;


import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
public class vacina implements Serializable {

    private static final long serialVersionUID = -299569408537971270L;


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_vacina")
    private int id;

    private String nome;
    private String composicao;
    private String localAplicacao;
    private LocalDate validade;
    private String lote;
    private String descricao;

    public vacina(){}

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

    public String getLocalAplicacao() {
        return localAplicacao;
    }

    public void setLocalAplicacao(String localAplicacao) {
        this.localAplicacao = localAplicacao;
    }

    public LocalDate getValidade() {
        return validade;
    }

    public void setValidade(LocalDate validade) {
        this.validade = validade;
    }

    public String getLote() {
        return lote;
    }

    public void setLote(String lote) {
        this.lote = lote;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
