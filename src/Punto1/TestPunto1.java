package Punto1;

/**
 *
 * @author JAIME EDUARDO DIAZ TOBON
 */
public class TestPunto1 {
    
    public static void main(String[] args) {
//        // =========== Clase Thread ===========
        new ClaseThread("1 de la clase Thread", 1000).start();
        new ClaseThread("2 de la clase Thread", 2000).start();
        new ClaseThread("3 de la clase Thread", 3000).start();
        new ClaseThread("4 de la clase Thread", 4000).start();
        new ClaseThread("5 de la clase Thread", 5000).start();
        new ClaseThread("6 de la clase Thread", 6000).start();
        
        // =========== Interfaz Runnable ===========
        new Thread(new InterfazRunnable(1000), "1 de la Interfaz Runnable").start();
        new Thread(new InterfazRunnable(2000), "2 de la Interfaz Runnable").start();
        new Thread(new InterfazRunnable(3000), "3 de la Interfaz Runnable").start();
        new Thread(new InterfazRunnable(4000), "4 de la Interfaz Runnable").start();
        new Thread(new InterfazRunnable(5000), "5 de la Interfaz Runnable").start();
        new Thread(new InterfazRunnable(6000), "6 de la Interfaz Runnable").start();
    }
}
