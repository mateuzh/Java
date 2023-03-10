
import java.util.Scanner;



public class exercicio3 {
    public static void menorMaior(int[] vetor){
        int maior = 0, menor = 0;
        for(int i2 = 0; i2 < 5; i2++){
            if (i2 == 0){
                maior = vetor[i2];
                menor = vetor[i2];
            }else{
                if(vetor[i2] > maior){
                    maior = vetor[i2];
                }
                if(vetor[i2] < menor){
                    menor = vetor[i2];
                }
            }
        }
        System.out.println("O maior valor digitado foi: " + maior);
        System.out.println("O menor valor digitado foi: "+ menor);

    }
    public static void main(String[] args) throws Exception{
        Scanner keyboard = new Scanner(System.in);
        int values[] = new int[5];
        for (int i =  0; i < 5; i++){
            System.out.print("Digite o "+ (i+1) + "º valor: ");
            values[i] = keyboard.nextInt();
        }   
        menorMaior(values);
        keyboard.close();
    }
}
