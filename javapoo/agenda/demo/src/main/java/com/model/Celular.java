package com.model;

import java.io.Serializable;

import javax.persistence.*;


@Entity
public class Celular implements Serializable{
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;
    private String tipo;
    private int codPais, ddd, numero;
    
    public Celular(int codPais, int ddd, int numero) {
        this.codPais = codPais;
        this.ddd = ddd;
        this.numero = numero;
    }

    public Celular(String tipo, int codPais, int ddd, int numero) {
        this.tipo = tipo;
        this.codPais = codPais;
        this.ddd = ddd;
        this.numero = numero;
    }

    public Celular() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCodPais() {
        return codPais;
    }

    public void setCodPais(int codPais) {
        this.codPais = codPais;
    }

    public int getDdd() {
        return ddd;
    }

    public void setDdd(int ddd) {
        this.ddd = ddd;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "| Tipo: " + tipo + "Código do País: " + codPais + "| DDD: " + ddd + "| Número: " + numero + "|";
    }

}