package produtos;

public class Notebook extends Produto{
    private String processador, memoria;

    public Notebook(String nome, String marca, float preco, String processador, String memoria) {
        super(nome, marca, preco);
        this.processador = processador;
        this.memoria = memoria;
    }

    public void calcularDesconto(){
        preco -= 100;
    }

    public String getProcessador() {
        return processador;
    }

    public void setProcessador(String processador) {
        this.processador = processador;
    }

    public String getMemoria() {
        return memoria;
    }

    public void setMemoria(String memoria) {
        this.memoria = memoria;
    }

    @Override
    public String toString() {
        return "nome=" + nome + ", marca=" + marca + ", preco=" + preco + 
        "Notebook: \nNome: " + nome + "\nMarca: " + marca + 
        "\nPreço: R$" + preco + "\nProcessador: " + processador + "\nMemoria: " + memoria;
    }

     
}
