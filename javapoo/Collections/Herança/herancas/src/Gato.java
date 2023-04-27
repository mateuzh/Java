import javax.swing.text.StyledEditorKit.BoldAction;

public class Gato extends Animal{

    private String cor;

   public Gato(String nome, String barulho, Boolean dormindo, Boolean fome, String cor){
        //super.barulho = barulho;
        super(nome, barulho, dormindo, fome);
        this.cor = cor;
   } 

    public String ronronar() {
        return "O gato está ronronando...";
    }



    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public String toString() {
        return "Gato [nome=" + nome + ", barulho=" + barulho + ", dormindo=" + dormindo + ", fome=" + fome + ", cor=" + cor + "]";
    }

    
}
