package org.example.PaqueteCelulaColaboracionMensajeria;

import java.util.Scanner;

public class HU029C01SalirDelSistemaPorConsola {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String entrada;
        do {
            System.out.print("Ingrese texto (o escriba \"salir\" para terminar): ");
            entrada = scanner.nextLine().trim();
            if (entrada.equalsIgnoreCase("salir")) {
                System.out.println("¡Hasta luego!");
            } else {
                System.out.println("Has ingresado: " + entrada);
            }
        } while (!entrada.equalsIgnoreCase("salir"));
    }
}
