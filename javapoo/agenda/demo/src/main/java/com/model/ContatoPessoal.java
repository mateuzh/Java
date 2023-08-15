package com.model;

public class ContatoPessoal extends ContatoTelefonico{
    private String nome;

    public ContatoPessoal(int codPais, int ddd, int numero, String nome) {
        super(codPais, ddd, numero);
        this.nome = nome;
    }

    @Override
    public int ligar(){
        int numeroCompleto = getCodPais() + getDdd() + getNumero();
        return numeroCompleto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "ContatoPessoal [nome=" + nome + " id=" + id + ", codPais=" + codPais + ", ddd=" + ddd + ", numero=" + numero + "]";
    }

}
