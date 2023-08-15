package com;

import java.util.Scanner;


import com.controller.PessoaController;
import com.model.*;

public class App 
{
    public static String nomeEmpresa;

    public static void main( String[] args )
    {
        Scanner in = new Scanner(System.in);
        int i, i2, id, codPais, ddd, numeroCel, idParaLigar, tipoContato;    
        String rua, cidade, nome, email;
        Estado estado;
        Boolean menuAlteracao = true;
        Boolean menuPrincipal = true;
        String tabela;

        System.out.println(" ");
        System.out.println("     <-- AGENDA EM JAVA -->\n");
        while(menuPrincipal){
            System.out.println("\n     -=- MENU AGENDA -=-");
            System.out.print("\n+----------------------------+" +
                               "\n| 1 - Inserir Novo Contato   | " +
                               "\n|----------------------------|" +
                               "\n| 2 - Lista de Contatos      | " +
                               "\n|----------------------------|" +
                               "\n| 3 - Procurar Contato       | " +
                               "\n|----------------------------|" +
                               "\n| 4 - Excluir Contato        | " +
                               "\n|----------------------------|" +
                               "\n| 5 - Alterar Contato        | " +
                               "\n|----------------------------|" +
                               "\n| 6 - Ligar para um Contato  | " +
                               "\n|----------------------------|" +
                               "\n| 0 - Sair                   | " +
                               "\n+----------------------------+" +
                               "\nOpção: ");
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
                    System.out.print("Tipo: \n" +
                                     "1 - Comercial\n" + 
                                     "2 - Pessoal\n");
                    tipoContato = in.nextInt();

                    try {
                        if(tipoContato == 1){
                            in.nextLine();
                            System.out.print("Nome da empresa: ");
                            nomeEmpresa = in.nextLine();
                        }else if(tipoContato == 2){
                            in.nextLine();
                            System.out.print("Nome do contato: ");
                            nome = in.nextLine();
                        }
                    } catch (Exception e) {
                        System.out.println(e);
                    }
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
                    estado = Estado.valueOf(in.nextLine().toUpperCase());
                    System.out.println(tipoContato);
                    if(tipoContato == 1){
                        try {
                            PessoaController.salvarPessoa(new Pessoa(nome, email, new Endereco(rua, cidade, estado), new ContatoPessoal(codPais, ddd, numeroCel, nome)));
                        } catch (Exception e) {
                            System.out.println("Erro ao salvar: " + e);
                        }
                    }else if(tipoContato == 2) {
                        try {
                            PessoaController.salvarPessoa(new Pessoa(nome, email, new Endereco(rua, cidade, estado), new ContatoComercial(codPais, ddd, numeroCel, nomeEmpresa)));
                        } catch (Exception e) {
                            System.out.println("Erro ao salvar: " + e);
                        }
                    }
                    break;
                case 2:
                    System.out.println("-=- LISTA DE CONTATOS -=-"); 
                    for (Pessoa p : PessoaController.listarPessoas()) {

                        tabela = "+---------------------------------------------------------------------------------------------------------+\n";
                        tabela += String.format("| Contato: %-3s | Nome: %-30s | E-mail: %-20s \n", p.getId(), p.getNome(), p.getEmail());
                        tabela += "|_________________________________________________________________________________________________________|\n";
                        tabela += String.format("| Endereço: Rua: %-30s | Cidade: %-20s | Estado: %-3s \n", p.getEndereco().getRua(), p.getEndereco().getCidade(), p.getEndereco().getEstado());
                        tabela += "|_________________________________________________________________________________________________________|\n";
                        tabela += String.format("| Contato:  Celular: +%-2s (%-3s) %-15s \n", p.getCelular().getCodPais(), p.getCelular().getDdd(), p.getCelular().getNumero());
                        tabela += "+---------------------------------------------------------------------------------------------------------+";

                        System.out.println(tabela);
                    }                 
                    break;
                case 3:
                    in.nextLine();
                    System.out.println("--> PESQUISA POR ID <--");
                    System.out.print("Id: ");
                    id = in.nextInt(); 
                    System.out.print("Buscando contato...\n");
                    for (int j = 0; j < 4; j++) {
                        try {
                            Thread.sleep(200);
                        } catch (Exception e) {
                            System.out.println(e);
                        }
                    }
                    tabela = "+---------------------------------------------------------------------------------------------------------+\n";
                    tabela += String.format("| Contato: %-3s | Nome: %-30s | E-mail: %-20s \n", PessoaController.pessoaPorId(id).getId(), PessoaController.pessoaPorId(id).getNome(), PessoaController.pessoaPorId(id).getEmail());
                    tabela += "|_________________________________________________________________________________________________________|\n";
                    tabela += String.format("| Endereço: Rua: %-30s | Cidade: %-20s | Estado: %-3s \n", PessoaController.pessoaPorId(id).getEndereco().getRua(), PessoaController.pessoaPorId(id).getEndereco().getCidade(), PessoaController.pessoaPorId(id).getEndereco().getEstado());
                    tabela += "|_________________________________________________________________________________________________________|\n";
                    tabela += String.format("| Contato:  Celular: +%-2s (%-3s) %-15s \n", PessoaController.pessoaPorId(id).getCelular().getCodPais(), PessoaController.pessoaPorId(id).getCelular().getDdd(), PessoaController.pessoaPorId(id).getCelular().getNumero());
                    tabela += "+---------------------------------------------------------------------------------------------------------+";

                    System.out.println(tabela);                
                    break;
                case 4:
                    System.out.print("--> EXCLUIR CONTATO <--\n ");
                    for (Pessoa p : PessoaController.listarPessoas()) {

                        tabela = "+---------------------------------------------------------------------------------------------------------+\n";
                        tabela += String.format("| Contato: %-3s | Nome: %-30s | E-mail: %-20s \n", p.getId(), p.getNome(), p.getEmail());
                        tabela += "|_________________________________________________________________________________________________________|\n";
                        tabela += String.format("| Endereço: Rua: %-30s | Cidade: %-20s | Estado: %-3s \n", p.getEndereco().getRua(), p.getEndereco().getCidade(), p.getEndereco().getEstado());
                        tabela += "|_________________________________________________________________________________________________________|\n";
                        tabela += String.format("| Contato:  Celular: +%-2s (%-3s) %-15s \n", p.getCelular().getCodPais(), p.getCelular().getDdd(), p.getCelular().getNumero());
                        tabela += "+---------------------------------------------------------------------------------------------------------+";

                        System.out.println(tabela);
                    }
                    System.out.print("\nId: ");
                                       
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
                                System.out.print("--> Tipo \n" +
                                                 "1 - Comercial" +
                                                 "2 - Pessoal");
                                tipoContato = in.nextInt();
                                if(tipoContato == 1){
                                    System.out.print("Nome do contato: ");
                                    nome = in.nextLine();
                                }else if(tipoContato == 2){
                                    System.out.print("Nome da empresa:");
                                    nomeEmpresa = in.nextLine();
                                }
                                System.out.print("--> Codígo do País: ");
                                codPais = in.nextInt();
                                System.out.print("--> Cidade: ");
                                ddd = in.nextInt();
                                System.out.print("--> Numero: ");
                                numeroCel = in.nextInt();


                                if(tipoContato == 1){
                                    try {
                                        PessoaController.pessoaPorId(id).getCelular().setCodPais(codPais);
                                        PessoaController.pessoaPorId(id).getCelular().setDdd(ddd);
                                        PessoaController.pessoaPorId(id).getCelular().setNumero(numeroCel);
                                    } catch (Exception e) {
                                        System.out.println("Erro ao salvar contato! " + e);
                                    }
                                }else if(tipoContato == 2){
                                    try {
                                        PessoaController.pessoaPorId(id).getCelular().setCodPais(codPais);
                                        PessoaController.pessoaPorId(id).getCelular().setDdd(ddd);
                                        PessoaController.pessoaPorId(id).getCelular().setNumero(numeroCel);
                                    } catch (Exception e) {
                                        System.out.println("Erro ao salvar contato! " + e);
                                    }
                                }
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
                case 6:
                    System.out.println("-=- LIGANDO PARA UM CONTATO -=-");
                    System.out.print("Digite o ID: ");
                    idParaLigar = in.nextInt();
                    for (int j = 0; j < 3; j++) {
                        System.out.println("Ligando para o número: +" +PessoaController.pessoaPorId(idParaLigar).getCelular().ligar());
                        try {
                            Thread.sleep(3000);
                        } catch (Exception e) {
                            System.out.println(e);
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
