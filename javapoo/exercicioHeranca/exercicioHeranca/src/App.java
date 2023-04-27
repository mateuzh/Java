public class App {
    public static void main(String[] args) throws Exception {
        Pessoa pessoa1 = new Pessoa("Gustavo Pilantra", "Areia branca dos Assis", 23);

        System.out.println(pessoa1.toString());

        Aluno aluno1 = new Aluno("Berna", "Xaxim", 18, 1, "Analise e Dev", 5);
        Aluno aluno2 = new Aluno("Vina", "Pinheirinho", 19, 2, "Ciencia da Computação", 9);

        System.out.println(aluno1.toString());
        System.out.println(aluno1.situacao());
        System.out.println(" ");

        System.out.println(aluno2.toString());
        System.out.println(aluno2.situacao());
        System.out.println(" ");

        Professor professor1 = new Professor("João", "Ecoville", 30, "ADS", 
        4000.0f);

        System.out.println(professor1.toString());
        professor1.setSalario(professor1.getSalario() + professor1.aumentarSalario(20));

        System.out.println(professor1.toString());

        Funcionario funcionario1 = new Funcionario("Pedro", "Araucária", 21, "Gerente",
        "Qualidade", 5000.0f);

        System.out.println(funcionario1.toString());
        funcionario1.promocao("Diretor", 9000.0f);

        System.out.println(funcionario1.toString());
    }
}
