package controller;

import java.util.*;

import model.Reserva;

public class ReservaController {
    private List<Reserva> reservas = new ArrayList<Reserva>();
    private int maior = 1;

    public ReservaController(List<Reserva> reservas){
        this.reservas = reservas;
    }

    public void salvarReserva(Reserva novaReserva){
        if(novaReserva != null){
            novaReserva.setValor(novaReserva.getVeiculo().getValorPassagem() + (novaReserva.getHospedagem().getQtdePessoas() * novaReserva.getHospedagem().getValorPorPessoa()));
            if(reservas.isEmpty()){
                novaReserva.setId(maior++);
                reservas.add(novaReserva);
            }else{
                novaReserva.setId(maior++);
                reservas.add(novaReserva);
            }            
        }
    }

    public int ultimaReserva(){
        for (int i = 0; i < reservas.size(); i++) {
            for (Reserva reserva : reservas) {
                if(i == 0){
                    maior = reserva.getId();
                }else{
                    if(reserva.getId() > maior){
                        maior = reserva.getId();
                    }
                }
            }
        }
        return maior;
    }

    public Reserva buscarReserva(int id){
        for (Reserva reserva : reservas) {
            if(reserva.getId() == id){
                return reserva;
            }
        }
        return null;
    }

    public void excluirReserva(int id){
        for (Reserva reserva : reservas) {
            if(reserva.getId() == id){
                reservas.remove(id-1);
            }
        }
    }

    public List<Reserva> listarReserva(){
        return reservas;
    }
    
}
