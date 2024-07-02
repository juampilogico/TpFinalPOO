package Directions;

import Paquete.Paquete;

public class Destino {
    private String descripcion;
    private Distancia distancia;

    public Destino(String descripcion){
        this.descripcion = descripcion;
    }
    public String verDestino(){
        return descripcion;
    }

    public void asignarDistancia(Distancia distancia){
        this.distancia = distancia;
    }

    public Distancia distanciaAsignada(){
        return this.distancia;
    }


}
