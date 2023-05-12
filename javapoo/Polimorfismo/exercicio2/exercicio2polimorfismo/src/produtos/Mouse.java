package produtos;

public class Mouse extends Produto{
    private String tipo, descricao;

    public Mouse(String nome, float preco, String tipo, String descricao) {
        super(nome, preco);
        this.tipo = tipo;
        this.descricao = descricao;
    }  

    @Override
    public String descrever(){
        return descricao;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Mouse [Nome=" + nome + " preço=" + preco + "tipo=" + tipo + ", descricao=" + descricao + "]";
    }

    
}
