package Punto3;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author JAIME EDUARDO DIAZ TOBON
 */
public class Contenedor {
    
    private int dato;
    static int consumir = 0;
    
    public synchronized int get() {
        while (consumir == 0) {            
            try {
                wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(Contenedor.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        consumir--;
        notifyAll();
        return dato;
    }
    
    public synchronized void put(int valor) {
        while (consumir != 0) {            
            try {
                wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(Contenedor.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        dato = valor;
        consumir = 2;
        notifyAll();
    }
}
