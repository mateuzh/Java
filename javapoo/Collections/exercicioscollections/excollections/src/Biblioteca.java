import java.util.List;

public class Biblioteca {
    private String nome;
    List<Livros> listaDisponiveis;
    
    public Biblioteca(String nome, List<Livros> livrosDisponiveis) {
        this.nome = nome;
        this.listaDisponiveis = livrosDisponiveis;
    }

    public void emprestarLivros(List<Livros> livrosDisponiveis) {
        Clientes cliente = new Clientes("Mateus", livrosDisponiveis);
    }

    public void devolverLivros(List<Livros> livrosDevolvidos){

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Livros> getListaDisponiveis() {
        return listaDisponiveis;
    }

    public void setListaDisponiveis(List<Livros> listaDisponiveis) {
        this.listaDisponiveis = listaDisponiveis;
    }

    @Override
    public String toString() {
        return "Biblioteca [nome=" + nome + ", listaDisponiveis=" + listaDisponiveis + "]";
    }

    
}
