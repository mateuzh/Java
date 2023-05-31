import java.util.ArrayList;

import controller.ReservaController;
import model.*;

public class App {
    public static void main(String[] args) throws Exception {
        /*Na classe main você precisa criar pelo menos 1 barco, 1 avião e 2 hotéis, a classe Reservadeve ser criada dentro da classe ReservaController e adiciona na lista desta classe., lembre-seque o seu projeto precisa estar no padrão MVC todos os métodos do controller precisam serutilizados, e devem ser criadas no mínimo 4 reservas. A exclusão precisa ser do id 2 logo após ainclusão da terceira reserva, e só então deve ser feita a quarta reserva*/

        Barco barco1 = new Barco(1, 10, "10:00", "16:00", 1);
        Aviao aviao1 = new Aviao(2, 200, "07:00", "20:00", 500);

        Hospedagem hotel1 = new Hospedagem("Vista Bonita", 1, 2, 200);
        Hospedagem hotel2 = new Hospedagem("Miramar", 2, 4, 100);

        ReservaController reservas = new ReservaController(new ArrayList<Reserva>());

        reservas.salvarReserva(new Reserva("Origem 1", "Destino 1", "23-06-2023", "28-06-2023", hotel2, aviao1));
        reservas.salvarReserva(new Reserva("Origem 2", "Destino 2", "03-07-2023", "10-07-2023", hotel1, barco1));
        reservas.salvarReserva(new Reserva("Origem 3", "Destino 3", "14-07-2023", "20-07-2023", hotel2, aviao1));

        reservas.excluirReserva(2);

        reservas.salvarReserva(new Reserva("Origem 4", "Destino 4", "21-07-2023", "29-07-2023", hotel1, barco1));

        reservas.buscarReserva(0);

        System.out.println(reservas.listarReserva());

        
    }
}
