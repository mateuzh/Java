
import java.util.List;

public class Empresa implements Comparable<Empresa> {
    private String nome;
    private List<Funcionario> funcionarios;
    
    public Empresa(String nome){
        this.nome = nome;

    }

    public Empresa(){

    }

    public void aumentarSalario(List<Funcionario> funcionario,float aumento){
        funcionario.get(0).setSalario(((aumento*funcionario.get(0).getSalario())/100)+funcionario.get(0).getSalario());
    }

    public void promoverFuncionario(String cargo, float aumentoSalario){
        funcionarios.get(0).setCargo(cargo);
        if(aumentoSalario > funcionarios.get(0).getSalario()){
            funcionarios.get(0).setSalario((aumentoSalario*funcionarios.get(0).getSalario())/100);
        }else{
            System.out.println("O valor do novo salário deve ser maior do que o antigo!");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(List<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }

    @Override
    public String toString() {
        return "Empresa [nome=" + nome + ", funcionarios=" + funcionarios + "]";
    }

    @Override
    public int compareTo(Empresa o) {
        return this.nome.compareTo(o.getNome());    
    }
    
}
