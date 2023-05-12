package funcionarios;

import java.util.List;

public class Gerente extends Funcionario{
    private float comissao;
    private List<Vendedor> vendedores;

    public Gerente(String nome, float salario, int idade, float comissao, List<Vendedor> vendedores) {
        super(nome, salario, idade);
        this.comissao = comissao;
        this.vendedores = vendedores;
    }

    @Override
    public void calcularComissao(){
        float porcentagem = 0.02f;
        for (Vendedor vendedor : vendedores) {
            comissao += vendedor.getTotalVendas();
            if(vendedor.getNumeroVendas() > 10 && porcentagem <= 0.05f){
                porcentagem += 0.01f;
            }
        }

        setComissao(comissao * porcentagem);
    }

    public float getComissao() {
        return comissao;
    }

    public void setComissao(float comissao) {
        this.comissao = comissao;
    }

    @Override
    public String toString() {
        return "Gerente [nome=" + nome + ", salario=" + salario + ", idade=" + idade + 
        "comissao=" + comissao + "]";
    }    
}
