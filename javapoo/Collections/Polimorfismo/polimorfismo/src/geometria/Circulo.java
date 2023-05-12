package geometria;

public class Circulo extends Formas{
    private float circunferencia;

    public Circulo(float diametro) {
        super(diametro, diametro);
        calcularCircunferencia();
    }

    public float getCircunferencia() {
        return circunferencia;
    }

    public void setCircunferencia() {
        calcularCircunferencia();
    }

    public float calcularArea(float raio){
        return (3.14f * (base/2 * base/2));
    }

    private void calcularCircunferencia(){
        circunferencia = 3.14f * base;
    }

    @Override
    public String toString() {
        return "Circulo [circunferencia=" + circunferencia + " Base =" + base + 
        "altura=" + altura + "]";
    }

    
}
