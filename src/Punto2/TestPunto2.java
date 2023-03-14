package Punto2;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author JAIME EDUARDO DIAZ TOBON
 */
public class TestPunto2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        // =========== HILOS ASINCRONOS ===========
//        System.out.println("acum = " + HilosAsincronos.acum);
//        new HilosAsincronos("1").start();
//        new HilosAsincronos("2").start();
//        new HilosAsincronos("3").start();
//        new HilosAsincronos("4").start();

        // =========== HILOS SINCRONIZADOS ===========
        System.out.println("acum = " + HilosSincronizados.acum);
        Thread hilo1 = new HilosSincronizados("1");
        Thread hilo2 = new HilosSincronizados("2");
        Thread hilo3 = new HilosSincronizados("3");
        Thread hilo4 = new HilosSincronizados("4");
        
        try {
            hilo1.start();
            hilo1.join();
            hilo2.start();
            hilo2.join();
            hilo3.start();
            hilo3.join();
            hilo4.start();
            hilo4.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(TestPunto2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
