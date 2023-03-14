package Punto2;

/**
 *
 * @author JAIME EDUARDO DIAZ TOBON
 */
public class HilosAsincronos extends Thread {
    
    public static int acum = 0;
    
    public HilosAsincronos(String name) {
        super(name);
    }
    
    @Override
    public void run() {
        for (int i = 0; i < 5000; i++) {
            acum++;
        }
        System.out.println("Hilo " + getName() + ". Termino. acum = " + acum);
    }
}
