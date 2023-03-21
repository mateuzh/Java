public class Produto {
    private String nome;
    private double preco;
    private int qtdEstoque;

    public Produto(String nome, double preco, int qtdEstoque){
        this.nome = nome;
        this.preco = preco;
        this.qtdEstoque = qtdEstoque;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQtdEstoque() {
        return qtdEstoque;
    }

    public void setQtdEstoque(int qtdEstoque) {
        this.qtdEstoque = qtdEstoque;
    }
    
    public void venderProduto(int quantidade){
        if(this.qtdEstoque >= quantidade){
            this.qtdEstoque -= quantidade;
            System.out.println("Produto vendido com sucesso!\nQuantidade disponível: " + this.qtdEstoque);
        }
        else{
            System.out.println("Quantidade insuficiente no estoque! \nQuantidade disponível: " + this.qtdEstoque);
        }
    }

    public String exibirProduto(){
        return"Descrição: " + this.nome +
        "\nPreço: R$" + this.preco + 
        "\nQuantidade disponível: " + this.qtdEstoque;
        
    }
}
