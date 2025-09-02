package org.example.PaqueteCelulaColaboracionMensajeria;


import java.util.HashMap;
import java.util.Scanner;

public class HU037C01ColaboracionPorUsuario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int iterador=0;
        String clave, valor;

        HashMap<String, String> usuarios = new HashMap<>();
        while (true){
            System.out.println("Bienvenido a la lista de colaboraciones: ");
            System.out.println("Por favor ingrese su usuario: ");
            clave = sc.nextLine();
            System.out.println("Por favor ingrese su correo: ");
            valor = sc.nextLine();

            if (usuarios.containsKey(clave)){
                System.out.println("El usuario " + clave + " ya cuenta con registros de colaboracion");
                continue;
            } else
                usuarios.put(clave, valor);

            for (String lista : usuarios.keySet())
                System.out.println("Lista de colaboracion\n"+lista + "===>" + usuarios.get((lista)));
            System.out.println("¿Desea continuar?\n si es asi, ingrese uno, de lo contrario digite cualquier tecla");
            String opcion = sc.nextLine();
            if (opcion.equals("0"))
                break;




        }
    }
}
