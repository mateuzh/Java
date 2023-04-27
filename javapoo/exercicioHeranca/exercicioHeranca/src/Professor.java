public class Professor extends Pessoa{
    private String disciplina;
    private float salario;

    public Professor(String nome, String endereco, int idade, String disciplina, float salario){
        super(nome, endereco, idade);
        this.disciplina = disciplina;
        this.salario = salario;
    }

    public float aumentarSalario(float porcentagem) {
        if(this.salario == 0){
            return 0;
        }else{
            return (this.salario * porcentagem)/ 100;
        }
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Professor [nome=" + super.getNome() + ", endereco=" + super.getEndereco() + 
        ", idade=" + super.getIdade() + "disciplina=" + disciplina + ", salario=" + salario + "]";
    }

    
}
