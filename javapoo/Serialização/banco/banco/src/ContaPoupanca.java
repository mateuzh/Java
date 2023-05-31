public class ContaPoupanca extends Conta{

    public ContaPoupanca(int numeroConta, Usuario usuario, float saldo) {
        super(numeroConta, usuario, saldo);
    }    

    @Override
    public float depositar(float valorDeposito){
        float taxa = valorDeposito * 0.005f;
        if(valorDeposito > 0){
            saldo += valorDeposito - taxa;
        }
        return taxa;
    }

    @Override
    public float sacar(float valorSaque){
        if(valorSaque > 0 && valorSaque <= saldo){
            saldo -= valorSaque;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "\nContaPoupanca [numeroConta=" + numeroConta + ", usuario=" + usuario + ", saldo=" + saldo + "]";
    }

    
}
