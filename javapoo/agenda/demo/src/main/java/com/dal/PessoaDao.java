package com.dal;

import java.util.List;
import javax.persistence.*;
import com.model.Pessoa;

public abstract class PessoaDao{
    private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("db");
    private static EntityManager em = emf.createEntityManager();

    public static void salvaPessoa(Pessoa pessoa) {
        try{
            em.getTransaction().begin();
            em.persist(pessoa);
            em.getTransaction().commit();     
        } catch (Exception e) {
            em.getTransaction().rollback();
        }
    }

    public static void alteraPessoa(Pessoa pessoa) {
        try{
            em.getTransaction().begin();
            em.merge(pessoa);
            em.getTransaction().commit();     
        } catch (Exception e) {
            em.getTransaction().rollback();
        }
    }

    public static List<Pessoa> listarPessoas() {
        try{
            em.getTransaction().begin();
            Query sql = em.createQuery("SELECT p FROM Pessoa p");
            List<Pessoa> pessoas = sql.getResultList();
            em.getTransaction().commit();    
            return pessoas;
            
        } catch (Exception e) {
            em.getTransaction().rollback();
            return null;
        }
    }

    public static Pessoa pessoaPorId(int id) {
        try {
            em.getTransaction().begin();
            Pessoa cliente = em.find(Pessoa.class, id);
            em.getTransaction().commit();
            return cliente; 
        } catch (Exception e) {
            em.getTransaction().rollback();
            return null;
        }
    }

    public static void excluiPessoa(Pessoa pessoa) {
        try {
            em.getTransaction().begin();
            pessoa = em.merge(pessoa);
            em.remove(pessoa);
            em.getTransaction().commit();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            em.getTransaction().rollback();
        }      
    }
}
