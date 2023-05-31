package controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import model.*;


public class LivroController extends Livro implements Serializable{
    List<Livro> livros = new ArrayList<Livro>();

    public List<Livro> maisEmprestados(){
        List<Livro> livrosOrdenados = new ArrayList<Livro>();
        
        livros.sort(Comparator.comparing(Livro::getVezesEmprestado));
        for (int i = livros.size(); i > 0; i--) {
            livrosOrdenados.add(livros.get(i-1));
        }
        return livrosOrdenados;        
    }

    public void salvarLivro(Livro livroAdd){
        if(livroAdd != null){
            livros.add(livroAdd);
        }
    }

    public Livro porCodigo(int codigo){
        for (Livro livro : livros) {
            if(livro.getCodigo() == codigo){
                return livro;
            }
        }
        return null;
    }

    public Livro porTitulo(String titulo){
        for (Livro livro : livros) {
            if(livro.getTitulo().equals(titulo)){
                return livro;
            }
        }
        return null;
    }

    public Livro porAutor(String autor){
        for (Livro livro : livros) {
            if(livro.getAutor().equals(autor)){
                return livro;
            }
        }
        return null;
    }

    public Livro porCategoria(CategoriaLivro categoria){
        for (Livro livro : livros) {
            if(livro.getCategoria() == categoria){
                return livro;
            }
        }
        return null;
    }

    public void removerLivro(Livro removerLivro){
        if(removerLivro != null){
            livros.remove(removerLivro);
        }
    }

    public List<Livro> getLivros() {
        return livros;
    }

    public void setLivros(List<Livro> livros) {
        this.livros = livros;
    }
}
