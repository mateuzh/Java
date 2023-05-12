package produtos;

public class Celular extends Produto{
    private String modelo;
    private int numero;

    public Celular(String nome, String marca, float preco, int numero, String modelo) {
        super(nome, marca, preco);
        this.numero = numero;
        this.modelo = modelo;
    }  

    public void calcularDesconto(){
        preco -= 10;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "nome=" + nome + ", marca=" + marca + ", preco=" + preco +
        "Celular: \nNome: " + nome + "\nMarca: " + marca + 
        "\nPreço: R$" + preco + "\nNumero: " + numero + "\nModelo: " + modelo;
    }

    
}
