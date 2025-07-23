package org.example.PaqueteCelulaColaboracionMensajeria;

import java.util.Scanner;

public class HU022C04IniciarSesion {






        public static void main(String[] args) {

            final String CORREO_VALIDO = "usuario@example.com";
            final String CONTRASEÑA_VALIDA = "password123";
            int countIntentos = 0;

            Scanner scanner = new Scanner(System.in);

            while(countIntentos < 3){
                System.out.print("Por favor, ingresa tu correo electrónico: ");
                String correoIngresado = scanner.nextLine();

                System.out.print("Por favor, ingresa tu contraseña: ");
                String contraseñaIngresada = scanner.nextLine();


                if (correoIngresado.equalsIgnoreCase(CORREO_VALIDO) && contraseñaIngresada.equalsIgnoreCase(CONTRASEÑA_VALIDA)) {
                    System.out.println("\n¡Inicio de sesión exitoso! Bienvenido.");
                    break;
                } else {
                    System.out.println("\nError: Correo electrónico o contraseña incorrectos. Por favor, inténtalo de nuevo.\n");
                    countIntentos++;
                }
                if(countIntentos == 3) System.out.println("\n" + "\n" + "\n" + "Muchos intentos fallidos, contactese con su administrador.");

            }

        }
    }

