package model;

public class Hospedagem {
    private String nomeHotel;
    private int qtdeQuartosReservados, qtdePessoas;
    private float valorPorPessoa;
    
    public Hospedagem(String nomeHotel, int qtdeQuartosReservados, int qtdePessoas, float valorPorPessoa) {
        this.nomeHotel = nomeHotel;
        this.qtdeQuartosReservados = qtdeQuartosReservados;
        this.qtdePessoas = qtdePessoas;
        this.valorPorPessoa = valorPorPessoa;
    }

    public String getNomeHotel() {
        return nomeHotel;
    }

    public void setNomeHotel(String nomeHotel) {
        this.nomeHotel = nomeHotel;
    }

    public int getQtdeQuartosReservados() {
        return qtdeQuartosReservados;
    }

    public void setQtdeQuartosReservados(int qtdeQuartosReservados) {
        this.qtdeQuartosReservados = qtdeQuartosReservados;
    }

    public int getQtdePessoas() {
        return qtdePessoas;
    }

    public void setQtdePessoas(int qtdePessoas) {
        this.qtdePessoas = qtdePessoas;
    }

    public float getValorPorPessoa() {
        return valorPorPessoa;
    }

    public void setValorPorPessoa(float valorPorPessoa) {
        this.valorPorPessoa = valorPorPessoa;
    }

    @Override
    public String toString() {
        return "Hospedagem [nomeHotel=" + nomeHotel + ", qtdeQuartosReservados=" + qtdeQuartosReservados
                + ", qtdePessoas=" + qtdePessoas + ", valorPorPessoa=" + valorPorPessoa + "]";
    }

    
}
