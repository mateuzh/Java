package model;

public enum CategoriaLivro{
    BIOGRAFIA("Biografia"),
    COLECOES("Coleções"),
    COMPORTAMENTO("Comportamento"),
    CONTOS("Contos"),
    CRITICA_LITERARIA("Crítica Literária"),
    FICCAO_CIENTIFICA("Ficção Científica"),
    FOLCLORE("Folclore"),
    GENEALOGIA("Genealogia");

    private String categoria;

    private CategoriaLivro(String categoria) {
        this.categoria = categoria;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}
