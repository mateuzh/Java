import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) throws Exception {
        
        
        //Inicializa a captura de dados digitados pelo usuário
        Scanner entrada = new Scanner(System.in);
        float ipi;

        System.out.print("Digite o valor do IPI: ");
        ipi = entrada.nextFloat();

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

        float valorTotal = (valorUnitario1 * quantidade1 + valorUnitario2 * quantidade2) * (ipi/100+1);

        System.out.print(
            "produto 1 " + codigoProd1 + " -> Valor: " + valorUnitario1 + " Quantidade: " + quantidade1 +
            "\nproduto 2 " + codigoProd2 + " -> Valor: " + valorUnitario2 + " Quantidade: " + quantidade2 +
            "\nTotal: R$%.2f" + valorTotal 
        );
        
        
        
        

        //Finaliza a variável entrada.
        entrada.close();
    }
}
