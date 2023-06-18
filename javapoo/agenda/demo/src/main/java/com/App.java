package com;

import java.util.Scanner;

import javax.swing.SpinnerDateModel;

import com.controller.PessoaController;
import com.model.*;

public class App 
{

    public static void main( String[] args )
    {
        Scanner in = new Scanner(System.in);
        int i, i2, id, codPais, ddd, numeroCel;    
        String rua, cidade, nome, email, tipoContato;
        Boolean menuAlteracao = true;
        Boolean menuPrincipal = true;

        System.out.println("<-- AGENDA EM JAVA -->\n");
        while(menuPrincipal){
            System.out.println("\n-=- MENU AGENDA -=-");
            System.out.println("1 - Inserir Novo Contato" +
                               "\n2 - Lista de Contatos" +
                               "\n3 - Procurar Contato " +
                               "\n4 - Excluir Contato " +
                               "\n5 - Alterar Contato " +
                               "\n0 - Sair");
            i = in.nextInt();
            switch(i){
                case 1:
                    in.nextLine();
                    System.out.println(" ");
                    System.out.println("=-= INSERINDO NOVO CONTATO =-=");
                    System.out.println("Identificação: ");
                    System.out.print("-->Nome: ");
                    nome = in.nextLine();
                    System.out.print("-->E-mail: ");
                    email = in.nextLine();

                    System.out.println(" ");
                    System.out.println("Contato: ");
                    System.out.print("Tipo: ");
                    tipoContato = in.nextLine();
                    System.out.print("Código do País: ");
                    codPais = in.nextInt();
                    System.out.print("DDD: ");
                    ddd = in.nextInt();
                    System.out.print("Número: ");
                    numeroCel = in.nextInt();
                    

                    in.nextLine();
                    System.out.println(" ");
                    System.out.print("Endereço-> Rua: ");
                    rua = in.nextLine();
                    System.out.print("Endereço-> Cidade: ");
                    cidade = in.nextLine();
                    System.out.print("Endereço-> Estado: ");
                    Estado estado = Estado.valueOf(in.nextLine().toUpperCase());

                    try {
                        PessoaController.salvarPessoa(new Pessoa(nome, email, new Endereco(rua, cidade, estado), new Celular(tipoContato, codPais, ddd, numeroCel)));
                    } catch (Exception e) {
                        System.out.println("Erro ao salvar: " + e);
                    }
                    break;
                case 2:
                    System.out.println("-=- LISTA DE CONTATOS -=-"); 
                    for (Pessoa p : PessoaController.listarPessoas()) {
                        System.out.println(p);
                    }                 
                    break;
                case 3:
                    in.nextLine();
                    System.out.println("--> PESQUISA POR ID <--");
                    System.out.print("Id: ");
                    System.out.print(PessoaController.pessoaPorId(in.nextInt()));                  
                    break;
                case 4:
                    System.out.print("--> EXCLUIR CONTATO <--\n " + 
                                       PessoaController.listarPessoas() + 
                                       "\nId da Pessoa: ");
                    PessoaController.excluirPessoa(in.nextInt());
                    break;
                case 5:
                    System.out.println("--> ALTERAR CONTATO <--\n");
                    System.out.print("Informe o ID do contato que irá ser alterado: ");
                    id = in.nextInt();
                    while(menuAlteracao){
                        System.out.print("Selecione abaixo o que deseja alterar \n" +
                                         "1 --> Nome \n" + 
                                         "2 --> Email \n" +
                                         "3 --> Endereço \n" +
                                         "4 --> Celular \n" +
                                         "9 --> Salvar Alterações \n" + 
                                         "0 --> Salvar e voltar ao Menu Principal\n" +                                         
                                         "Escolha: ");
                        i2 = in.nextInt();
                        switch(i2){
                            case 1:
                                in.nextLine();
                                System.out.print("Novo nome: ");
                                nome = in.nextLine();
                                PessoaController.pessoaPorId(id).setNome(nome);
                                break;
                            case 2:
                                in.nextLine();
                                System.out.print("Novo Email: ");
                                email = in.nextLine();
                                PessoaController.pessoaPorId(id).setEmail(email);
                                break;
                            case 3:
                                in.nextLine();
                                System.out.print("--> Rua: ");
                                rua = in.nextLine();
                                System.out.print("--> Cidade: ");
                                cidade = in.nextLine();
                                System.out.print("--> Estado: ");
                                estado = Estado.valueOf(in.nextLine().toUpperCase());
                                PessoaController.pessoaPorId(id).getEndereco().setRua(rua);
                                PessoaController.pessoaPorId(id).getEndereco().setCidade(cidade);
                                PessoaController.pessoaPorId(id).getEndereco().setEstado(estado);
                                break;
                            case 4:
                                in.nextLine();
                                System.out.print("--> Tipo");
                                tipoContato = in.nextLine();
                                System.out.print("--> Codígo do País: ");
                                codPais = in.nextInt();
                                System.out.print("--> Cidade: ");
                                ddd = in.nextInt();
                                System.out.print("--> Numero: ");
                                numeroCel = in.nextInt();

                                PessoaController.pessoaPorId(id).getCelular().setCodPais(codPais);
                                PessoaController.pessoaPorId(id).getCelular().setDdd(ddd);
                                PessoaController.pessoaPorId(id).getCelular().setNumero(numeroCel);
                                break;
                            case 9:
                                try {
                                    PessoaController.alterarPessoa(PessoaController.pessoaPorId(id));
                                    System.out.println("Contato alterado com sucesso!");
                                } catch (Exception e) {
                                    System.out.println("Erro ao alterar o contato!" + e);
                                }
                                menuAlteracao = false;
                                break;
                            case 0:
                                try {
                                    PessoaController.alterarPessoa(PessoaController.pessoaPorId(id));
                                    System.out.println("Contato alterado com sucesso!");
                                } catch (Exception e) {
                                    System.out.println("Erro ao alterar o contato!" + e);
                                }
                                menuAlteracao = false;
                                break;
                            default:
                                break;
                        }
                    }
                    break;
                case 0:
                    menuPrincipal = false;
                    break;
            }
        }
        in.close();
    } 
}
