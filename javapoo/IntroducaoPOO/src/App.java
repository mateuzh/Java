import java.rmi.StubNotFoundException;
import java.util.Scanner;

import javax.xml.transform.Source;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        Pessoa pe1 = new Pessoa();
        Livro livro1 = new Livro();
        ContaBancaria conta1 = new ContaBancaria();
        Triangulo tri1 = new Triangulo(0, 0);
        int escolha = 999;

        System.out.println("Apresentando 'Pessoa'");
        pe1.apresentar();
        System.out.println(" ");
        System.out.println("Informações do 'Livro'");
        livro1.informacoes();

        while(escolha != 0){
            System.out.print("Escolha uma das opções abaixo: \n1 - Sacar\n2- Depositar\n3- Ver saldo\n0- Sair\nOpção: ");
            escolha = entrada.nextInt();
            switch (escolha) {
                case 1:
                    conta1.imprimirSaldo();
                    System.out.print("Valor do saque: R$");
                    float valorSaque = entrada.nextFloat();
                    conta1.sacar(valorSaque);
                    System.out.println("Processando saque...");
                    conta1.imprimirSaldo();
                    break;
                case 2:
                    conta1.imprimirSaldo();
                    System.out.print("Valor a depositar: R$");
                    float valorDeposito = entrada.nextFloat();
                    conta1.depositar(valorDeposito);
                    conta1.imprimirSaldo();
                    break;
                case 3:
                    conta1.imprimirSaldo();
                    break;
                default:
                    break;
            }
        }
        System.out.print("Base do triangulo: ");
        tri1.base = entrada.nextFloat();
        System.out.print("Altura do triângulo: ");
        tri1.altura = entrada.nextFloat();
        System.out.println("A área do triângulo com as medidas informadas é: " + tri1.calculoArea());

        Cafeteira cafe = new Cafeteira(10, 100);
        cafe.quantidadeAgua = 100;
        cafe.quantidadeCafe = 10;
        cafe.fazerCafe();
        System.out.println(cafe.status()/);
        
        entrada.close();
    }
}
