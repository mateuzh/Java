

import java.io.*;

public abstract class Salvar {
    private static File arquivoLivros = new File("src/src/log/livros.txt");
    private static File arquivoUsuarios = new File("src/src/log/livros.txt");
    private static File arquivoEmprestimos = new File("src/src/log/livros.txt");
    
    public static void salvarLivros(Object obj) {
        try {
            arquivoLivros.getParentFile().mkdirs();
            ObjectOutputStream outP = new ObjectOutputStream(new FileOutputStream(arquivoLivros));
            outP.writeObject(obj);

        } catch (Exception e) {
            System.out.println("ERRO ao salvar o arquivo! " + e);
        }
        
    }

    public static Object lerLivros() {
        try {
            if(arquivoLivros.exists() && arquivoLivros.isFile()){//Verifica se ele existe e verifica se é um arquivo
                ObjectInputStream input = new ObjectInputStream(new FileInputStream(arquivoLivros));//sempre cuidar se está digitando output ou input
                return input.readObject();
            }
        } catch (Exception e) {
            System.out.println("ERRO ao ler o arquivo!" + e);
        }
        return null;
    }

    
    public static void salvarUsuario(Object obj) {
        try {
            arquivoUsuarios.getParentFile().mkdirs();
            ObjectOutputStream outP = new ObjectOutputStream(new FileOutputStream(arquivoUsuarios));
            outP.writeObject(obj);

        } catch (Exception e) {
            System.out.println("ERRO ao salvar o arquivo! " + e);
        }
        
    }

    public static Object getUsuarios() {
        try {
            if(arquivoUsuarios.exists() && arquivoUsuarios.isFile()){//Verifica se ele existe e verifica se é um arquivo
                ObjectInputStream input = new ObjectInputStream(new FileInputStream(arquivoUsuarios));//sempre cuidar se está digitando output ou input
                return input.readObject();
            }
        } catch (Exception e) {
            System.out.println("ERRO ao ler o arquivo!" + e);
        }
        return null;
    }

    public static void salvarEmprestimo(Object obj) {
        try {
            arquivoEmprestimos.getParentFile().mkdirs();
            ObjectOutputStream outP = new ObjectOutputStream(new FileOutputStream(arquivoEmprestimos));
            outP.writeObject(obj);

        } catch (Exception e) {
            System.out.println("ERRO ao salvar o arquivo! " + e);
        }
        
    }

    public static Object getEmprestimos() {
        try {
            if(arquivoEmprestimos.exists() && arquivoEmprestimos.isFile()){//Verifica se ele existe e verifica se é um arquivo
                ObjectInputStream input = new ObjectInputStream(new FileInputStream(arquivoEmprestimos));//sempre cuidar se está digitando output ou input
                return input.readObject();
            }
        } catch (Exception e) {
            System.out.println("ERRO ao ler o arquivo!" + e);
        }
        return null;
    }
}
