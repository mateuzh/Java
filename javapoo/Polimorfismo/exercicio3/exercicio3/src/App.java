import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import funcionarios.Gerente;
import funcionarios.Vendedor;
import produtos.Celular;
import produtos.Notebook;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Celular nokia = new Celular("Xperia", "Nokia", 4000.0f, 98123124, "Nokia Xperia");
        Celular samsung = new Celular("S10", "Samsung", 1000.0f, 87012013, "Samsung S10");

        Notebook acer = new Notebook("Acer Aspire", "Acer", 3000.0f, "Intel Core i5 11th", "8gb ram");
        Notebook macbook = new Notebook("MacBook Pro", "Apple", 9000.0f, "M1", "12gb ram");

        System.out.println(" -=-=-=-=-=-=-");
        System.out.println(nokia);
        System.out.println(samsung);
        System.out.println(acer);
        System.out.println(macbook);
        System.out.println(" -=-=-=-=-=-=-");
        nokia.calcularDesconto();
        samsung.calcularDesconto();
        acer.calcularDesconto();
        macbook.calcularDesconto();

        System.out.println(" -=-=-=-=-=-=-");
        System.out.println(nokia);
        System.out.println(samsung);
        System.out.println(acer);
        System.out.println(macbook);
        System.out.println(" -=-=-=-=-=-=-");


        Vendedor vend1 = new Vendedor("Marcos", 1500.0f, 30, 10000, 10);
        Vendedor vend2 = new Vendedor("João", 1800.0f, 22, 10000,15);
        System.out.println("Vendedores antes da comissao: ");
        
        List<Vendedor> listaVendedores = new ArrayList<Vendedor>();
        listaVendedores.addAll(Arrays.asList(vend1, vend2));
        
        for (Vendedor vendedor : listaVendedores) {
            System.out.println(vendedor.toString());
        }
        System.out.println("Vendedores depois da comissao: ");
        for (Vendedor vendedor : listaVendedores) {
            System.out.println(vendedor.toString());
        }


        Gerente gerente = new Gerente("Robson", 3000, 50, 0, listaVendedores);

        System.out.println("Gerente sem a comissao: ");
        System.out.println(gerente);

        System.out.println("Gerente com a comissao: ");
        gerente.calcularComissao();

        System.out.println(gerente);
        
    }
}
