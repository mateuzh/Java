import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        Produto produto1 = new Produto();
        Funcionario funcionario1 = new Funcionario();

        System.out.print("Digite o nome do 1º produto: ");
        produto1.setNome(entrada.nextLine());
        System.out.print("Digite o preço do "+ produto1.getNome() + ": ");
        produto1.setPreco(entrada.nextDouble());
        System.out.print("Digite a quantidade de estoque do "+ produto1.getNome() + ": ");
        produto1.setQtdEstoque(entrada.nextInt());
        System.out.println(" ");
        System.out.println(produto1.exibirProduto());
        System.out.println(" ");

        while(produto1.getQtdEstoque() > 0)
            {System.out.println("\nDeseja vender quantas unidades: ");
            int quantidade = entrada.nextInt();
            if(quantidade == 0){
                break;
            }else{
                produto1.venderProduto(quantidade);
            }
        }
        entrada.nextLine();
        System.out.println(" ");

        System.out.print("Nome do funcionário: ");
        funcionario1.setNome(entrada.nextLine());
        System.out.print("Cargo do funcionário: ");
        funcionario1.setCargo(entrada.nextLine());   
        System.out.print("Salário do funcionário: R$");
        funcionario1.setSalario(entrada.nextDouble());

        funcionario1.calcularImposto();

        funcionario1.exibirFuncionario();

        Aluno aluno1 = new Aluno("Gustavo", 19, 7, 8);
        aluno1.setMedia(aluno1.calcularMedia(aluno1.getNota1(), aluno1.getNota2()));

        Aluno aluno2 = new Aluno("Bernardo", 20, 9, 2);
        aluno2.setMedia(aluno1.calcularMedia(aluno2.getNota1(), aluno2.getNota2()));

        Aluno aluno3 = new Aluno("José", 22, 2, 0);
        aluno3.setMedia(aluno3.calcularMedia(aluno3.getNota1(), aluno3.getNota2()));

        System.out.println(aluno1.status());
        System.out.println(aluno2.status());
        System.out.println(aluno3.status());

        entrada.close();
    }
}
