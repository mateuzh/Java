/**
 * Este é um comentário de Documentação
 * @author autor do código
 * @version versão do código
 * @deprecated essa classe irá deixar de existir na próxima versão
 */
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        // Comentário de linha
        /* 
         * Esse é um comentário de Bloco
         */
        int sala = 3; //Declaração de uma variável tipo inteiro
        float salario = 2500.50f;//Declaração de uma variável tipo real
        char letra = (char)'m';//Declaração de variável que armazena apenas 1 letra
        boolean aprovado = false;//Declaração de uma variável Verdadeiro ou Falso

        int sal = (int)salario;//Typecast converte float para int

        Integer numero = new Integer(15);
        Float bonus = new Float(500.60);
        String nome = new String();
        Boolean presente = new Boolean(true);

        Scanner teclado = new Scanner(System.in);

        System.out.println("Hello, World!");
        System.out.print("Não pula linha\n");//\n para pular linha sem usar o println
        System.out.print("Pulou linha por causa do \n");
        System.out.printf("Salario: %d\n", sal);//Mostra o texto com possibilidade de formatação

        System.out.println("Digite o seu Nome: ");
        nome = teclado.nextLine(); // nextLine recebe somente string
        /*nome = 
        teclado.nextInt(); Recebe um inteiro
        teclado.nextFloat(); Recebe um float
        teclado.nextBoolean(); Recebe somente valores booleanos 
        */
        System.out.println("O nome digitado foi: "+ nome);

        //Atividade para casa é ler a data de nascimento pelo teclado e informar a idade

    }
}