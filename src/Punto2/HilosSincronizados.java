package Punto2;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author JAIME EDUARDO DIAZ TOBON
 */
public class HilosSincronizados extends Thread {

    public static int acum = 0;
    public static boolean isAcumUse = false;

    public HilosSincronizados(String name) {
        super(name);
    }

    @Override
    public synchronized void run() {
        try {
            while (isAcumUse) {
                wait();
            }
            isAcumUse = true;
            acumular();
            isAcumUse = false;
            notifyAll();
        } catch (InterruptedException ex) {
            Logger.getLogger(HilosSincronizados.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void acumular() {
        for (int i = 0; i < 5000; i++) {
            acum++;
        }
        System.out.println("Hilo " + getName() + ". Termino. acum = " + acum);
    }
}
