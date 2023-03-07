import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) throws Exception {
        
        
        
        Scanner entrada = new Scanner(System.in);

        System.out.print("Código do produto: ");
        int codigoProd1 = entrada.nextInt();
        System.out.print("Valor do produto por unidade: ");
        float valorUnitario1 = entrada.nextFloat();
        System.out.print("Quantidade:");
        int quantidade1 = entrada.nextInt();
        
        System.out.print("Código do produto: ");
        int codigoProd2 = entrada.nextInt();
        System.out.print("Valor do produto por unidade: ");
        float valorUnitario2 = entrada.nextFloat();
        System.out.print("Quantidade:");
        int quantidade2 = entrada.nextInt();
        
        double valorTotal = (valorUnitario1 * quantidade1 + valorUnitario2 * quantidade2)* (24.75/100+1);
        
        System.out.print("Total: R$"+ valorTotal);


        entrada.close();
    }
}
