package com.model;

public class ContatoComercial extends ContatoTelefonico{
    private String nomeDaEmpresa;

    public ContatoComercial(int codPais, int ddd, int numero, String nomeDaEmpresa) {
        super(codPais, ddd, numero);
        this.nomeDaEmpresa = nomeDaEmpresa;
    }

    @Override
    public int ligar(){
        int numeroCompleto = getCodPais() + getDdd() + getNumero();
        return numeroCompleto;
    }

    public String getNomeDaEmpresa() {
        return nomeDaEmpresa;
    }

    public void setNomeDaEmpresa(String nomeDaEmpresa) {
        this.nomeDaEmpresa = nomeDaEmpresa;
    }

    @Override
    public String toString() {
        return "ContatoComercial [nomeDaEmpresa=" + nomeDaEmpresa + "id=" + id + ", codPais=" + codPais + ", ddd=" + ddd + ", numero=" + numero + "]";
    }

    
}
