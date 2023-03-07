import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);

        /*
        System.out.print("CALCULADORA\n----------------------\n");
        System.out.println("1 - Soma\n2 - Divisão\n3 - Subtração\n4 - Multiplicação\n5 - Potenciação\n0 - Sair");
        System.out.print("-> ");
        int escolha = teclado.nextInt();
         */
        int escolha = 9;

        while (escolha != 0) {
            System.out.print("CALCULADORA\n----------------------\n");
            System.out.println("1 - Soma\n2 - Divisão\n3 - Subtração\n4 - Multiplicação\n5 - Potenciação \n0 - Sair");
            System.out.print("-> ");
            escolha = teclado.nextInt();

            switch (escolha) {
                case 1:
                    System.out.println("-------------------");
                    System.out.println("SOMAR");
                    System.out.print("Primeiro valor: ");
                    float soma1 = teclado.nextFloat();
                    System.out.print("Segundo valor: ");
                    float soma2 = teclado.nextFloat();
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
                default:
                    break;
            }

        }
        teclado.close();
    }
}
