package veiculo;

public class Moto implements Veiculo{
    private String modelo;
    private int anoFabri, cilindradas;
 
    public Moto(String modelo, int anoFabri, int cilindradas) {
        this.modelo = modelo;
        this.anoFabri = anoFabri;
        this.cilindradas = cilindradas;
    }   

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnoFabri() {
        return anoFabri;
    }

    public void setAnoFabri(int anoFabri) {
        this.anoFabri = anoFabri;
    }

    public int getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }

    @Override
    public String ligar(){
        return "A moto está ligada!";
    };

    @Override
    public String desligar(){
        return "A moto está desligada!";
    };

    @Override
    public String acelerar(){
        return "A moto está acelerando!";
    };

    @Override
    public String frear(){
        return "A moto está freando!";
    }

    @Override
    public String toString() {
        return "Moto [modelo=" + modelo + ", anoFabri=" + anoFabri + ", cilindradas=" + cilindradas + "]";
    }

    
}
