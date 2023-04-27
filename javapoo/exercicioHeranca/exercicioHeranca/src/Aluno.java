public class Aluno extends Pessoa{
    private int matricula;
    private String curso;
    private float nota;

    public Aluno(String nome, String endereco, int idade, int matricula, String curso, float nota){
        super(nome, endereco, idade);
        this.matricula = matricula;
        this.curso = curso;
        this.nota = nota;
    }

    public String situacao(){
        if(this.nota >= 6){
            return "Aprovado";
        }
        else{
            return "Reprovado";
        }
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Aluno [nome=" + super.getNome() + ", endereco=" + super.getEndereco() + ", idade=" + super.getIdade() + 
        "matricula=" + 
        matricula + ", curso=" + curso + ", nota=" + nota + "]";
    }

    
}
