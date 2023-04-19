public enum DiasDaSemana {
    SEGUNDA("Segunda-feira"), 
    TERCA("Terça-feira"), 
    QUARTA("Quarta-feira"), 
    QUINTA("Quinta-feira"), 
    SEXTA("Sexta-feira"), 
    SABADO("Sábado"), 
    DOMINGO("Domingo");

    private String diaDaSemana;

    

    private DiasDaSemana(String diaDaSemana) {
        this.diaDaSemana = diaDaSemana;
    }

    public String getDiaDaSemana() {
        return diaDaSemana;
    }

    public void setDiaDaSemana(String diaDaSemana) {
        this.diaDaSemana = diaDaSemana;
    }

    public String qualDia(String diaUsuario) {
        if(diaUsuario == "Sábado" || diaUsuario == "Domingo"){
            return "O dia informado é dia de fim de semana :D";
        }else{
            return "O dia informado é dia útil :(";
        }
    }
}
