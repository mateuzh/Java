public class ContaCorrente extends Conta{
    private float limite;       

    public ContaCorrente(int numeroConta, Usuario usuario, float saldo, float limite) {
        super(numeroConta, usuario, saldo);
        this.limite = limite;
    }

    @Override
    public float depositar(float valorDeposito){
        if(valorDeposito > 0){
            saldo += valorDeposito - (valorDeposito * 0.005f);
        }
        return (valorDeposito * 0.005f);
    }

    @Override
    public float sacar(float valorSaque){
        float taxa = ((valorSaque * 2)/100 );
        if(valorSaque > 0 && (saldo + limite) >= (taxa + valorSaque)){
            saldo -= valorSaque + taxa;
        }
        else{
            taxa = 0;
        }
        return taxa;
    }

    public float getLimite() {
        return limite;
    }

    public void setLimite(float limite) {
        this.limite = limite;
    }

    @Override
    public String toString() {
        return "\nContaCorrente [numeroConta=" + numeroConta + ", usuario=" + usuario + ", saldo=" + saldo + "limite=" + limite + "]";
    }
    
    
}
