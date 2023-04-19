import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);

        System.out.println(Cidade.MANDIRITUBA);

        Cidade cid = Cidade.QUITANDINHA;

        System.out.println(cid);

        System.out.println("<------------------------------------------------------------------------------------> ");

        Cliente cliente1 = new Cliente("Gustavão", "Rua JK");

        Cidade cidCliente = null;

        cidCliente = Cidade.valueOf(in.nextLine());
        cliente1.setCidade(Cidade.CURITIBA);

        System.out.println(cliente1.toString());

        System.out.println("<------------------------------------------------------------------------------------> ");

        for (Cidade c : Cidade.values()) {//values() pega todos os valores dentro do Enum
            if(c.getDdds() == 41){
                System.out.println(c);
            }
        }

        System.out.println(cliente1.getCidade().getNomeCidade()); 

        in.close();
    }
}
