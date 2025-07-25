package org.example.PaqueteCelulaColaboracionMensajeria;

import java.util.ArrayList;

public class HU025C04ListarRegistrosActuales {
    public static void main(String[] args) {
        ArrayList<String[]> registros=new ArrayList<>();
        //Agregamos valores quemados a la lista
        //Usamos []para trabajar con los arreglo unidimencionales en en vez <>(Declara genericos) la lista para tomar mas de un valor en esta
        registros.add(new String[]{"juana23", "Juana Martínez", "Psicóloga"});
        registros.add(new String[]{"mario98", "Mario Ruiz", "Paciente"});
        registros.add(new String[]{"lina_admin", "Lina Gómez", "Administrador"});

        System.out.print("La lista de registros actuales es: ");
        /*Este for lo que hacemos es recorrer la lista hasta que el contador .size sea menor que los registros
         * lo que hace la u es crear una variable guardar la recuperacion de datos de la lista llamada*/
        for (int i =0; i <registros.size(); i++){
            String[] u= registros.get(i);
            System.out.println("\nRegisto #"+(i+1) +
                    ": Usuario: "+u[0]+
                    ", Nombre: "+u[1]+
                    ", Rol: "+u[2]);

        }
        //****HU025C01****

    }
}
