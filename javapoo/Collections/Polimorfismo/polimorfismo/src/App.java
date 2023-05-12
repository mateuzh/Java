import java.text.Normalizer.Form;

import geometria.*;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Exercício formas");
        
        Quadrado quadrado1 = new Quadrado(10, 10, "Vermelho");
        System.out.println(quadrado1);
        System.out.println(quadrado1.calcularArea());

        Triangulo tri1 = new Triangulo(40, 40, "Retangulo");
        System.out.println(tri1);
        System.out.println(tri1.calcularArea());

        Circulo cir1 = new Circulo(10);
        System.out.println(cir1);
        System.out.println(cir1.calcularArea(0));
    }
}
