package Punto4;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author JAIME EDUARDO DIAZ TOBON
 */
public class TestPunto4 {
    
    static String source[] = new String[4];
    static String name[] = new String[4];
    
    static void getSource(String nameFile) {
        String nombreArchivo = nameFile;
        FileReader fr;
        try {
            fr = new FileReader(nombreArchivo);
            BufferedReader in = new BufferedReader(fr);
            int i = 0;
            while (true) {
                try {
                    String linea = in.readLine();

                    if (linea == null) {
                        break;
                    }
                    String datos[] = linea.split(",");
                    source[i] = datos[0];
                    name[i] = datos[1];
                    i++;
                }
                catch (IOException x) {
                    System.err.println("Error de IO: " + x.getMessage());
                    System.exit(0);
                }
            }
        } catch (FileNotFoundException x) {
            System.err.println("Error: archivo no existe");
            System.err.println(x.getMessage());
            System.exit(0);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        getSource("urls.txt");
        Thread hilo1 = new Thread(new Donwload(source[0], name[0]), "1");
        Thread hilo2 = new Thread(new Donwload(source[1], name[1]), "2");
        Thread hilo3 = new Thread(new Donwload(source[2], name[2]), "3");
        Thread hilo4 = new Thread(new Donwload(source[3], name[3]), "4");
        
        hilo1.start();
        hilo2.start();
        hilo3.start();
        hilo4.start();
    }
}