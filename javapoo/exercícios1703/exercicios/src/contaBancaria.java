public class contaBancaria {
    private int numeroConta;
    private String nomeTitular;
    private double saldo;

    public contaBancaria(int numeroConta, String nomeTitular, double saldo){
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
        this.saldo = saldo;
    }

    public int getNumeroConta(){
        return this.numeroConta;
    }

    public void setNumeroConta(int conta){
        this.numeroConta = conta;
    }

    public String getNomeTitular(){
        return this.nomeTitular;
    }

    public void setNomeTitular(String nomeTitular){
        this.nomeTitular = nomeTitular;
    }

    public double getSaldo(){
        return this.saldo;
    }

    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

    public void depositar(double valorDeposito){
        if(valorDeposito > 0){
            this.saldo += valorDeposito;
        }else{
            System.out.println("Valor do depósito não pode ser 0!");
        }
    }

    public void sacar(double saque){
        if(saque <= this.saldo){
            this.saldo -= saque;
        }else{
            System.out.println("Saldo da conta insuficiente!");
        }
    }




}
