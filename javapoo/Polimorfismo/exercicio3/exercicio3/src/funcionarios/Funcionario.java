package funcionarios;

public abstract class Funcionario {
    protected String nome;
    protected float salario;
    protected int idade;

    public Funcionario(String nome, float salario, int idade) {
        this.nome = nome;
        this.salario = salario;
        this.idade = idade;
    }

    public abstract void calcularComissao();

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public float getSalario() {
        return salario;
    }
    public void setSalario(float salario) {
        this.salario = salario;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }  
    
}
