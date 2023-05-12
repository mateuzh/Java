import java.util.ArrayList;
import java.util.List;

import produtos.Livro;
import produtos.Mouse;
import produtos.Produto;
import vendas.Carrinho;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Exercício 2 de polimorfismo!");
        Mouse logitech = new Mouse("Logitech", 19.0f, "Sem fio", "Mouse sem fio");
        Mouse razer = new Mouse("Razer", 500, "Gamer", "Mouse gamer com rgb");

        Livro livro1 = new Livro("Livro 1", 70, "Autor 1", "Gênero 1");
        Livro livro2 = new Livro("Livro 2", 80, "Autor 2", "Gênero 2");

        List<Produto> lista = new ArrayList<Produto>();

        lista.add(livro1);
        lista.add(livro2);
        lista.add(logitech);
        lista.add(razer);

        Carrinho venda1 = new Carrinho(new ArrayList<Produto>());
        Carrinho venda2 = new Carrinho(new ArrayList<Produto>());

        venda1.vender(lista);
        System.out.println(venda1);
        venda2.vender(livro1);
        System.out.println(venda2);

        System.out.println(" Descrevendo produtos ");
        System.out.println(logitech.descrever());
    }
}
