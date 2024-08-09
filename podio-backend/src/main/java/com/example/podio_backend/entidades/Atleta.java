package com.example.podio_backend.entidades;
import org.springframework.cglib.core.Local;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.mongodb.core.mapping.MongoId;
import org.bson.types.Binary;

import java.time.LocalDate;

@Document(collection = "atleta")
public class Atleta {

    public Atleta(Integer id, String nome, String esporte, LocalDate nascimento, Character categoria, String biografia){
        this.idAtleta = id;
        this.esporte = esporte;
        this.nascimento = nascimento;
        this.categoria = categoria;
        this.biografia = biografia;
    }

    @Id
    private Integer idAtleta;

    @Field(name = "nome_atleta")
    private String nomeAtleta;

    @Field(name = "esporte")
    private String esporte;

    @Field(name = "nascimento")
    private LocalDate nascimento;

    @Field(name = "categoria")
    private Character categoria;

    @Field(name = "biografia")
    private String biografia;

//    @Field(name = "foto_atleta")
//    private Binary fotoAtleta;

    // Getters e Setters
    public Integer getIdAtleta() {
        return idAtleta;
    }

    public void setIdAtleta(Integer idAtleta) {
        this.idAtleta = idAtleta;
    }

    public String getNomeAtleta() {
        return nomeAtleta;
    }

    public void setNomeAtleta(String nomeAtleta) {
        this.nomeAtleta = nomeAtleta;
    }

    public String getEsporte() {
        return esporte;
    }

    public void setEsporte(String esporte) {
        this.esporte = esporte;
    }

    public LocalDate getNascimento() {
        return nascimento;
    }

    public void setNascimento(LocalDate nascimento) {
        this.nascimento = nascimento;
    }

    public Character getCategoria() {
        return categoria;
    }

    public void setCategoria(Character categoria) {
        this.categoria = categoria;
    }

    public String getBiografia() {
        return biografia;
    }

    public void setBiografia(String biografia) {
        this.biografia = biografia;
    }

//    public Binary getFotoAtleta() {
//        return fotoAtleta;
//    }
//
//    public void setFotoAtleta(Binary fotoAtleta) {
//        this.fotoAtleta = fotoAtleta;
//    }
}