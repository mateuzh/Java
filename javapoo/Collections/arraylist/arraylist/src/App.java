import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        
        Produtos prod1 = new Produtos(1, "Lápis", 1.5f);

        List<Produtos> produtos = new ArrayList<Produtos>();

        produtos.add(prod1);
        produtos.add(new Produtos(2, "Borracha", 2.5f));
        produtos.add(new Produtos(3, "Apontador", 6.5f));
        produtos.add(new Produtos(4, "Caneta", 2.0f));
        produtos.add(new Produtos(5, "Lapiseira", 4.5f));
        
        //produtos.remove(3); // faz a remoção do item conforme número de index
        //produtos.set(3, new Produtos(4, "Caneta", 2.5f)); //altera o produto inteiro
        produtos.get(3).setNome("Caneta Azul");//altera somente o atributo necessário

        for (Produtos produtos2 : produtos) {
            if(produtos2.getNome().equals("Caneta Azul")){//equals faz a comparação. ! serve para inverter
                System.out.println(produtos2.toString());
            }
        }
        System.out.println(" <------------------------------------------------------------>");

        //produtos.forEach(produtos2 ->{ System.out.println(produtos2.toString());});
        //sort() utilizado para colocar em ordem a lista
        //System.out.println(produtos.get(1).toString());

        Collections.sort(produtos);
        produtos.forEach(produtos2 ->{System.out.println(produtos2.toString());});

        Cliente cliente1 = new Cliente("José", "Silva");

        Venda venda1 = new Venda(1, cliente1, produtos);

        System.out.println(venda1.getCliente().getNome());

        System.out.println(venda1.getProdutos().get(0).getNome());

        System.out.println("Total da venda foi: R$" + venda1.totalVenda());
    }
}
