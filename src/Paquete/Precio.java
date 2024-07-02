package Paquete;
import Paquete.Peso;

public class Precio {
    private Peso kilos;
    double precio;

    public Precio() {
    }

    public void asignarPrecio(Peso kilos) {
        double peso = kilos.verPeso();
        while (peso >= 1) {
            this.precio = precio + 955;
            peso = peso - 1;
        }
    }
    public double precioAsignado(){
        return precio;
    }
}