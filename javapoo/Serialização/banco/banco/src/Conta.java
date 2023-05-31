import java.io.Serializable;

public abstract class Conta implements Serializable{
    protected int numeroConta;
    protected Usuario usuario;
    protected float saldo;

    public Conta(int numeroConta, Usuario usuario, float saldo) {
        this.numeroConta = numeroConta;
        this.usuario = usuario;
        this.saldo = saldo;
    }
    
    public abstract float depositar(float valorDeposito);

    public abstract float sacar(float valorSaque);

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Conta [numeroConta=" + numeroConta + ", usuario=" + usuario + ", saldo=" + saldo + "]";
    }

}
