package Punto4;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

/**
 *
 * @author JAIME EDUARDO DIAZ TOBON
 */
public class Donwload implements Runnable {
    
    private final String source;
    private final String fileName;
    
    public Donwload(String source, String fileName) {
        this.source = source;
        this.fileName = fileName;
    }
    
    @Override
    public void run() {
        try {
            URL url = new URL(source);
            FileOutputStream out;
            try (InputStream in = url.openStream()) {
                out = new FileOutputStream(fileName);
                byte[] buffer = new byte[1024];
                int bytesRead;
                while ((bytesRead = in.read(buffer)) != -1) {
                    out.write(buffer, 0, bytesRead);
                }
            }
            out.close();

            System.out.println("Archivo " + fileName + " descargado exitosamente. Por el hilo " + Thread.currentThread().getName());
        } catch (IOException e) {
            System.out.println("ERROR\n" + e.getMessage());
        }
    }
}
