import java.io.*;
import java.util.List;

public abstract class Salvar {
    private static File arquivoContas = new File("src/log/banco");
    
    public static void salvarArquivo(Object obj) {
        try {
            arquivoContas.getParentFile().mkdirs();
            ObjectOutputStream outP = new ObjectOutputStream(new FileOutputStream(arquivoContas));
            outP.writeObject(obj);

        } catch (Exception e) {
            System.out.println("ERRO ao salvar o arquivo! " + e);
        }
        
    }

    public static Object lerArquivo() {
        try {
            if(arquivoContas.exists() && arquivoContas.isFile()){//Verifica se ele existe e verifica se é um arquivo
                ObjectInputStream input = new ObjectInputStream(new FileInputStream(arquivoContas));//sempre cuidar se está digitando output ou input
                return input.readObject();
            }
        } catch (Exception e) {
            System.out.println("ERRO ao ler o arquivo!" + e);
        }
        return null;
    }
}
