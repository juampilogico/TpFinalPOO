package Units;

public class Unidad {

    private Camion unCamion;

    public void asignarUnidad(Camion unCamion){
            this.unCamion = unCamion;
    }

    public Camion unidadAsignada(){
        return unCamion;
    }
}
