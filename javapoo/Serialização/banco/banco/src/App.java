import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {

        Usuario usuario1 = new Usuario("Cláudio", 123456789);
        Usuario usuario2 = new Usuario("Ana", 321654987);
        Usuario usuario3 = new Usuario("Roberto", 987654321);

        ContaCorrente cc0 = new ContaCorrente(0, usuario1, 1000.0f, 100);
        ContaCorrente cc1 = new ContaCorrente(1, usuario2, 2000.0f, 200);

        ContaPoupanca cp0 = new ContaPoupanca(0, usuario3, 0);

        Banco banco1 = new Banco(new ArrayList<Conta>());

        Banco banco2 = (Banco)Salvar.lerArquivo();


        //banco1.adicionarConta(cp0);
        //banco1.adicionarConta(cc1);
        //banco1.adicionarConta(cp0);

        System.out.println(banco1);

        System.out.println(banco2);

        //Salvar.salvarArquivo(banco1);

        
    }
}
