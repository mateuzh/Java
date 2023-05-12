package veiculo;

public class Carro implements Veiculo{
    private String modelo;
    private int numeroPortas, anoFabri;

        public Carro(String modelo, int numeroPortas, int anoFabri) {
        this.modelo = modelo;
        this.numeroPortas = numeroPortas;
        this.anoFabri = anoFabri;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getNumeroPortas() {
        return numeroPortas;
    }

    public void setNumeroPortas(int numeroPortas) {
        this.numeroPortas = numeroPortas;
    }

    public int getAnoFabri() {
        return anoFabri;
    }

    public void setAnoFabri(int anoFabri) {
        this.anoFabri = anoFabri;
    }

    public String ligar(){
        return "O veículo está ligado!";
    };

    public String desligar(){
        return "O veículo está desligado!";
    };

    public String acelerar(){
        return "O veículo está acelerando!";
    };

    public String frear(){
        return "O veículo está freando!";
    }

    @Override
    public String toString() {
        return "Carro [modelo=" + modelo + ", numeroPortas=" + numeroPortas + ", anoFabri=" + anoFabri + "]";
    };

    

}
