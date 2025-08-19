package org.example.PaqueteCelulaColaboracionMensajeria;


import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class HU030C01AsignarCalificacionColaboracion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> estrella = new ArrayList<>();

        while (true) {
        try {
            System.out.println("Gracias por hacer parte de esta colaboracion!");
            System.out.print("\nPor favor ingresa un numero entre 1 y 5 para calificar la colaboracion: " +
                    "\n\nSi desea salir del programa digite 0: ");
            Integer numero = sc.nextInt();

            
            if (numero == 0) {
                System.out.println("\n**** Historial de calificaciones ****");
                for (int i : estrella) {
                    System.out.print("Calificación " + i + ": ");
                    for (int j = 0; j < i; j++) {
                        System.out.print("⭐");
                    }
                    System.out.println();
                }
                System.out.println("Gracias por participar");
                break;
            }
            if (numero <1 || numero >5) {
                System.out.println("Error!: El numero a digitar debe estar entre 1 y 5 para calificar");
                continue;
            }
            //Agragar al arreglo la calificacion
            estrella.add(numero);
            System.out.println("Tu calificacion actual: ");
            for (int j = 0; j < numero; j++) {
                System.out.print("⭐");
            }
            System.out.println("\nCalificacion guardad");

        } catch (InputMismatchException match ){
                System.out.println("¡ERROR!✖️ debes ingresar un numero enteros");
                sc.next();
            }






        }


    }

}
