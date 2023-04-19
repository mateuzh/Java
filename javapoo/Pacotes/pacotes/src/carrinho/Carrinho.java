package carrinho;
import java.util.List;

import javax.xml.transform.Source;

import java.util.ArrayList;
import estoque.*;
import produto.*;


public class Carrinho {
    private int id;
    private List<Produto> produtos = new ArrayList<Produto>();
    private Float totalVenda;
    
    public Carrinho(int id) {
        this.id = id;
    }

    public void adicionarAoCarrinho(List<Produto> produtos,int codigo){
        List<Produto> produtosCarrinho = new ArrayList<Produto>();
        produtosCarrinho.add(produtos.get(codigo));
        setProdutos(produtosCarrinho);
    }

    public void removerDoCarrinho(String nome){
        for (int i = 0; i < produtos.size(); i++) {
            if(nome.equals(produtos.get(i).getNome())){
                produtos.remove(i);
            }
        }
    }

    public void vender(List<Produto> estoque){
        for (Produto produto : produtos) {
            for(int i = 0; i < estoque.size(); i++){
                if(produto.getNome().equals(produtos.get(i).getNome())){
                    estoque.get(i).reduzirEstoque(1);
                }
            }
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public Float getTotalVenda() {
        return totalVenda;
    }

    public void setTotalVenda(Float totalVenda) {
        this.totalVenda = totalVenda;
    }

    @Override
    public String toString() {
        return "Carrinho [id=" + id + ", produtos=" + produtos + ", totalVenda=" + totalVenda + "]";
    }

    
    

}
