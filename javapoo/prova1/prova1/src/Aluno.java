public class Aluno {
    private String nome;
    private int idade;
    private float nota1, nota2, media;

    public Aluno(String nome, int idade, float nota1, float nota2){
        this.nome = nome;
        this.idade = idade;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getNota1() {
        return nota1;
    }

    public void setNota1(float nota1) {
        if(this.nota1 >= nota1){
            this.nota1 = nota1;
            System.out.println("Nota 1 inserida com sucesso!\n");
        }
        else{
            System.out.println("Nova nota não foi inserida por ser menor que a existente!\n");
        }
        
    }

    public float getNota2() {
        return nota2;
    }

    public void setNota2(float nota2) {
        if(this.nota2 >= nota2){
            this.nota2 = nota2;
            System.out.println("Nota 2 inserida com sucesso!\n");
        }
        else{
            System.out.println("Nova nota não foi inserida por ser menor que a existente!\n");
        }
    }

    public float getMedia() {
        return media;
    }

    public void setMedia(float media) {
        this.media = (nota1+nota2) / 2;
        if(this.media == media){
            this.media = media;
        }
        else{
            System.out.print("A media informada não é igual a media cadastrada!\n");
        }
    }

    public float calcularMedia(float nota1, float nota2){
        return (nota1 + nota2)/2;
    }

    public String status(){
        if(this.media >= 7){
            return "Aprovado!";
        }
        if(this.media >= 2){
            return "Em recuperação!";
        }
        else{
            return "Reprovado!";
        }
    }
}
