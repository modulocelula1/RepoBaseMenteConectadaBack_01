package org.example.PaqueteCelulaColaboracionMensajeria;

import java.util.Scanner;

public class HU023C04VerMenu {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int opcion;
            boolean salir = false;

            while (!salir) {
                // Menú principal
                System.out.println("°°°|||Bienvenido a tu App de Bienestar Mental|||°°°");
                System.out.println("1.  Sugerir una técnica de relajación");
                System.out.println("2. Mostrar una frase motivadora");
                System.out.println("3. Registrar cómo te sientes hoy");
                System.out.println("4. Salir");
                System.out.print("Selecciona una opción (1-4): ");
                opcion = sc.nextInt();
                sc.nextLine();

                switch (opcion) {
                    case 1:
                        System.out.println("tecnica de relajacion");
                        break;
                    case 2:
                        System.out.println("Mostrar una frase motivadora");
                        break;
                    case 3:
                        System.out.println("HOLA, ten un buen dia, ¿quieres contarnos como te sientes hoy?");
                        break;
                    case 4:
                        System.out.println("Espero que nuestra pagina haya sido de tu agrado, te esparamos pronto");
                        salir = true;
                        break;
                    default:
                        System.out.println("Opción no válida. Intenta de nuevo.");
                }
            }
        }
}

