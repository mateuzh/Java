import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);

        Funcionario funcionario1 = new Funcionario();
        Empresa empresa1 = new Empresa("Empresa Fictícia");
        
        System.out.print("Nome: ");
        funcionario1.setNome(in.nextLine());
        System.out.print("Cargo: ");
        funcionario1.setCargo(in.nextLine());
        System.out.print("Salário: R$");
        funcionario1.setSalario(in.nextFloat());
        System.out.print("Idade: ");
        funcionario1.setIdade(in.nextInt());

        System.out.println("Imposto sobre o salário: R$");
        System.out.println(funcionario1.calcularImposto());

        System.out.println(funcionario1.toString());

        empresa1.aumentarSalario(null, 0);


        in.close();
    }
}
