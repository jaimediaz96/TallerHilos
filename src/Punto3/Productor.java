package Punto3;

/**
 *
 * @author JAIME EDUARDO DIAZ TOBON
 */
public class Productor extends Thread {
    
    Contenedor contenedor;
    
    public Productor(Contenedor contenedor) {
        this.contenedor = contenedor;
    }
    
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            contenedor.put(i);
            System.out.println("Productor.put: " + i);
        }
    }
}
