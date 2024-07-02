package Menu;
import Directions.Destino;
import Directions.Distancia;
import Paquete.Paquete;
import Paquete.Peso;
import Paquete.Precio;


import java.util.InputMismatchException;
import java.util.Scanner;
public class Menu {

    public Menu(){

        Scanner unMenu = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("----- Menú -----");
            System.out.println("1. Ingresar usuario");
            System.out.println("2. Ingresar destino");
            System.out.println("3. Calcular costos de envio ");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = unMenu.nextInt();

            try {

                switch (opcion) {
                    case 1:
                        Scanner usuario = new Scanner(System.in);
                        System.out.println("Ingrese su nombre: ");
                        String persona = usuario.nextLine();
                        System.out.println("Bienvenido " + persona +" al sistema de calculo de envios");
                        break;
                    case 2:
                        Scanner unidad = new Scanner(System.in);
                        Scanner destino = new Scanner(System.in);
                        Scanner distancia = new Scanner(System.in);


                        System.out.println("Ingrese el destino a enviar: ");
                        String desti1 = destino.nextLine();
                        System.out.println("Ingrese la distancia en km: ");
                        int dist = distancia.nextInt();
                        System.out.println("Ingrese el transporte elegir: ");
                        String transporte = unidad.nextLine();

                        Distancia distancia1 = new Distancia(dist);
                        Destino desti = new Destino(desti1);


                        System.out.println("Destino ingresado: " + desti.verDestino() );
                        System.out.println("Distancia ingresada: " + distancia1.verDistancia() + "Km");
                        System.out.println("Tranporte elegido: " + transporte);

                        break;
                    case 3:
                        Scanner paquete = new Scanner(System.in);
                        Scanner peso = new Scanner(System.in);


                        System.out.println("Ingrese el paquete a enviar: ");
                        String envio1 = paquete.nextLine();
                        Paquete paquet = new Paquete(envio1);
                        System.out.println("Ingrese el peso en Kilos del paquete: ");
                        double peso1 = peso.nextDouble();
                        Paquete tele = new Paquete("" + envio1);

                        Peso kilos = new Peso(peso1);
                        System.out.println("Objetos ingresado : " + paquet.verPaquete());
                        System.out.println("Peso ingresado: " + kilos.verPeso() + " Kilos");

                        Precio precioF = new Precio();
                        precioF.asignarPrecio(kilos);
                        System.out.println("Costo aproximado del envio: " + precioF.precioAsignado() + "$");
                        break;
                    case 4:
                        System.out.println("Saliendo,gracias por elegirnos!");
                        break;
                    default:
                        System.out.println("Opción no válida. Intente de nuevo.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada no válida. Por favor, ingrese un número.");
                unMenu.next();
            }

            System.out.println();

        } while (opcion != 4);

        unMenu.close();
    }
}

