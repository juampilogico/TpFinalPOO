package Paquete;

import Directions.Destino;
import User.UserDates;
public class Paquete {
    private Destino destino;
    String descPaquete;

    public Paquete(String descPaquete){
        this.descPaquete= descPaquete;
    }
    public String verPaquete(){
        return descPaquete;
    }
    public void asignarDestino(Destino destino){
        this.destino = destino;
    }
    public Destino destinoAsignado(){
        return destino;
    }

}
