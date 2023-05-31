import java.time.LocalDate;

import controller.EmprestimoController;
import controller.LivroController;
import controller.UsuarioController;
import model.*;

public class Biblioteca {  
    private EmprestimoController emprestimos = new EmprestimoController();
    private LivroController livros = new LivroController();
    private UsuarioController usuarios = new UsuarioController();


    public Biblioteca() {
    }    

    public LivroController getLivros() {
        return livros;
    }

    public void setLivros(LivroController livros) {
        this.livros = livros;
    }

    public UsuarioController getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(UsuarioController usuarios) {
        this.usuarios = usuarios;
    }
    
    public EmprestimoController getEmprestimos() {
        return emprestimos;
    }

    public void cadastrarUsuario(Usuario usuario){
        if(usuario != null){
            usuarios.cadastrarUsuario(usuario);
        }
    }

    public void setEmprestimos(EmprestimoController emprestimos) {
        this.emprestimos = emprestimos;
    }
    
    public void emprestar(EmprestimoLivro emprestimo){
        try {
            if(emprestimos.getEmprestimos().isEmpty()){
                emprestimos.adicionarEmprestimo(emprestimo);
                emprestimo.getLivro().setExemplaresDisponiveis(emprestimo.getLivro().getExemplaresDisponiveis() - 1);
                emprestimo.getLivro().setVezesEmprestado(emprestimo.getLivro().getVezesEmprestado() + 1);
            }else{
                if(emprestimo.getLivro().getExemplaresDisponiveis() > 0){
                    for (EmprestimoLivro emprestimoLivro : emprestimos.getEmprestimos()) {
                        if(emprestimoLivro.getUsuario().getNome() != emprestimo.getUsuario().getNome()){
                            emprestimos.adicionarEmprestimo(emprestimo);
                            emprestimo.getLivro().setExemplaresDisponiveis(emprestimo.getLivro().getExemplaresDisponiveis() - 1);
                            emprestimo.getLivro().setVezesEmprestado(emprestimo.getLivro().getVezesEmprestado() + 1);
                            break;
                        }else{
                            if(emprestimoLivro.getDataDevolucao().compareTo(LocalDate.now()) <= 0){
                                emprestimos.adicionarEmprestimo(emprestimo);
                                emprestimo.getLivro().setExemplaresDisponiveis(emprestimo.getLivro().getExemplaresDisponiveis() - 1);
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

    public void devolverLivro(Usuario usuario){
        for (EmprestimoLivro emprestimoLivro : emprestimos.getEmprestimos()) {
            if(emprestimoLivro.getUsuario() == usuario){
                emprestimoLivro.getLivro().setExemplaresDisponiveis(emprestimoLivro.getLivro().getExemplaresDisponiveis()+1);
                emprestimoLivro.setDevolvido(true);
                emprestimoLivro.setDevolvidoDia(LocalDate.now());
            }
        }
    }

    @Override
    public String toString() {
        return  "\nBiblioteca "+ 
                "\nLista de empréstimos: " + emprestimos.getEmprestimos() + 
                "\nLista de usuários: " + usuarios.getUsuarios() +
                "\nLista de livros: " + livros.getLivros();
    }   
}