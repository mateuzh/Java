import java.time.LocalDate;

public class Reserva {
    private String nomeCliente;
    private int numeroPessoas;
    private LocalDate dataReserva;
    private double valorReserva;

    public Reserva(String nomeCliente, int numeroPessoas, LocalDate dataReserva, double valorReserva){
        this.nomeCliente = nomeCliente;
        this.numeroPessoas = numeroPessoas;
        this.dataReserva = dataReserva;
        this.valorReserva = valorReserva;
    }

    public String getNomeCliente(){
        return this.nomeCliente;
    }

    public void setNomeCliente(String nomeCliente){
        this.nomeCliente = nomeCliente;
    }

    public int getNumeroPessoas(){
        return this.numeroPessoas;
    }

    public void setNumeroPessoas(int numeroPessoas){
        this.numeroPessoas = numeroPessoas;
    }

    public LocalDate getDataReserv(){
        return this.dataReserva;
    }

    public void setDataReserva(String dataReserva){
        this.dataReserva = LocalDate.parse(dataReserva);
    }

    public double getValorReserva(){
        return this.valorReserva;
    }

    public void setValorReserva(Double valorReserva){
        this.valorReserva = valorReserva;
    }
    
    public double calculaValorTotal(){
        return this.numeroPessoas * valorReserva;
    }

    public String exibirReserva(){
        return "Reservado em nome de: " + this.nomeCliente + 
        "\nNúmero de pessoas: " + this.numeroPessoas +
        "\nData da reserva: " + this.dataReserva +
        "\nValor total da reserva: R$" + this.valorReserva * this.numeroPessoas;
    }

}
