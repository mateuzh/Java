package model;

import java.io.Serializable;
import java.time.*;

public class EmprestimoLivro implements Serializable{
    private Usuario usuario;
    private Livro livro;
    private Boolean devolvido;
    private LocalDate dataEmprestimo, dataDevolucao, devolvidoDia;
    
    public EmprestimoLivro(Usuario usuario, Livro livro) {
        this.usuario = usuario;
        this.livro = livro;
        this.devolvido = false;
        this.dataEmprestimo = LocalDate.now();
        this.dataDevolucao = LocalDate.of(dataEmprestimo.getYear(), dataEmprestimo.getMonthValue()+1, dataEmprestimo.getDayOfMonth());
    }

    public LocalDate getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(LocalDate dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public LocalDate getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(LocalDate dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public Boolean getDevolvido() {
        return devolvido;
    }

    public void setDevolvido(Boolean devolvido) {
        this.devolvido = devolvido;
    }

    public LocalDate getDevolvidoDia() {
        return devolvidoDia;
    }

    public void setDevolvidoDia(LocalDate devolvidoDia) {
        this.devolvidoDia = devolvidoDia;
    }

    @Override
    public String toString() {
        if(devolvidoDia != null){
            return "\nEmprestimoLivro [Usuario: " + usuario + "\n Livro: " + livro + "\n Devolução: " + devolvido
                + "\n Data do empréstimo: " + dataEmprestimo + "\n Data da devolução=" + dataDevolucao + 
                "\n devolvidoDia="
                + devolvidoDia;
        }else{
            return "\nEmprestimoLivro \nUsuario: " + usuario + "\n Livro: " + livro + "\n Devolução: " + devolvido
                + "\n Data do empréstimo: " + dataEmprestimo + "\n Data da devolução=" + dataDevolucao;
        }
        
    }

    
}
