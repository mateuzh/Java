package com.model;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "cliente")
public class Pessoa implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nome, email;
    
    @OneToOne(cascade = CascadeType.ALL)
    private Endereco endereco;

    @OneToOne(cascade = CascadeType.ALL)
    private Celular celular;   

    public Pessoa(String nome, String email, Endereco endereco, Celular celular) {
        this.nome = nome;
        this.email = email;
        this.endereco = endereco;
        this.celular = celular;
    }    

    public Pessoa(int id, String nome, String email, Endereco endereco, Celular celular) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.endereco = endereco;
        this.celular = celular;
    }

    public Pessoa() {
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Celular getCelular() {
        return celular;
    }

    public void setCelular(Celular celular) {
        this.celular = celular;
    }

    @Override
    public String toString() {
        return "Id - " + id + "| Nome: " + nome + "| E-mail: " + email + "| Endereco: " + endereco + "| |Celular: " + celular + "|";
    }
}
