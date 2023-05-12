import veiculo.Carro;
import veiculo.Moto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import veiculo.*;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Carro celta = new Carro("Celta", 4, 2002);
        Carro clio = new Carro("Clio", 4, 2006);
        Carro ferrari = new Carro("Ferrari", 2, 2023);

        Moto cgzinha = new Moto("Titan", 2014, 160);
        Moto cb1000 = new Moto("CB1000", 2018, 1000);
        Moto bis = new Moto("Bis", 2020, 100);

        Barco titanic = new Barco("Titanic", "Preta", "Afundado");
        Barco portaAviao = new Barco("Porta Avioes", "Cinza", "Guerrilheiro");
        Barco encouracado = new Barco("Encouracado", "Preta", "Guerra");

        List<Veiculo> veiculos = new ArrayList<Veiculo>();
        
    

        veiculos.addAll(Arrays.asList(celta, clio, ferrari, cgzinha, cb1000, bis, titanic, portaAviao, encouracado));

        for (Veiculo veiculo : veiculos) {
            System.out.println(veiculo.toString());
            System.out.println(veiculo.ligar());
            System.out.println(veiculo.desligar());
            System.out.println(veiculo.acelerar());
            System.out.println(veiculo.frear());
        }
    

    }
}
