import java.util.Scanner;

import javax.net.ssl.SSLEngineResult.Status;

public class exercicios {
    
    public static float[] entradaValores (float[] valores){
        
        Scanner entrada = new Scanner(System.in);

        System.out.print("Primeiro valor: ");
        valores[0] = entrada.nextFloat();
        System.out.print("Segundo valor: ");
        valores[1] = entrada.nextFloat();

        entrada.close();

        return valores;

        
    }
    public static void main(String[] args) throws Exception{
        
        Scanner teclado = new Scanner(System.in);
        
        Boolean menu = true;

        while(menu){

            System.out.println(
                "MENU INTELIGENTE\n"+ 
                "1 - Verificação de ímpar e par\n" + 
                "2 - Cálculo do IPI\n"+
                "3 - Calculadora\n"+
                "0 - Sair");
            int escolha = teclado.nextInt();
                switch (escolha) {
                case 1:
                    int[] valores = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
                    System.out.println("Você quer ver os valores ímpares ou pares?\n0 - Pares\n1 - Ímpares\nDigite aqui: ");
                    int opcao = teclado.nextInt();
                    System.out.println("------------------");
                    if (opcao == 0) {
                        for (int i : valores) {
                            if(i % 2 == 0){System.out.println(i);}
                        }    
                    }if (opcao == 1) {
                        for (int i2 : valores) {
                            if(i2 % 2 != 0){System.out.println(i2);}
                        }
                    }
                    break;
                case 2:
                    System.out.print("Digite o valor do IPI: ");
                    float ipi = teclado.nextFloat();
            
                    System.out.print("Código do produto: ");
                    int codigoProd1 = teclado.nextInt();
                    System.out.print("Valor do produto por unidade: ");
                    float valorUnitario1 = teclado.nextFloat();
                    System.out.print("Quantidade:");
                    int quantidade1 = teclado.nextInt();
                    
                    System.out.print("Código do produto: ");
                    int codigoProd2 = teclado.nextInt();
                    System.out.print("Valor do produto por unidade: ");
                    float valorUnitario2 = teclado.nextFloat();
                    System.out.print("Quantidade:");
                    int quantidade2 = teclado.nextInt();
            
                    float valorTotal = (valorUnitario1 * quantidade1 + valorUnitario2 * quantidade2) * (ipi/100+1);
            
                    System.out.print(
                        "produto 1 " + codigoProd1 + " -> Valor: " + valorUnitario1 + " Quantidade: " + quantidade1 +
                        "\nproduto 2 " + codigoProd2 + " -> Valor: " + valorUnitario2 + " Quantidade: " + quantidade2 +
                        "\nTotal: R$" + valorTotal 
                    );
                    break;

                case 3:
                    Boolean opcoesCalc = true;
                    while (opcoesCalc) {
                        System.out.print("CALCULADORA\n----------------------\n");
                        System.out.println("1 - Soma\n2 - Divisão\n3 - Subtração\n4 - Multiplicação\n5 - Potenciação \n0 - Sair");
                        System.out.print("-> ");
                        escolha = teclado.nextInt();
            
                        switch (escolha) {
                            case 1:
                                System.out.println("-------------------");
                                System.out.println("SOMAR");
                                float valores[2] = entradaValores();
                                float soma = soma1 + soma2;
                                System.out.println("A soma de "+ soma1 + " + " + soma2 + " foi de: " + soma);
                                break;
                            case 2:
                                System.out.println("-------------------");
                                System.out.println("DIVISÃO");
                                System.out.print("Primeiro valor: ");
                                float divisao1 = teclado.nextFloat();
                                System.out.print("Segundo valor: ");
                                float divisao2 = teclado.nextFloat();
                                while (divisao2 == 0) {
                                    System.out.print("O segundo valor não pode ser zerado\nTente novamente\nSegundo valor: ");
                                    divisao2 = teclado.nextFloat();
                                }
                                float divisao = divisao1 / divisao2;
                                System.out.println("A divisão de " + divisao1 + " por " + divisao2 + " é igual a: "+ divisao);
                                break;
                            case 3:
                                System.out.println("-------------------");
                                System.out.println("SUBTRAÇÃO");
                                System.out.print("Primeiro valor: ");
                                float valor1sub = teclado.nextFloat();
                                System.out.print("Segundo valor: ");
                                float valor2sub = teclado.nextFloat();
                                float subtracao = valor1sub - valor2sub;
                                System.out.println(valor1sub + " menos " + valor2sub + " é igual a: " + subtracao);
                            case 4:
                                System.out.println("-------------------");
                                System.out.println("MULTIPLICAÇÃO");
                                System.out.print("Primeiro valor: ");
                                float multi1 = teclado.nextFloat();
                                System.out.print("Segundo valor: ");
                                float multi2 = teclado.nextFloat();
                                float multiplicacao = multi1 * multi2;
                                System.out.println(multi1 + " X " + multi2 + " = " + multiplicacao);
                                break;
                            case 5:
                                System.out.println("-------------------");
                                System.out.println("POTENCIAÇÃO");
                                System.out.println("Base: ");
                                float base = teclado.nextFloat();
                                System.out.println("Expoente: ");
                                float resultadoPotencia = 0;
                                float expoente = teclado.nextFloat();
                                for (int i = 1; i < expoente+1; i++) {
                                    
                                    if (i == 1 ){resultadoPotencia = i * base;}
                                    else{resultadoPotencia = resultadoPotencia * base;}
                                    
                                }
                                System.out.println(base + " elevado a " + expoente + " é igual a: "+ resultadoPotencia);
                                break;
                            case 0:
                                opcoesCalc = false;
                                break;
                            default:
                                break;
                        }
            
                    }
                    break;
                case 0:
                    menu = false;
                    break;
                default:
                    break;
            }
        }

    }
}
