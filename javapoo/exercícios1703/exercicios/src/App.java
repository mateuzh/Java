import java.time.LocalDate;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        contaBancaria conta1 = new contaBancaria(0, null, 0);
        Reserva reserva1 = new Reserva(null, 0, null, 0);

        System.out.print("Número da conta: ");
        conta1.setNumeroConta(teclado.nextInt());
        teclado.nextLine();
        System.out.print("Nome do titular: ");
        conta1.setNomeTitular(teclado.nextLine());
        System.out.print("Saldo: R$");
        conta1.setSaldo(teclado.nextDouble());
        System.out.println("Numero da conta: " + conta1.getNumeroConta());
        System.out.println("Titular: " + conta1.getNomeTitular());
        System.out.println("Saldo: R$" + conta1.getSaldo());
        System.out.print("Valor do despósito: R$");
        conta1.depositar(teclado.nextDouble());
        System.out.print("Valor do saque: R$");
        conta1.sacar(teclado.nextDouble());
        System.out.println("Saldo: R$" + conta1.getSaldo());

        System.out.println("Informe os seguintes campos: ");
        System.out.print("Nome do titular: ");
        reserva1.setNomeCliente(teclado.nextLine());
        teclado.nextLine();
        System.out.print("Número de pessoas: ");
        reserva1.setNumeroPessoas(teclado.nextInt());
        teclado.nextLine();
        System.out.print("Data da reserva: ");
        reserva1.setDataReserva(teclado.nextLine());
        System.out.print("Valor da reserva: R$");
        reserva1.setValorReserva(teclado.nextDouble());

        System.out.println(" ");

        System.out.println("Valor total da reserva: R$" + reserva1.calculaValorTotal());
        System.out.print(reserva1.exibirReserva());

        teclado.close();
    }
}
