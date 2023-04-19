public enum Cidade {
    MANDIRITUBA(41, "Mandirituba"), 
    QUITANDINHA(41, "Quitandinha"), 
    CURITIBA(41, "Curitiba"),
    PARANAVAI(44, "Paranavaí");//Constantes são sempre caixa alta, para separar as palavras utiliza-se o underline

    private int ddds;
    private String nomeCidade;

    private Cidade(int ddds, String nomeCidade) {
        this.ddds = ddds;
        this.nomeCidade = nomeCidade;
    }

    public int getDdds() {
        return ddds;
    }

    public void setDdds(int ddds) {
        this.ddds = ddds;
    }

    public String getNomeCidade() {
        return nomeCidade;
    }

    public void setNomeCidade(String nomeCidade) {
        this.nomeCidade = nomeCidade;
    }

    
}
