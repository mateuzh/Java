package controller;

import java.io.*;

public abstract class BibliotecaController {
    private static File arquivoBiblioteca = new File("trabalho_de_java1/src/log/biblioteca");

    public static void salvarBiblioteca(Object obj) {
        try {
            arquivoBiblioteca.getParentFile().mkdirs();
            ObjectOutputStream outP = new ObjectOutputStream(new FileOutputStream(arquivoBiblioteca));
            outP.writeObject(obj);

        } catch (Exception e) {
            System.out.println("ERRO ao salvar o arquivo! " + e);
        }
        
    }

    public static Object lerBiblioteca() {
        try {
            if(arquivoBiblioteca.exists() && arquivoBiblioteca.isFile()){//Verifica se ele existe e verifica se é um arquivo
                ObjectInputStream input = new ObjectInputStream(new FileInputStream(arquivoBiblioteca));//sempre cuidar se está digitando output ou input
                return input.readObject();
            }
        } catch (Exception e) {
            System.out.println("ERRO ao ler o arquivo!" + e);
        }
        return null;
    }
}
