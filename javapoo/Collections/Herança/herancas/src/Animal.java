public class Animal {
    protected String nome, barulho;
    protected Boolean dormindo, fome;

    public Animal(String nome, String barulho, Boolean dormindo, Boolean fome) {
        this.nome = nome;
        this.barulho = barulho;
        this.dormindo = dormindo;
        this.fome = fome;
    }

    public Animal(){}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getBarulho() {
        return barulho;
    }

    public void setBarulho(String barulho) {
        this.barulho = barulho;
    }

    public Boolean getDormindo() {
        return dormindo;
    }

    public void setDormindo(Boolean dormindo) {
        this.dormindo = dormindo;
    }

    public Boolean getFome() {
        return fome;
    }

    public void setFome(Boolean fome) {
        this.fome = fome;
    }

    @Override
    public String toString() {
        return "Animal [nome=" + nome + ", barulho=" + barulho + ", dormindo=" + dormindo + ", fome=" + fome + "]";
    }

}
