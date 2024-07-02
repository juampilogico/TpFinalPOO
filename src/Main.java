import Directions.Destino;
import Directions.Distancia;
import Menu.Menu;
import Paquete.Precio;
import Paquete.Paquete;
import Units.Avion;
import Units.Camion;
import Units.Furgon;
import Units.Unidad;
import User.UserDates;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Tuvimos varios problemas haciendo el menu, siempre nos daba algún error (variable no inicializada o NullPointer, etc) sacando lo del menu,
        // nos resulta facil ir conectando las clases entre ellas, lo basico si lo entendemos, y tratamos de no usar mucho el if.

        //Menu
         Menu menu = new Menu();

        //Usuario
        UserDates mario = new UserDates();
        UserDates pato = new UserDates();
        UserDates mike = new UserDates();

        //Paquete
        Paquete tele = new Paquete("Television de 180'");
        Paquete flores = new Paquete("Flores ==' ");
        Paquete covid = new Paquete("Vilus");

        //Destino
        Destino pinamar = new Destino("Pinamar");
        Destino colombia = new Destino("Colombia (de la buena ;) )");
        Destino china = new Destino("China pa");

        //Nombrar unidades
        Camion vehiculo1 = new Camion("Camion");
        Furgon vehiculo2 = new Furgon("Furgon");
        Avion vehiculo3 = new Avion("Avion");

        //Distancias
        Distancia d1 = new Distancia(8);
        Distancia d2 = new Distancia(5300);
        Distancia d3 = new Distancia(8900);


        //Unidades a usar
        Unidad camion = new Unidad();
        Unidad furgon = new Unidad();
        Unidad avion = new Unidad();

        //Precios


        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
                                                //Asignaciones

        //Asignar distancia a cada destino
        pinamar.asignarDistancia(d1);
        colombia.asignarDistancia(d2);
        china.asignarDistancia(d3);


        //Asignar unidad al envio
        camion.asignarUnidad(vehiculo1);
        furgon.asignarUnidad(vehiculo2);
        avion.asignarUnidad(vehiculo3);


        //Asignar destino a los paquetes
        tele.asignarDestino(pinamar);
        flores.asignarDestino(colombia);
        covid.asignarDestino(china);

        //Asignar paquetes a los usuarios
        mario.asignarPaquete(tele);
        pato.asignarPaquete(flores);
        mike.asignarPaquete(covid);

        //SOUT
        System.out.println("Mario envia " + tele.verPaquete() + " con destino a: " + mario.paqueteAsignado().destinoAsignado().verDestino() + " en la unidad: " + camion.unidadAsignada().verUnidad());
        System.out.println("El envio cuenta con una Distancia de " + d1.verDistancia() + "Km" );
        System.out.println("Pato envia " + flores.verPaquete() + " con destino a: " + pato.paqueteAsignado().destinoAsignado().verDestino() + " en la unidad: " + furgon.unidadAsignada().verUnidad());
        System.out.println("El envio cuenta con una Distancia de " + d2.verDistancia() + "Km" );
        System.out.println("Mike envia " + covid.verPaquete() + " con destino a: " + mike.paqueteAsignado().destinoAsignado().verDestino() + " en la unidad:" + avion.unidadAsignada().verUnidad());
        System.out.println("El envio cuenta con una Distancia de " + d3.verDistancia() + "Km" );
    }
}