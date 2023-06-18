import java.util.Scanner;

import controller.BibliotecaController;
import model.*;


public class App {
    
    public static void main(String[] args) throws Exception {
        Boolean condicional = true;
        int usuario;
        int matriculaUsuario, codigoLivro, modoPesquisa, tipoRelatorio;
        Scanner in = new Scanner(System.in);
        Livro newBook = new Livro();
        Usuario newUser = new Usuario();
        Biblioteca biblioteca = new Biblioteca();
        
        if(BibliotecaController.lerBiblioteca() != null){
            biblioteca = (Biblioteca)BibliotecaController.lerBiblioteca();
        }else{
            BibliotecaController.salvarBiblioteca(biblioteca);
        }

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
                                    "\n7 - Excluir Livro" +
                                    "\n0 - Finalizar o programa" +
                                    "\nEscolha: ");
                                    usuario = in.nextInt();
                                    
                System.out.println(" ");
                switch (usuario) {
                    //Cadastrando um livro
                    case 1:
                        System.out.print("== Cadastro de Novos Livros ==\n");
                        in.nextLine();
                        System.out.print("Titulo: ");
                        newBook.setTitulo(in.nextLine().toUpperCase());
                        System.out.print("Autor: ");
                        newBook.setAutor(in.nextLine().toUpperCase());
                        System.out.print("Ano de publicação: ");
                        newBook.setAnoPublicacao(in.nextInt());
                        System.out.print("Exemplares disponíveis: ");
                        newBook.setExemplaresDisponiveis(in.nextInt());
                        in.nextLine();
                        System.out.print("Categoria: ");
                        newBook.setCategoria(CategoriaLivro.valueOf(in.nextLine().toUpperCase()));
                        try {
                            if(BibliotecaController.lerBiblioteca() != null){
                                biblioteca = (Biblioteca)BibliotecaController.lerBiblioteca();
                                biblioteca.salvarLivro(newBook);
                                BibliotecaController.salvarBiblioteca(biblioteca);
                            }else{
                                biblioteca.salvarLivro(newBook);                             
                                BibliotecaController.salvarBiblioteca(biblioteca);
                            }
                                                   
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
                                System.out.println(biblioteca.porTitulo(in.nextLine().toUpperCase()));
                                break;
                            case 2:
                                in.nextLine();
                                System.out.print("Informe o Código: ");
                                System.out.println(biblioteca.porCodigo(in.nextInt()));
                                break;
                            case 3:
                                in.nextLine();
                                System.out.print("Informe o Autor: ");
                                System.out.println(biblioteca.porAutor(in.nextLine().toUpperCase()));
                                break;
                            case 4:
                                in.nextLine();
                                System.out.print("Informe a Categoria: ");
                                System.out.println(biblioteca.porCategoria(CategoriaLivro.valueOf(in.nextLine().toUpperCase())));
                                break;
                            default:
                                System.out.println("Algo deu errado! Tente novamente.");
                                break;
                        }
                        break;
                    case 3:
                        //Cadastrando um usuário
                        in.nextLine();
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
                            if(BibliotecaController.lerBiblioteca() != null){                                
                                biblioteca = (Biblioteca)BibliotecaController.lerBiblioteca();
                                biblioteca.cadastrarUsuario(newUser);
                                BibliotecaController.salvarBiblioteca(biblioteca);
                            }else{
                                biblioteca.cadastrarUsuario(newUser);                           
                                BibliotecaController.salvarBiblioteca(biblioteca);
                            }
                            
                        } catch (Exception e) {
                            System.out.println("Erro: " + e);
                        }
                        
                        break;
                    case 4:
                        //Emprestando um livro
                        System.out.print(("Informe a matrícula do usuário: "));
                        matriculaUsuario = in.nextInt();
                        if(biblioteca.porMatricula(matriculaUsuario) == null){
                            System.out.println("O usuário não consta na base de dados!");
                            break;
                        }

                        System.out.print("Informe o código do livro: ");
                        codigoLivro = in.nextInt();
                        if(biblioteca.porCodigo(codigoLivro) == null){
                            System.out.println("O código informado não consta na base de dados!");
                            break;
                        }

                        try {
                            biblioteca = (Biblioteca)BibliotecaController.lerBiblioteca();
                            biblioteca.emprestar(new EmprestimoLivro(biblioteca.porMatricula(matriculaUsuario), biblioteca.porCodigo(codigoLivro)));
                            biblioteca.porCodigo(codigoLivro).setExemplaresDisponiveis(biblioteca.porCodigo(codigoLivro).getExemplaresDisponiveis() - 1);;
                            biblioteca.porCodigo(codigoLivro).setVezesEmprestado(biblioteca.porCodigo(codigoLivro).getVezesEmprestado() +1);
                            BibliotecaController.salvarBiblioteca(biblioteca);
                            System.out.println("Livro emprestado com sucesso");
                        } catch (Exception e) {
                            System.out.println("Erro ao emprestar o livro "+ e);
                        }
                        break;
                    case 5:
                        //Devolver o livro
                        System.out.print(("Informe a matrícula do usuário: "));  
                        matriculaUsuario = in.nextInt();                      
                        if(biblioteca.porMatricula(matriculaUsuario) == null){
                            System.out.println("O usuário não consta na base de dados!");
                            break;
                        }    

                        try {
                            biblioteca.devolverLivro(biblioteca.porMatricula(matriculaUsuario));
                            System.out.println("Livro devolvido com sucesso");
                        } catch (Exception e) {
                            System.out.println("Erro ao devolver o livro "+ e);
                        }
                        break;
                    case 6:
                        //Escolhendo os relatórios
                        System.out.print("Escolha o relatório: \n"+
                                           "1 - Livros emprestados \n"+
                                           "2 - Livros mais populares\n"+
                                           "3 - Ver todos os livros\n" +
                                           "Escolha: ");
                        tipoRelatorio = in.nextInt();
                        switch (tipoRelatorio) {
                            case 1:
                                System.out.println(biblioteca.verEmprestimos());
                                break;
                            case 2:
                                System.out.println(biblioteca.maisEmprestados());
                                break;
                            case 3:
                                System.out.println(biblioteca.verLivros());
                                break;
                            default:
                                break;
                        }
                        break;
                    case 7:
                        System.out.println("== Exclusão de livro ==");
                        System.out.print("Informe o código do livro: ");
                        biblioteca.removerLivro(biblioteca.porCodigo(in.nextInt()));
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
        in.close();
    }
}