package produtos;

public class Livro extends Produto{
    private String autor, genero;

    public Livro(String nome, float preco, String autor, String genero) {
        super(nome, preco);
        this.autor = autor;
        this.genero = genero;
    }

    @Override
    public String descrever(){
        return "o Livro " + nome + " do autor " + autor + ", de genero " + genero + "custa :" + preco;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Livro [nome=" + nome + "preço=" + preco + 
        "autor=" + autor + ", genero=" + genero + "]";
    }

    
}
