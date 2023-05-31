package model;

public class Aviao extends Veiculo{
    private float pesoBagagem;

    public Aviao(int numeroPassagem, float valorPassagem, String horaPartida, String horaRetorno, float pesoBagagem) {
        super(numeroPassagem, valorPassagem, horaPartida, horaRetorno);
        this.pesoBagagem = pesoBagagem;
    }

    public float getPesoBagagem() {
        return pesoBagagem;
    }

    public void setPesoBagagem(float pesoBagagem) {
        this.pesoBagagem = pesoBagagem;
    }

    @Override
    public String toString() {
        return "Aviao [pesoBagagem=" + pesoBagagem + "]";
    }

    
}
