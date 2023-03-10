import java.util.Scanner;

public class exercicio4 {
    public static void somaVetor(float vetor[]){
        float soma = 0;
        for(int i = 0; i < 5; i++){
            soma = vetor[i]+soma;
        }
        System.out.print("A soma dos valores informados é de: "+ soma);
    }
    public static void main(String[] args) throws Exception{
        Scanner input = new Scanner(System.in);
        float vetorF[] = new float[5];
        for(int i = 0; i < 5; i++){
            System.out.println("Digite o "+ (i+1) + "º valor: ");
            vetorF[i] = input.nextFloat();
        }
        somaVetor(vetorF);
        input.close();
    }
}
