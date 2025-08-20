package org.example.PaqueteCelulaColaboracionMensajeria;
import java.util.ArrayList;
import java.util.Scanner;
/*
Aqui estoy definiendo una clase para crear los objetos que se llamaran Colaboracion, sus atributos principales son name y estado
inicializado name que va a ser un string que se lo voy a paasar cuando llame al objeto y estado que siempre incian activadas
* */
class Colaboracion {
    String name;
    String state;

    Colaboracion(String name) {
        this.name = name;
        this.state = "activa";
    }
    //Esto es un metodo para cambiar el estado del objeto a cerradas
    void close() {
        this.state = "cerrada";
    }
}

public class HU036C04CerrarColaboracionesActivas {

    /**
     * Creo la funcion que va recibir un array del tipo del objeto que declaramos en la linea 8
     * Este va  a iterar sobre el array y a cada uno de sus items le va a cambiar el estado a cerrada llamando el metodo close del molde colaboracion
     * Al final solo incremente el contador y me devuelve el numero**/
    static int cerrarTodas(ArrayList<Colaboracion> colaboraciones) {
        int count = 0;
        for (Colaboracion colaboracion : colaboraciones) {
            if (colaboracion.state.equals("activa")) {
                colaboracion.close();
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Lista de colaboraciones quemadas
        ArrayList<Colaboracion> colaboraciones = new ArrayList<>();
        colaboraciones.add(new Colaboracion("Colaboracion 1"));
        colaboraciones.add(new Colaboracion("Colaboracion 2"));
        colaboraciones.add(new Colaboracion("Colaboracion 3"));

        int  closed = 0;
        String inputUser;

        // Bucle hasta que ingrese una opción válida
        while (true) {
            try {
                System.out.print("Quieres cerrar todas las colaboraciones activas? (s/n): ");
                inputUser = sc.nextLine().trim().toLowerCase();
                /**
                 * Si el usuario a la hora de responde presiona S voy a llamar la funcion cerrarTodas  y le voy a pasar mi arreglo y lo guardo en una variable llamada closed
                 * Solamente imprimo el mensaje de cuantas colaboraciones se cerraron y salgo del while
                 * **/
                if (inputUser.equals("s")) {
                    closed = cerrarTodas(colaboraciones);
                    System.out.println("Se cerraron " + closed + " colaboraciones");
                    break;

                }

                /**
                 * Si el usuario presiona N solo muestro que no se modifico ninguna colaboracion y salgo del while
                 * **/
                else if (inputUser.equals("n")) {
                    System.out.println("No se cerro ninguna colaboración.");
                    break;
                }
                /**
                 * Si presiona algo diferente manejo la excepcion mostrando un mensaje
                 * **/
                else {
                    throw new IllegalArgumentException("Respuesta invalida. Solo se permite 's' o 'n'");
                }
            }
            /** Muestro el error y el e.getMessage()) se encarga de concatener el throw o sea el mensaje que defini **/
            catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        /**
         * Muestro como quedaron todas las colaboraciones mediante un ciclo for, este ciclo siempre se va a mostrar cuando el break se active
         * **/
        for (Colaboracion c : colaboraciones) {
            System.out.println(c.name + " -> " + c.state);
        }
    }
}
