package produto;

/**
 * Produto
 */
public class Produto {
    private int codigo, estoque;
    private String nome;
    private Float preco;
    private Categoria categoria; 

    public Produto(int codigo, int estoque, String nome, Float preco, Categoria categoria) {
        this.codigo = codigo;
        this.estoque = estoque;
        this.nome = nome;
        this.preco = preco;
        this.categoria = categoria;
    }

    public void reduzirEstoque(int quantidade){
        if(getEstoque() > 0 && getEstoque() > quantidade){
            setEstoque(getEstoque() - quantidade);
        }else{
            System.out.println("Quantidade insuficiente!\nQuantidade disponível: " + getEstoque());
        }
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Float getPreco() {
        return preco;
    }

    public void setPreco(Float preco) {
        this.preco = preco;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Produto [codigo=" + codigo + ", estoque=" + estoque + ", nome=" + nome + ", preco=" + preco + "]\n";
    }
    
    
    
    
}
