public class Triangulo {
    public float base, altura;
    
    public Triangulo(float base, float altura){
        this.base = base;
        this.altura = altura;
    }

    public Float calculoArea(){
        return (this.base * this.altura)/2;
    }
}
