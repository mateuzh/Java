import java.util.Scanner;

public class exercicio2 {
    public static int Fatorial(int valorDoUsuario){
        int fatorial = 1;
        for(int i = valorDoUsuario; i > 0; i--){
            fatorial = valorDoUsuario * fatorial; 
            valorDoUsuario--;
        }
        return fatorial;
    }
    public static void main(String[] args) throws Exception{
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite um valor para eu calcular o fatorial: ");
        int valor = entrada.nextInt();
        System.out.println("O fatorial de "+valor+" é " + Fatorial(valor));
        entrada.close();
    }
}
