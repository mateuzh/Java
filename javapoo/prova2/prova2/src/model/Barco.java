package model;

public class Barco extends Veiculo{
    private int numeroCabine;

    public Barco(int numeroPassagem, float valorPassagem, String horaPartida, String horaRetorno, int numeroCabine) {
        super(numeroPassagem, valorPassagem, horaPartida, horaRetorno);
        this.numeroCabine = numeroCabine;
    }

    public int getNumeroCabine() {
        return numeroCabine;
    }

    public void setNumeroCabine(int numeroCabine) {
        this.numeroCabine = numeroCabine;
    }

    @Override
    public String toString() {
        return "Barco [numeroCabine=" + numeroCabine + "]";
    }

    
}
