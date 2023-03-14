package Punto3;

/**
 *
 * @author JAIME EDUARDO DIAZ TOBON
 */
public class TestPunto3 {
    
    public static void main(String[] args) {
        Contenedor contenedor = new Contenedor();
        Productor productor = new Productor(contenedor);
        Consumidor consumidor1 = new Consumidor(contenedor);
        Consumidor consumidor2 = new Consumidor(contenedor);
        
        productor.start();
        consumidor1.start();
        consumidor2.start();
    }
}