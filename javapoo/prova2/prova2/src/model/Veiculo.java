package model;

public abstract class Veiculo {
    private int numeroPassagem;
    private float valorPassagem;
    private String horaPartida, horaRetorno;    

    public Veiculo(int numeroPassagem, float valorPassagem, String horaPartida, String horaRetorno) {
        this.numeroPassagem = numeroPassagem;
        this.valorPassagem = valorPassagem;
        this.horaPartida = horaPartida;
        this.horaRetorno = horaRetorno;
    }

    public int getNumeroPassagem() {
        return numeroPassagem;
    }
    
    public void setNumeroPassagem(int numeroPassagem) {
        this.numeroPassagem = numeroPassagem;
    }
    
    public float getValorPassagem() {
        return valorPassagem;
    }
    
    public void setValorPassagem(float valorPassagem) {
        this.valorPassagem = valorPassagem;
    }
    
    public String getHoraPartida() {
        return horaPartida;
    }
    
    public void setHoraPartida(String horaPartida) {
        this.horaPartida = horaPartida;
    }
    
    public String getHoraRetorno() {
        return horaRetorno;
    }
    
    public void setHoraRetorno(String horaRetorno) {
        this.horaRetorno = horaRetorno;
    }

    @Override
    public String toString() {
        return "Veiculo [numeroPassagem=" + numeroPassagem + ", valorPassagem=" + valorPassagem + ", horaPartida="
                + horaPartida + ", horaRetorno=" + horaRetorno + "]";
    }   
}
