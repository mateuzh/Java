public class ContaBancaria {
    String titular = "José";
    int nmrConta = 2345;
    float saldo = 0f  ;

    public void depositar(float deposito){
        this.saldo += deposito;
    }

    public void sacar(float saque){
        if(saque > this.saldo){
            System.out.println("Saldo insuficiente! ");
        }else{
            this.saldo -= saque;
        }
    }

    public void imprimirSaldo(){
        System.out.println("Saldo atual: R$" + saldo);
    }
}
