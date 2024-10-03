package clases;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Scanner;
import java.io.IOException;
import java.io.FileInputStream;

public class FlujoByteVariosAccesos {

    public static void inicio() throws IOException {
        Scanner teclado = new Scanner(System.in);

        escribir(true);

        leer();
        teclado.close();
    }

    public static void escribir(boolean minusculas) throws IOException{
        FileOutputStream escritor = null;

        try {

            escritor = new FileOutputStream("datos.dat",true);
            for (int i = 97; i < 123; i++) {
                escritor.write(i);
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } finally {
            if (escritor!=null) escritor.close();
        }
    }

    public static void leer() throws IOException{
        FileInputStream lector = null;

        try {
            lector = new FileInputStream("datos.dat");
            int valor = lector.read();
            while (valor!=-1){
                System.out.println(valor + " ");
                valor = lector.read();
            }
            System.out.println();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }finally {
            if (lector!=null) lector.close();
        }
    }

}


