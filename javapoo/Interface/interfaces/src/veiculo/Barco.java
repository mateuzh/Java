package veiculo;

public class Barco implements Veiculo{
    private String modelo, cor, tipo;
   
    public Barco(String modelo, String cor, String tipo) {
        this.modelo = modelo;
        this.cor = cor;
        this.tipo = tipo;
    }    

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String ligar(){
        return "O barco está ligado!";
    };

    public String desligar(){
        return "O barco está desligado!";
    };

    public String acelerar(){
        return "O barco está acelerando!";
    };

    public String frear(){
        return "O barco está freando!";
    }

    @Override
    public String toString() {
        return "Barco [modelo=" + modelo + ", cor=" + cor + ", tipo=" + tipo + "]";
    }

}
