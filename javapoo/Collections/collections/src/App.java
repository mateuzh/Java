import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        //Declaração de vetor
        // int[] vetor = new int[5];
        // int[] vetor2 = {1, 2, 3, 4, 5};

        // List<Integer> lista = new ArrayList<Integer>();

        // lista.add(1);
        // lista.add(2);
        // lista.add(3);
        
        // for (Integer integer : lista) {
        //     System.out.println(integer);
        // }

        // System.out.println("Tamano do Array: " + lista.size()); //.size() mostra o tamanho do Array

        // lista.remove(1);//Remove o item de dentro do Array, passar a posição do item a ser removido

        

        // for (Integer integer : lista) {
        //     System.out.println(integer);
        // }

        // System.out.println("Tamanho do Array: " + lista.size());

        List<Alunos> listaAlunos = new ArrayList<Alunos>();
        
        listaAlunos.add(new Alunos("José", 20));
        listaAlunos.add(new Alunos("Carlos", 24));
        listaAlunos.add(new Alunos("João", 23));
        listaAlunos.add(new Alunos("Bernardo", 21));
        listaAlunos.add(new Alunos("Mateus", 22));
        
        for(int i = 0; i < listaAlunos.size(); i++){
            System.out.println(listaAlunos.get(i).getNome());
        }

    }
}
