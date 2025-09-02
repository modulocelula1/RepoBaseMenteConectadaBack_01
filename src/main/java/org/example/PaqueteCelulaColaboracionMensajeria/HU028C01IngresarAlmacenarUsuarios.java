package org.example.PaqueteCelulaColaboracionMensajeria;

import java.util.ArrayList;
import java.util.Scanner;

public class HU028C01IngresarAlmacenarUsuarios {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> nombresCorreos =new ArrayList<>();
        ArrayList<Integer> edades = new ArrayList<>();
        ArrayList<String> correos = new ArrayList<>();

        String continuar;
        do {
            System.out.println("📋 AGREGAR DATOS DEL USUARIO 📋");
            System.out.print("Por favor ingrese el nombre:");
            String nombre = scanner.nextLine();
            System.out.println("Por favor ingrese la edad:");
            int edad = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Por favor ingrese el Email:");
            String email = scanner.nextLine();


            nombresCorreos.add(nombre);
            edades.add(edad);
            correos.add(email);


            System.out.println("¿Deseas ingresar otro usuario? (si/no)");
            continuar = scanner.nextLine().toLowerCase();

        } while (continuar.equals("si"));

        System.out.println("Registros agregados:");
        System.out.println("Usuario registrado: " + nombresCorreos);
        System.out.println("Edad" + edades);
        System.out.println("Email" + correos);

    }

}

