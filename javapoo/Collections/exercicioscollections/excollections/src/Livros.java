public class Livros implements Comparable<Livros> {
    private String nome, autor, genero;
    private int quantidade;

    public Livros(String nome, String autor, String genero, int quantidade) {
        this.nome = nome;
        this.autor = autor;
        this.genero = genero;
        this.quantidade = quantidade;
    }

    public int verEstoque(){
        return getQuantidade();
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
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
    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    @Override
    public String toString() {
        return "Livros [nome=" + nome + ", autor=" + autor + ", genero=" + genero + 
        ", quantidade=" + quantidade + "]";
    }
    @Override
    public int compareTo(Livros o) {
        return this.nome.compareTo(o.nome);
    }
    

    
}
