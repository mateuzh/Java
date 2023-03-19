import java.time.LocalDate;

public class Evento {
    private String nome;
    private LocalDate dataEvento;
    private float precoIngresso;
    private int qtdIngressos, qtdIngressosVendidos;
    
    public Evento(String nome, LocalDate dataEvento, float precoIngresso, int qtdIngressos, int qtdIngressosVendidos){
        this.nome = nome;
        this.dataEvento = dataEvento;
        this.precoIngresso = precoIngresso;
        this.qtdIngressos = qtdIngressos;
        this.qtdIngressosVendidos = qtdIngressosVendidos;
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public LocalDate getDataEvento(){
        return this.dataEvento;
    }

    public void setDataEvento(LocalDate dataEvento){
        this.dataEvento = dataEvento;
    }

    public float getPrecoIngresso(){
        return this.precoIngresso;
    }

    public void setPrecoIngresso(float precoIngresso){
        this.precoIngresso = precoIngresso;
    }

    public int getQtdIngressos(){
        return this.qtdIngressos;
    }

    public void setQtdIngressos(int qtdIngressos){
        this.qtdIngressos = qtdIngressos;
    }

    public int getQtdIngressosVendidos(){
        return this.qtdIngressosVendidos;
    }

    public void setQtdIngressosVendidos(int qtdeIngressosVendidos){
        this.qtdIngressosVendidos = qtdeIngressosVendidos;
    }

    public void venderIngressos(int quantidade){
        if(qtdIngressos >= quantidade){
            this.qtdIngressos -= quantidade;
        }else{
            System.out.println("Quantidade de ingressos disponíveis insuficiente!");
        }
    }

    public float verArrecadacao(){
        return this.qtdIngressosVendidos * precoIngresso;
    }
}
