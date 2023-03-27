public class Funcionario {
    private String nome, cargo;
    private double salario;

    public Funcionario(){

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double calcularImposto(){
        if(this.salario <= 1500.00){
            return (this.salario * 5) / 100;
        }
        else{
            return (this.salario * 10) / 100;
        }
    }

    public void exibirFuncionario(){
        System.out.println("Nome: " + this.nome +
        "\nCargo: " + this.cargo +
        "\nSalário: R$" + this.salario +
        "\nImposto: R$" + calcularImposto());
    }

}
