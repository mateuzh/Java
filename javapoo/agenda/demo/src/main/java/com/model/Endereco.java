package com.model;

import java.io.Serializable;

import javax.persistence.*;


@Entity
public class Endereco implements Serializable{
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;
    private String rua, cidade;
  
    @Enumerated(EnumType.STRING)
    private Estado estado;

    public Endereco(String rua, String cidade, Estado estado) {
        this.rua = rua;
        this.cidade = cidade;
        this.estado = estado;
    }

    public Endereco(){}

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }    
    public String getRua() {
        return rua;
    }
    public void setRua(String rua) {
        this.rua = rua;
    }
    public String getCidade() {
        return cidade;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Rua: " + rua + "| Cidade: " + cidade + "| Estado: " + estado.getNome() + "|";
    }
    

}