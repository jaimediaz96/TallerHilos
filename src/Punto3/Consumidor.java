package Punto3;

/**
 *
 * @author JAIME EDUARDO DIAZ TOBON
 */
public class Consumidor extends Thread {
    
    Contenedor contenedor;
    
    public Consumidor(Contenedor contenedor) {
        this.contenedor = contenedor;
    }
    
    @Override
    public void run() {
        int value;
        for (int i = 0; i < 10; i++) {
            value = contenedor.get();
            System.out.println("consumidor.get: " + value);
        }
    }
}
