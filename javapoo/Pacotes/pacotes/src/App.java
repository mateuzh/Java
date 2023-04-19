import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import estoque.*;
import produto.*;
import carrinho.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);

        Carrinho carrinhoDeCompras = new Carrinho(0);

        Produto prod1 = new Produto(0, 5, "Notebook", 3200.00f, Categoria.ELETRONICOS);
        Produto prod2 = new Produto(1, 6, "212", 450.00f, Categoria.PERFUMES);
        Produto prod3 = new Produto(2, 7, "Bola de basquete", 100.00f, Categoria.ESPORTES);
        Produto prod4 = new Produto(3, 8, "Camisa de futebol", 319.00f, Categoria.ESPORTES);
        Produto prod5 = new Produto(4, 0, "Mouse", 119.00f, Categoria.ELETRONICOS);

        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-==-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-==-=-=-=-=-");
        System.out.println("Testando a função reduzirEstoque()");
        System.out.println(prod1.toString());
        prod1.reduzirEstoque(6);
        System.out.println(prod1.toString());
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-==-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-==-=-=-=-=-");
        System.out.println(" ");

        List<Produto> estoque = new ArrayList<Produto>();

        estoque.add(prod1);
        estoque.add(prod2);
        estoque.add(prod3);
        estoque.add(prod4);
        estoque.add(prod5);

        System.out.println(" ");
        System.out.println("Mostrando os produtos!");
        for (Produto produto : estoque) {
            System.out.println(produto.toString());
        }
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-==-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-==-=-=-=-=-");
        System.out.println(" ");

        Estoque estProdutos = new Estoque(estoque);
        
        System.out.println("Testando o método de buscarProduto()");
        System.out.print("Digite o código do produto: ");
        System.out.println(estProdutos.buscarProduto(in.nextInt()));
        System.out.println(" ");

        System.out.println("Testando o método listarProdutos()");
        System.out.println(estProdutos.listarProdutos());
        System.out.println(" ");

        System.out.println("Testando o método listarProdutosZerados()");
        System.out.println(estProdutos.listarProdutosZerados());
        System.out.println(" ");



        System.out.print("Deseja adicionar ao seu carrinho de compras qual produto?\nCódigo do produto: ");
        carrinhoDeCompras.adicionarAoCarrinho(estoque, in.nextInt());
        System.out.println(" ");

        System.out.println(" ");
        System.out.print("Produtos do carrinho: ");
        System.out.println(carrinhoDeCompras.toString());

        System.out.println("Deseja remover do seu carrinho qual produto?\nCódigo da venda: ");
        carrinhoDeCompras.removerDoCarrinho(in.nextLine());

        System.out.println(" ");
        System.out.print("Produtos do carrinho: ");
        System.out.println(carrinhoDeCompras.toString());

        System.out.println(" ");
        System.out.println("testando o método vender() ");
        carrinhoDeCompras.vender(estoque);

        System.out.println("-=-=-=--=-=-=-=-=--=-=-=-=-=--=-=-=-=-=--=-=-=-=-=--=-=");

        System.out.println(" ");
        System.out.print("Produtos do carrinho: ");
        System.out.println(carrinhoDeCompras.toString());

        in.close();
    }
}
