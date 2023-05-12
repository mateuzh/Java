package produtos;

public abstract class Produto {
    protected String nome;
    protected float preco;
    
    public Produto(String nome, float preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String descrever(){
        return "Produto de informática";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    @Override
    public abstract String toString();

    
    
}
