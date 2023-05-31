import java.util.Scanner;

import controller.*;
import model.*;

public class App {
    
    public static void main(String[] args) throws Exception {
        Boolean condicional = true;
        int usuario;
        int matriculaUsuario, codigoLivro, modoPesquisa, tipoRelatorio;
        Scanner in = new Scanner(System.in);
        Biblioteca biblioteca = new Biblioteca();
        
        LivroController livros_c = new LivroController();
        UsuarioController usuarios_c = new UsuarioController();   
        EmprestimoController emprestimos_c = new EmprestimoController();     
        
        
        livros_c.salvarLivro(new Livro("ESSENCIALISMO", "GREG MCKEOWN", 2014, 10, 0, CategoriaLivro.COMPORTAMENTO));
        livros_c.salvarLivro(new Livro("O PODER DO HABITO", "CHARLES DUHIGG", 2012, 20, 1, CategoriaLivro.COMPORTAMENTO));
        livros_c.salvarLivro(new Livro("A MARCA DA VITORIA", "PHILL KNIGHT", 2017, 30, 2, CategoriaLivro.BIOGRAFIA));

        usuarios_c.cadastrarUsuario(new Usuario("José Carlos", "Alameda Qualquer", "jose@gmail.com", 987654321, 0));
        usuarios_c.cadastrarUsuario(new Usuario("Daniel Silva", "Rua Miguel", "dsilva@gmail.com", 999876543, 1));
        usuarios_c.cadastrarUsuario(new Usuario("Pedro Marcos", "Avenida das Torres", "pedrom@gmail.com", 998765432, 2));

        biblioteca.setLivros(livros_c);
        biblioteca.setUsuarios(usuarios_c);
        biblioteca.setEmprestimos(emprestimos_c);

        System.out.println(biblioteca.getUsuarios());

        
        
        
        

        
        System.out.println("<- BEM-VINDO À BIBLIOTECA ->" + "\n");        
        try {
            while (condicional == true) {
                System.out.print("--> Escolha a opção do que deseja fazer:" +
                                    "\n1 - Cadastro de um novo livro:" +
                                    "\n2 - Pesquisar livro:" +
                                    "\n3 - Cadastrar um novo usuário" +
                                    "\n4 - Emprestimo de livros" +
                                    "\n5 - Devolução de livros" + 
                                    "\n6 - Relatórios" +
                                    "\n0 - Finalizar o programa" +
                                    "\nEscolha: ");
                                    usuario = in.nextInt();
                                    
                System.out.println(" ");
                switch (usuario) {
                    //Cadastrando um livro
                    case 1:
                        Livro newBook = new Livro();
                        System.out.print("Cadastro de Novos Livros: \n");
                        in.nextLine();
                        System.out.print("Titulo: ");
                        newBook.setTitulo(in.nextLine().toUpperCase());
                        System.out.print("Autor: ");
                        newBook.setAutor(in.nextLine().toUpperCase());
                        System.out.print("Ano de publicação: ");
                        newBook.setAnoPublicacao(in.nextInt());
                        System.out.print("Exemplares disponíveis: ");
                        newBook.setExemplaresDisponiveis(in.nextInt());
                        System.out.print("Código: ");
                        newBook.setCodigo(in.nextInt());
                        in.nextLine();
                        System.out.print("Categoria: ");
                        newBook.setCategoria(CategoriaLivro.valueOf(in.nextLine().toUpperCase()));
                        try {
                            livros_c.salvarLivro(newBook);
                            System.out.println("Salvou com sucesso!");
                            Salvar.salvarLivros(livros_c);
                            System.out.println("Salvou no arquivo!");
                        } catch (Exception e) {
                            System.out.println("Erro: " + e);
                        }
                        break;
                    case 2: 
                        //Pesquisando um livro                       
                        System.out.println("Escolha como quer localizar o livro:"+
                                           "\n1 - Título"+
                                           "\n2 - Código" +
                                           "\n3 - Autor" +
                                           "\n4 - Categoria");
                        modoPesquisa = in.nextInt();
                        switch (modoPesquisa) {
                            case 1:
                                in.nextLine();
                                System.out.print("Informe o Título: ");
                                System.out.println(livros_c.porTitulo(in.nextLine().toUpperCase()));
                                break;
                            case 2:
                                in.nextLine();
                                System.out.print("Informe o Código: ");
                                System.out.println(livros_c.porCodigo(in.nextInt()));
                                break;
                            case 3:
                                in.nextLine();
                                System.out.print("Informe o Autor: ");
                                System.out.println(livros_c.porAutor(in.nextLine().toUpperCase()));
                                break;
                            case 4:
                                in.nextLine();
                                System.out.print("Informe a Categoria: ");
                                System.out.println(livros_c.porCategoria(CategoriaLivro.valueOf(in.nextLine().toUpperCase())));
                                break;
                            default:
                                System.out.println("Algo deu errado! Tente novamente.");
                                break;
                        }
                        break;
                    case 3:
                        //Cadastrando um usuário
                        in.nextLine();
                        Usuario newUser = new Usuario();
                        System.out.print("Cadastro de Novos Usuários: \nNome: ");
                        newUser.setNome(in.nextLine());
                        System.out.print("Endereço: ");
                        newUser.setEndereco(in.nextLine());
                        System.out.print("E-mail: ");
                        newUser.setEmail(in.nextLine());
                        System.out.print("Telefone: ");
                        newUser.setTelefone(in.nextInt());
                        in.nextLine();
                        System.out.print("Matricula: ");
                        newUser.setMatricula(in.nextInt());

                        try {
                            usuarios_c.cadastrarUsuario(newUser);
                            biblioteca.setUsuarios(usuarios_c);
                            System.out.println("Usuario cadastrado na biblioteca com sucesso!");
                        } catch (Exception e) {
                            System.out.println("Erro: " + e);
                        }
                        
                        break;
                    case 4:
                        //Emprestando um livro
                        System.out.print(("Informe a matrícula do usuário: "));
                        matriculaUsuario = in.nextInt();
                        if(usuarios_c.porMatricula(matriculaUsuario) == null){
                            System.out.println("O usuário não consta na base de dados!");
                            break;
                        }

                        System.out.print("Informe o código do livro: ");
                        codigoLivro = in.nextInt();
                        if(livros_c.porCodigo(codigoLivro) == null){
                            System.out.println("O código informado não consta na base de dados!");
                            break;
                        }

                        try {
                            biblioteca.emprestar(new EmprestimoLivro(usuarios_c.porMatricula(matriculaUsuario), livros_c.porCodigo(codigoLivro)));
                            System.out.println("Livro emprestado com sucesso");
                        } catch (Exception e) {
                            System.out.println("Erro ao emprestar o livro "+ e);
                        }
                        break;
                    case 5:
                        //Devolver o livro
                        System.out.print(("Informe a matrícula do usuário: "));  
                        matriculaUsuario = in.nextInt();                      
                        if(usuarios_c.porMatricula(matriculaUsuario) == null){
                            System.out.println("O usuário não consta na base de dados!");
                            break;
                        }    

                        try {
                            biblioteca.devolverLivro(biblioteca.getUsuarios().porMatricula(matriculaUsuario));
                            System.out.println("Livro devolvido com sucesso");
                        } catch (Exception e) {
                            System.out.println("Erro ao devolver o livro "+ e);
                        }
                        break;
                    case 6:
                        //Escolhendo os relatórios
                        System.out.print("Escolha o relatório: \n"+
                                           "1 - Livros emprestados \n"+
                                           "2 - Usuários com atraso \n"+
                                           "3 - Livros mais populares\n"+
                                           "4 - Relatório de empréstimos\n"+
                                           "5 - Ver todos os livros\n" +
                                           "Escolha: ");
                        tipoRelatorio = in.nextInt();
                        switch (tipoRelatorio) {
                            case 1:
                                System.out.println(biblioteca.getEmprestimos());
                                break;
                            case 3:
                                System.out.println(livros_c.maisEmprestados());
                                break;
                            case 5:
                                System.out.println(" ");
                                System.out.println(biblioteca.getLivros().getLivros());
                                
                                break;
                            
                            default:
                                break;
                        }
                        break;
                    case 999:
                        System.out.println(biblioteca);
                    case 0:
                        condicional = false;
                        break;
                    default:
                        System.out.println("Ops, algo saiu errado! Tente novamente!");
                        break;
                }
            System.out.println("\n");
            }
        } catch (Exception e) {
            System.out.println("Algo deu errado! Tente novamente!");
        }
    }
}