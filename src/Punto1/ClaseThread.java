package Punto1;

/**
 *
 * @author JAIME EDUARDO DIAZ TOBON
 */
public class ClaseThread extends Thread {

    int time;

    public ClaseThread(String name, int time) {
        super(name);
        this.time = time;
    }

    @Override
    public void run() {
        while (true) {
            try {
                sleep(time);
                System.out.println("Hola mundo!, te saluda el hilo: " + getName());
            } catch (InterruptedException ex) {
                System.out.println("ERROR\nSleep " + ex.getMessage());
            }
        }
    }
}
