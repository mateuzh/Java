package model;

import java.io.Serializable;

public class Usuario implements Serializable{
    private String nome, endereco, email;
    private int telefone, matricula;  

    public Usuario(String nome, String endereco, String email, int telefone, int matricula) {
        this.nome = nome;
        this.endereco = endereco;
        this.email = email;
        this.telefone = telefone;
        this.matricula = matricula;
    }

    public Usuario(){
        
    }
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public int getTelefone() {
        return telefone;
    }
    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "\nUsuario [nome=" + nome + ", endereco=" + endereco + ", email=" + email + ", telefone=" + telefone
                + ", matricula=" + matricula + "]";
    }  

    
}
