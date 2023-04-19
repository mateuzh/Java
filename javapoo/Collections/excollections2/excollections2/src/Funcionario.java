
public class Funcionario implements Comparable<Funcionario> {
    private String nome, cargo;
    private float salario;
    private int idade;

    public Funcionario(String nome, String cargo, float salario, int idade) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
        this.idade = idade;
    }

    public Funcionario(){
        
    }

    public float calcularImposto(){
        return ((salario*9)/100);
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
    @Override
    public String toString() {
        return "Funcionario [nome=" + nome + ", cargo=" + cargo + ", salario=" + salario + ", idade=" + idade + "]";
    }
    @Override
    public int compareTo(Funcionario o) {
        return this.nome.compareTo(o.getNome());
    }
    
    
}
