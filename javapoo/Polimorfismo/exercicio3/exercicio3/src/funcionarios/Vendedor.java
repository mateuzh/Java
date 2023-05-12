package funcionarios;

public class Vendedor extends Funcionario{
    private float comissao, totalVendas;
    private int numeroVendas;
    
    public Vendedor(String nome, float salario, int idade, float totalVendas, int numeroVendas) {
        super(nome, salario, idade);
        this.totalVendas = totalVendas;
        this.numeroVendas = numeroVendas;
    }   

    @Override
    public void calcularComissao(){
        if(numeroVendas < 12){
            setComissao(totalVendas * 0.05f);
        }else if(numeroVendas > 20){
            setComissao(totalVendas * 0.10f);
        }else if(numeroVendas % 2 == 0){
            comissao = totalVendas * ((numeroVendas/2) * 0.01f);
        }else{
            comissao = totalVendas * (((numeroVendas - 1)/2) * 0.01f);
        }
    }

    public float getComissao() {
        return comissao;
    }

    public void setComissao(float comissao) {
        this.comissao = comissao;
    }

    public float getTotalVendas() {
        return totalVendas;
    }

    public void setTotalVendas(float totalVendas) {
        this.totalVendas = totalVendas;
    }

    public int getNumeroVendas() {
        return numeroVendas;
    }

    public void setNumeroVendas(int numeroVendas) {
        this.numeroVendas = numeroVendas;
    }

    @Override
    public String toString() {
        return "nome=" + nome + ", salario=" + salario + ", idade=" + idade + 
        "Vendedor: \nNome: " + nome + "\nSalário: R$" + salario + 
        "\nIdade: " + idade + "\nComissao: " + comissao + "\nTotal de vendas: R$" + totalVendas + 
        "\nNúmero de vendas: " + numeroVendas;
    }

    
}
