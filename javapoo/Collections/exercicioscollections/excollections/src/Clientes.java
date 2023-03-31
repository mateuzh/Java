import java.util.List;

public class Clientes {
    private String nome;
    List<Livros> listaLivros;
    public Clientes(String nome, List<Livros> listaLivros) {
        this.nome = nome;
        this.listaLivros = listaLivros;
    }

    public Clientes (String nome){
        
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public List<Livros> getListaLivros() {
        return listaLivros;
    }
    public void setListaLivros(List<Livros> listaLivros) {
        this.listaLivros = listaLivros;
    }
    @Override
    public String toString() {
        return "Clientes [nome=" + nome + ", listaLivros=" + listaLivros + "]";
    }
    
    
}
