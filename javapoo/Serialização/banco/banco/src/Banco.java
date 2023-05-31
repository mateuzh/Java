import java.io.ObjectInputStream;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Banco implements Serializable{
    private List<Conta> listaContas;
    private float taxaSaque, taxaDeposito;
    
    public Banco(List<Conta> listaContas) {
        this.listaContas = listaContas;
    }

    public void adicionarConta(Conta contaNova){
        listaContas.add(contaNova);
    }

    public void removerConta(Conta contaARemover){
        /*for (Conta conta : listaContas) {
            int i = 0;
            if(conta.getNumeroConta() == contaARemover.getNumeroConta()){
                listaContas.remove(i);
            }
            i++;
        }*/
        listaContas.remove(contaARemover);
    }

    public Conta pesquisarConta(int numeroConta){
        for (Conta conta : listaContas) {
            if(conta.getNumeroConta() == numeroConta){
                return conta;
            }else{
                System.out.println("Conta não encontrada.");
            }
        }
        return null;
    }

    public float exibirSaldoConta(int numeroConta){
        for (Conta conta : listaContas) {
            if(conta.getNumeroConta() == numeroConta){
                return conta.saldo;
            }else{
                System.out.println("Conta não encontrada.");
            }
        }
        return 0;
    }



    

    public Object exibirSaldoBanco(){
        return listaContas;        
    }

    public float getListaContas() {
        float total = 0;
        for (Conta conta : listaContas) {
            total += conta.saldo;
        }
        return total;
    }

    public void setListaContas(List<Conta> listaContas) {
        this.listaContas = listaContas;
    }

    public float getTaxaSaque() {
        return taxaSaque;
    }

    public void setTaxaSaque(float taxaSaque) {
        this.taxaSaque = taxaSaque;
    }

    public float getTaxaDeposito() {
        return taxaDeposito;
    }

    public void setTaxaDeposito(float taxaDeposito) {
        this.taxaDeposito = taxaDeposito;
    }

    
    @Override
    public String toString() {
        return "Banco [listaContas=" + listaContas + ", taxaSaque=" + taxaSaque + ", taxaDeposito=" + taxaDeposito
                + "]";
    }

    
}
