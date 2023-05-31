package controller;

import java.util.*;

import model.*;

public class EmprestimoController {
    private List<EmprestimoLivro> emprestimos = new ArrayList<EmprestimoLivro>();

    public void adicionarEmprestimo(EmprestimoLivro emprestimo){
        if(emprestimo != null){
            emprestimos.add(emprestimo);
        }
    }

    public List<EmprestimoLivro> getEmprestimos() {
        return emprestimos;
    }

    public void setEmprestimos(List<EmprestimoLivro> emprestimos) {
        this.emprestimos = emprestimos;
    }

    
}
