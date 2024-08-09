package com.example.podio_backend.entidades;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.bson.types.Binary;

public class Esporte {

    @Id
    private Integer idEsporte;

    @Field(name = "simbolo_esporte")
    private String simboloEsporte;

    @Field(name = "descricao")
    private String descricao;

    @Field(name = "icone")
    private Binary icone;

    // Getters e Setters
    public Integer getIdEsporte() {
        return idEsporte;
    }

    public void setIdEsporte(Integer idEsporte) {
        this.idEsporte = idEsporte;
    }

    public String getSimboloEsporte() {
        return simboloEsporte;
    }

    public void setSimboloEsporte(String simboloEsporte) {
        this.simboloEsporte = simboloEsporte;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Binary getIcone() {
        return icone;
    }

    public void setIcone(Binary icone) {
        this.icone = icone;
    }
}

