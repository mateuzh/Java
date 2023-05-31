package controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import model.Usuario;

public class UsuarioController implements Serializable{
    private List<Usuario> usuarios = new ArrayList<Usuario>();

    public void cadastrarUsuario(Usuario adicionarUsuario) {
        if(adicionarUsuario != null && porNome(adicionarUsuario.getNome()) == null){
            usuarios.add(adicionarUsuario);
        }
    }

    public Usuario porNome(String nome){
        for (Usuario usuario : usuarios) {
            if(usuario.getNome() == nome){
                return usuario;
            }
        }
        return null;
    }

    public Usuario porMatricula(int matricula){
        for (Usuario usuario : usuarios) {
            if(usuario.getMatricula() == matricula){
                return usuario;
            }
        }
        return null;
    }

    public void removerUsuario(Usuario removerUsuario){
        if(removerUsuario != null){
            usuarios.remove(removerUsuario);
        }
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }
}
