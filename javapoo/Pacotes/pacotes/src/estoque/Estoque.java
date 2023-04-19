package estoque;


import java.util.ArrayList;
import java.util.List;

import produto.*;

public class Estoque {
    List<Produto> estoque = new ArrayList<Produto>();

    public Estoque(List<Produto> estoque) {
        this.estoque = estoque;
    }

    public String buscarProduto(int codigo){
        return estoque.get(codigo).toString();
    }

    public List<Produto> listarProdutos(){
        List<Produto> positivos = new ArrayList<Produto>();
        for (Produto produto : estoque) {
            if(produto.getEstoque() > 0){
                positivos.add(produto);
            }
        }
        return positivos;
    }

    public List<Produto> listarProdutosZerados(){
        List<Produto> semEstoque = new ArrayList<Produto>();
        for (Produto produto : estoque) {
            if(produto.getEstoque() == 0){
                semEstoque.add(produto);
            }
        }
        return semEstoque;
    }

    public List<produto.Produto> getEstoque() {
        return estoque;
    }

    public void setEstoque(List<produto.Produto> estoque) {
        this.estoque = estoque;
    }

    @Override
    public String toString() {
        return "Estoque [estoque=" + estoque + "]\n";
    }

    
}
