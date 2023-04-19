import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private String nome;
    List<Livros> listaDisponiveis;
    
    public Biblioteca(String nome, List<Livros> livrosDisponiveis) {
        this.nome = nome;
        this.listaDisponiveis = livrosDisponiveis;
    }
    
    public List<Livros> emprestarLivros(List<Livros> listaEmprestimo) {
        List<Livros> listaVazia = new ArrayList<Livros>();
        for (Livros li : listaEmprestimo) {
            for(int i = 0; i < listaDisponiveis.size(); i++){//.size() retorna o tamanho do Array
                if(li.getNome().equals(listaDisponiveis.get(i).getNome())){
                    if(listaDisponiveis.get(i).getQuantidade() > 0){//listaEmprestimo.get(i).getQuantidade()
                        listaVazia.add(new Livros(li.getNome(), li.getAutor(), li.getGenero()));
                        listaDisponiveis.get(i).setQuantidade(listaDisponiveis.get(i).getQuantidade() - 1);
                }
            }
        }
    }
        return listaVazia;
    }

    public void devolverLivros(List<Livros> livrosDevolvidos){
        for (Livros livros : livrosDevolvidos) {
            for(int i = 0; i < listaDisponiveis.size(); i++){
                if(livros.getNome().equals(listaDisponiveis.get(i).getNome())){
                    listaDisponiveis.get(i).setQuantidade(listaDisponiveis.get(i).getQuantidade() + 1));
                }
            }
        }
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
        return "Biblioteca [nome=" + nome + ", \nlistaDisponiveis=" + listaDisponiveis + "]";
    }

    
}
