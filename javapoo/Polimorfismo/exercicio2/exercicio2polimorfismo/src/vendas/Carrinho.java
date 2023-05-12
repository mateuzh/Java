package vendas;

import java.util.List;

import produtos.Produto;

public class Carrinho {
    private List<Produto> listaProdutos;
    private float total;
    
    public Carrinho(List<Produto> lista) {
        listaProdutos = lista;
        total = 0;
    }

    private void calcularVenda(){
        for (Produto produto : listaProdutos) {
            total += produto.getPreco();
        }
    }

    public void vender(List<Produto> lista){
        listaProdutos = lista;
        calcularVenda();
    }

    public void vender(Produto prod) {
        listaProdutos.add(prod);
        calcularVenda();
    }

    @Override
    public String toString() {
        return "Carrinho [listaProdutos=" + listaProdutos + ", total=" + total + "]";
    }

    
    
}
