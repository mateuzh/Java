import java.util.Scanner;

public class exercicio5 {
    public static void cadFormatado(String vetor[]){
        System.out.println("Informações do cadastro: ");
        for(int i = 0; i < 4; i++){
            if(i == 0){System.out.print("Nome: ");}
            if(i == 1){System.out.print("Sobrenome: ");}
            if(i == 2){System.out.print("DDD: ");}
            if(i == 3){System.out.print("Telefone: ");}
            System.out.println(vetor[i]);
        }
    }
    public static void main(String[] args) throws Exception{
        Scanner input = new Scanner(System.in);
        System.out.println("Cadastro:");
        String[] cadastroP = new String[4];
        for(int i = 0; i < 4; i++){
            if(i==0){System.out.print("Nome: ");}
            if(i==1){System.out.print("Sobrenome: ");}
            if(i==2){System.out.print("DDD: ");}
            if(i==3){System.out.print("Telefone: ");}
            cadastroP[i] = input.nextLine();
        }
        System.out.println("---------------------");
        cadFormatado(cadastroP);
        input.close();
    }
}
