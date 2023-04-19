import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        String usuario;
        DiasDaSemana dias;

        System.out.print("Digite o dia da semana: ");
        usuario = in.nextLine();

        dias.qualDia(usuario);


        in.close();      
    }
}
