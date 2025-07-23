package org.example.PaqueteCelulaColaboracionMensajeria;

import java.util.Scanner;

public class HU021C04Confirmar {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        String nombreUsuario;
        String correoUsuario;

        System.out.println("\n Por favor ingrese su nombre completo ");
        nombreUsuario= scanner.nextLine();

        System.out.println("\n por favor ingrese su correo electronico ");
        correoUsuario= scanner.nextLine();

        if (nombreUsuario.equals("") || correoUsuario.equals("")){
            System.out.println("Error, validar que los campos no esten vacioss ");

        } else {
            System.out.println("felicidades " + nombreUsuario + " se ha registrado correctamente. ");

        }
    }
}
