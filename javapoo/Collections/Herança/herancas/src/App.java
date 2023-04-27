public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        System.out.println(" ");
        
        Animal animal = new Animal("Galo", "Canta", false, false);

        System.out.println(animal.toString());

        Gato garfield = new Gato("Garfield", "Eu quero lasanha", false, false, "preto");

        System.out.println(garfield.toString());

        System.out.println(garfield.ronronar());
    }
}
