public class App {
    public static void main(String[] args) throws Exception {
        Produto produto1 = new Produto("Câmera de segurança", 99.90, 10);
        produto1.venderProduto(3);
        produto1.venderProduto(11);

        Funcionario funcionario1 = new Funcionario("Mateus", "Analista de Sistemas", 5000.00);
        Funcionario funcionario2 = new Funcionario("Henrique", "Empacotador", 1500.00);

        funcionario1.calcularImposto();
        funcionario2.calcularImposto();

        funcionario1.exibirFuncionario();
        funcionario2.exibirFuncionario();

        Aluno aluno1 = new Aluno("Gustavo", 19, 7, 8);
        aluno1.setMedia(aluno1.calcularMedia(aluno1.getNota1(), aluno1.getNota2()));

        Aluno aluno2 = new Aluno("Bernardo", 20, 9, 2);
        aluno2.setMedia(aluno1.calcularMedia(aluno2.getNota1(), aluno2.getNota2()));

        Aluno aluno3 = new Aluno("José", 22, 2, 0);
        aluno3.setMedia(aluno3.calcularMedia(aluno3.getNota1(), aluno3.getNota2()));

        System.out.println(aluno1.status());
        System.out.println(aluno2.status());
        System.out.println(aluno3.status());
    }
}
