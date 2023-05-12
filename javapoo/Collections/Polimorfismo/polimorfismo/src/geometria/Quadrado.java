package geometria;

public class Quadrado extends Formas{
    private String cor;

    public Quadrado(float base, float altura, String cor) {
        super(base, altura);
        this.cor = cor;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public float calcularArea(){
        return super.base * super.altura;
    }

    @Override
    public String toString() {
        return "Quadrado [cor=" + cor + " base=" + base + " altura=" + altura + "]";
    }

    
    
}
