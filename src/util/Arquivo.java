import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.PrintWriter;

public class Arquivo <T>{
    File f;

    public Arquivo (String caminho){
        f = new File (System.getProperty("user.dir") + "/data/" + caminho);
        Scanner scan = new Scanner(caminho);
    }

    public void escrever (List<T> itens){
        try {
            PrintWriter writer = new PrintWriter(f);
            writer.print("");
            writer.close();

            FileOutputStream fos = new FileOutputStream(f);

            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(itens);
            oos.close();

            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<T> ler (){
        if(f.length() != 0) {
            List<T> itens = new ArrayList<>();

            try {
                FileInputStream fis = new FileInputStream(f);
                ObjectInputStream ois = new ObjectInputStream(fis);
                Object obj = ois.readObject();

                if (obj instanceof List<?>) {
                    itens = (List<T>) obj;
                } else {
                    System.err.println("Erro: O objeto lido não é uma lista!");
                }
                ois.close();
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                System.out.println(e);
            }

            return itens;
        }
        else{
            return null;
        }
    }
}