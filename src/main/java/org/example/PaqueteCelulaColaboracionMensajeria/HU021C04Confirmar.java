package org.example.PaqueteCelulaColaboracionMensajeria;

import java.util.Scanner;

public class HU021C04Confirmar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nombreUsuario;
        String correoUsuario;
        do {
            System.out.println("Por favor ingrese su nombre completo: ");
            nombreUsuario = scanner.nextLine();
        } while (nombreUsuario.trim().isEmpty());
        do {
            System.out.println("Por favor ingrese su correo electrónico: ");
            correoUsuario = scanner.nextLine();
        } while (correoUsuario.trim().isEmpty());
        System.out.println("felicidades! " + nombreUsuario + " se ha registrado correctamente ");
        //hi
    }
}
