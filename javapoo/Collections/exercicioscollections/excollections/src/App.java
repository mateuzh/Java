import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        List<Livros> livros = new ArrayList<Livros>();
        List<Clientes> clientes = new ArrayList<Clientes>();

        clientes.add(new Clientes("José"));

        livros.add(new Livros("Moby Dick", "Herman Melville", "Ficção", 10));
        livros.add(new Livros("Pai Rico, Pai Pobre", "Robert Kiyosaki", "Finanças pessoais", 8));
        livros.add(new Livros("Rápido e Devagar", "Daniel Kahneman", "Desenvolvimento pessoal", 9));
        livros.add(new Livros("O homem mais rico da Babilônia", "George S. Clason", "Finanças pessoais", 5));
        livros.add(new Livros("A Origem das Espécies", "Charles Darwin", "Ciência, Biologia", 4));

        Collections.sort(livros);

        List<Livros> emprestimo = new ArrayList<Livros>();

        emprestimo.add(livros.get(0));
        emprestimo.add(livros.get(2));
        emprestimo.add(livros.get(4));

        for (Livros l : emprestimo) {
            System.out.println(l);
        }

    }
}
