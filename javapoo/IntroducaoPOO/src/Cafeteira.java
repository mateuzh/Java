public class Cafeteira {
    public boolean ligada;
    public int quantidadeCafe, quantidadeAgua;

    public Cafeteira(int quantidadeCafe, int quantidadeAgua){
        this.ligada = false;
        this.quantidadeAgua = 0;
        this.quantidadeCafe = 0;
    }

    public void ligar(){
        this.ligada = true;
    }

    public void desligar(){
        this.ligada = false;
    }

    public void encherCafe(int quantidade){
        if(quantidade > 0) {
            this.quantidadeCafe = quantidade;
        }
    }
    public void encherAgua(int quantidade){
        if(quantidade > 0){
            this.quantidadeAgua = quantidade;
        }
    }

    public String status(){
        return "A cafeteira está ligada? " + this.ligada +
        "\n A cafeteira tem "+ this.quantidadeAgua + " mls de água." +
        "\n A cafeteira tem "+ this.quantidadeCafe + " g de café. ";
    }

    public boolean fazerCafe(){
        if(this.quantidadeAgua >= 30 & this.quantidadeCafe >= 7){
            this.quantidadeAgua -= 30;
            this.quantidadeCafe -= 7;
            System.out.println("Café quentinho, hmm!");
            return true;
        }else{
            System.out.println("Café cavalinho, pouco pó!");
            return false;
        }
    }
}
