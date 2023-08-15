package com.controller;

import java.util.List;

import com.dal.PessoaDao;
import com.model.ContatoTelefonico;
import com.model.Pessoa;

public abstract class PessoaController {

    public static void salvarPessoa(Pessoa pessoa) {
        try {
            if(pessoa.getNome().isEmpty() == false){
                PessoaDao.salvaPessoa(pessoa);
            }            
        } catch (Exception e) {
            System.out.println("Erro ao realizar o cadastro");
        }
    }

    public static void alterarPessoa(Pessoa pessoa) {
        try {
            if(PessoaDao.pessoaPorId(pessoa.getId()) != null && pessoa.getNome().isEmpty() && pessoa.getEmail().isEmpty() && pessoa.getCelular() == null && pessoa.getEndereco() == null){
                PessoaDao.alteraPessoa(pessoa);
            }
        } catch (Exception e) {
            System.out.println("Erro ao alterar o cadastro");
        }
        
    }

    public static void excluirPessoa(int id) {
        try {
            if(PessoaDao.pessoaPorId(id) != null){
                PessoaDao.excluiPessoa(PessoaDao.pessoaPorId(id));
            }
        } catch (Exception e) {
            System.out.println("Erro ao deletar o cadastro");
        }
        
    }

    public static List<Pessoa> listarPessoas() {
        try {
            return PessoaDao.listarPessoas();
        } catch (Exception e) {
            System.out.println("Erro ao listar o cadastro");
            return null;
        }
    }

    public static Pessoa pessoaPorId(int id) {
        try {
            return PessoaDao.pessoaPorId(id);      
        } catch (Exception e) {
            System.out.println("Erro ao buscar o cadastro");
            return null;
        }
    }
    
}
