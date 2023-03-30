public class Produtos implements Comparable<Produtos>{
    private Integer codigo;
    private String nome;
    private Float preco;



    public Produtos(int codigo, String nome, float preco) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
    }

    public Produtos() {

    }
    
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public float getPreco() {
        return preco;
    }
    public void setPreco(float preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Produtos [codigo=" + codigo + ", nome=" + nome + ", preco=" + preco + "]";
    }

    @Override
    public int compareTo(Produtos nome) {
        // if(this.preco < preco.getPreco()){
        //     return -1;
        // }else if(this.preco == preco.getPreco()){
        //     return 0;
        // }else{
        //     return 1;
        // }
        return this.nome.compareTo(nome.getNome());//Serve para ordenar 
    }

    
}
