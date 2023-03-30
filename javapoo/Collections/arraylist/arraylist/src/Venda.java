import java.util.List;

public class Venda {
    private int codigo;
    private Cliente cliente;
    private List<Produtos> produtos;
    public Venda(int codigo, Cliente cliente, List<Produtos> produtos) {
        this.codigo = codigo;
        this.cliente = cliente;
        this.produtos = produtos;
    }

    public float totalVenda(){
        float total = 0;
        for (Produtos produtos2 : produtos) {
            total += produtos2.getPreco();
        }
        return total;
    }

    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public List<Produtos> getProdutos() {
        return produtos;
    }
    public void setProdutos(List<Produtos> produtos) {
        this.produtos = produtos;
    }
    @Override
    public String toString() {
        return "Venda [codigo=" + codigo + ", cliente=" + cliente + ", produtos=" + produtos + "]";
    }
    
}
