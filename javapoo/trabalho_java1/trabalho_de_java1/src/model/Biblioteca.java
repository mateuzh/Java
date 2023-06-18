package model;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Biblioteca implements Serializable{  
    private List<EmprestimoLivro> emprestimos = new ArrayList<EmprestimoLivro>();
    private List<Livro> livros = new ArrayList<Livro>();
    private List<Usuario> usuarios = new ArrayList<Usuario>();

    public Biblioteca(List<EmprestimoLivro> emprestimos, List<Livro> livros, List<Usuario> usuarios) {
        this.emprestimos = emprestimos;
        this.livros = livros;
        this.usuarios = usuarios;
    }    

    public Biblioteca() {
    }

    public void salvarLivro(Livro livro){
        if(livro != null){
            if(livros.size() == 0){
                livros.add(livro);
                livro.setCodigo(livros.size());
            }else{
                livros.add(livro);
                livro.setCodigo(livros.size());
            }
            
        }
    }

    public List<EmprestimoLivro> verEmprestimos() {
        return emprestimos;
    }

    public List<Livro> maisEmprestados(){
        List<Livro> livrosOrdenados = new ArrayList<Livro>();
        livros.sort(Comparator.comparing(Livro::getVezesEmprestado));
        for (int i = livros.size(); i > 0; i--) {
            livrosOrdenados.add(livros.get(i-1));
        }
        return livrosOrdenados;        
    }

    public Livro porCodigo(int codigo){
        for (Livro livro : livros) {
            if(livro.getCodigo() == codigo){
                return livro;
            }
        }
        return null;
    }

    public Livro porTitulo(String titulo){
        for (Livro livro : livros) {
            if(livro.getTitulo().equals(titulo)){
                return livro;
            }
        }
        return null;
    }

    public Livro porAutor(String autor){
        for (Livro livro : livros) {
            if(livro.getAutor().equals(autor)){
                return livro;
            }
        }
        return null;
    }

    public Livro porCategoria(CategoriaLivro categoria){
        for (Livro livro : livros) {
            if(livro.getCategoria() == categoria){
                return livro;
            }
        }
        return null;
    }

    public void removerLivro(Livro removerLivro){
        if(removerLivro != null){
            livros.remove(removerLivro);
        }
    }
    
    public void emprestar(EmprestimoLivro emprestimo){
        try {
            if(emprestimos.isEmpty()){
                emprestimos.add(emprestimo);
            }else{
                if(emprestimo.getLivro().getExemplaresDisponiveis() > 0){
                    for (EmprestimoLivro emprestimoLivro : emprestimos) {
                        if(emprestimoLivro.getUsuario().getNome() != emprestimo.getUsuario().getNome()){
                            emprestimos.add(emprestimo);
                            break;
                        }else{
                            if(emprestimoLivro.getDataDevolucao().compareTo(LocalDate.now()) <= 0){
                                emprestimos.add(emprestimo);
                                break;
                            }
                        }
                    }
                }
            }
            
        } catch (Exception e) {
            System.out.println("Erro: " + e);
        }
    }  
    
    public void cadastrarUsuario(Usuario adicionarUsuario) {
        if(adicionarUsuario != null && porNome(adicionarUsuario.getNome()) == null){
            usuarios.add(adicionarUsuario);
        }
    }

    public Usuario porNome(String nome){
        for (Usuario usuario : usuarios) {
            if(usuario.getNome() == nome){
                return usuario;
            }
        }
        return null;
    }

    public Usuario porMatricula(int matricula){
        for (Usuario usuario : usuarios) {
            if(usuario.getMatricula() == matricula){
                return usuario;
            }
        }
        return null;
    }

    public void removerUsuario(Usuario removerUsuario){
        if(removerUsuario != null){
            usuarios.remove(removerUsuario);
        }
    }

    public void devolverLivro(Usuario usuario){
        for (EmprestimoLivro emprestimoLivro : emprestimos) {
            if(emprestimoLivro.getUsuario() == usuario){
                emprestimoLivro.getLivro().setExemplaresDisponiveis(emprestimoLivro.getLivro().getExemplaresDisponiveis()+1);
                emprestimoLivro.setDevolvido(true);
                emprestimoLivro.setDevolvidoDia(LocalDate.now());
            }
        }
    }

    public List<Livro> verLivros(){
        return livros;
    }

    public List<EmprestimoLivro> emprestimosAtrasados(){
        List<EmprestimoLivro> listaAtrasados = new ArrayList<EmprestimoLivro>();
        for (EmprestimoLivro emprestimoLivro : emprestimos) {
            if(emprestimoLivro.getDataDevolucao().compareTo(emprestimoLivro.getDataEmprestimo()) < 0){
                listaAtrasados.add(emprestimoLivro);
            }
        }
        return listaAtrasados;
    }

    @Override
    public String toString() {
        return  "\nBiblioteca "+ 
                "\nLista de empréstimos: " + emprestimos + 
                "\nLista de usuários: " + usuarios +
                "\nLista de livros: " + livros;
    }   
}