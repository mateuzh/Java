package model;

import java.io.Serializable;


public class Livro implements Serializable {
    private String titulo, autor;
    private int anoPublicacao, exemplaresDisponiveis, codigo;   
    private CategoriaLivro categoria;
    private int vezesEmprestado;

    public Livro(String titulo, String autor, int anoPublicacao, int exemplaresDisponiveis, int codigo, CategoriaLivro categoria) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.exemplaresDisponiveis = exemplaresDisponiveis;
        this.codigo = codigo;
        this.categoria = categoria;
    }

    public Livro() {
    }    

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public int getExemplaresDisponiveis() {
        return exemplaresDisponiveis;
    }

    public void setExemplaresDisponiveis(int exemplaresDisponiveis) {
        this.exemplaresDisponiveis = exemplaresDisponiveis;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public CategoriaLivro getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriaLivro categoria) {
        this.categoria = categoria;
    }

    public int getVezesEmprestado() {
        return vezesEmprestado;
    }

    public void setVezesEmprestado(int vezesEmprestado) {
        this.vezesEmprestado = vezesEmprestado;
    }

    @Override
    public String toString() {
        return  "Código: " + codigo + "|" +
                "Título: " + titulo + "|" +
                "Autor: : " + autor + "|" +
                "Ano de Publicação: " + anoPublicacao + "|" +
                "Exemplares: " + exemplaresDisponiveis + "|" +
                "Categoria: " + categoria + "|" +
                "Empréstimos: " + vezesEmprestado + "|\n";
    }

    

    
}
