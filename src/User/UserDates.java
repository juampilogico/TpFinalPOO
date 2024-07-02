package User;

import Paquete.Paquete;

public class UserDates {
    private Paquete paquete;

    public void asignarPaquete(Paquete paquete ){
            this.paquete= paquete;
    }
    public Paquete paqueteAsignado(){
        return this.paquete;
    }
}
