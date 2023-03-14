package Punto1;

import static java.lang.Thread.sleep;

/**
 *
 * @author JAIME EDUARDO DIAZ TOBON
 */
public class InterfazRunnable implements Runnable {

    int time;
    
    public InterfazRunnable(int time) {
        this.time = time;
    }
    
    @Override
    public void run() {
        while (true) {
            try {
                sleep(time);
                System.out.println("Hola mundo, te saluda el hilo: " + Thread.currentThread().getName());
            } catch (InterruptedException ex) {
                System.out.println("ERROR\nSleep " + ex.getMessage());
            }
        }
    }
}
