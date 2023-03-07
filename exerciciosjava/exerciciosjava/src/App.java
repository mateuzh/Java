import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        int[] valores = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("Você quer ver os valores ímpares ou pares?\n0 - Pares\n1 - Ímpares\nDigite aqui: ");
        int escolha = entrada.nextInt();
        System.out.println("------------------");
        if (escolha == 0) {
            for (int i : valores) {
                if(i % 2 == 0){
                    System.out.println(i);
                }
            }    
        }if (escolha == 1) {
            for (int i2 : valores) {
                if(i2 % 2 != 0){
                    System.out.println(i2);
                }
            }
        }
        
        entrada.close();
    }
}
