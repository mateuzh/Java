import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.lang.model.element.QualifiedNameable;

public class App {
    public static void main(String[] args) throws Exception {
        List<Livros> livros = new ArrayList<Livros>();

        livros.add(new Livros("Moby Dick", "Herman Melville", "Ficção", 10));
        livros.add(new Livros("Pai Rico, Pai Pobre", "Robert Kiyosaki", "Finanças pessoais", 8));
        livros.add(new Livros("Rápido e Devagar", "Daniel Kahneman", "Desenvolvimento pessoal", 9));
        livros.add(new Livros("O homem mais rico da Babilônia", "George S. Clason", "Finanças pessoais", 5));
        livros.add(new Livros("A Origem das Espécies", "Charles Darwin", "Ciência, Biologia", 4));

        Biblioteca biblioteca = new Biblioteca("Biblioteca 1", livros);//Inserindo os livros na biblioteca
        System.out.println(biblioteca.toString());

        System.out.println(" <-------------------------------->");

        Clientes cliente = new Clientes("José");

        List<Livros> livrosEmprestados = new ArrayList<Livros>();

        livrosEmprestados.add(new Livros("Moby Dick"));
        livrosEmprestados.add(new Livros("Moby Dick"));

        cliente.setListaLivros(biblioteca.emprestarLivros(livrosEmprestados));
        
        System.out.println(cliente.toString());

        Collections.sort(livros);

        biblioteca.setListaDisponiveis(livros);
        System.out.println(biblioteca.toString());

        

        
    }
}
