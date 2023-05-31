package controller;

import java.util.List;

import model.Cliente;

public class ClienteController {
    List<Cliente> clientes;

    public void salvarCliente(Cliente cliente) {
        if(cliente != null){
            this.clientes.add(cliente);
        }
    }

    public Cliente buscarCliente(String nome){
        for (Cliente cliente : clientes) {
            if(cliente.getNome() == nome){
                return cliente;
            }
        }
        return null;
    }

    public void removerCliente(Cliente cliente){
        if(cliente != null){
            clientes.remove(cliente);
        }
    }
}
