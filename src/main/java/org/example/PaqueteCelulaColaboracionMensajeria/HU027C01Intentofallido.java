package org.example.PaqueteCelulaColaboracionMensajeria;

import java.util.InputMismatchException;
import java.util.Scanner;

public class HU027C01Intentofallido{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int intentos = 0;


        while (intentos <3){
            try {
                System.out.println(" INICIO DE SECION ");

                System.out.println("📋📋 Ingrese nombre completo: ");
                String nombre=scanner.nextLine();

                System.out.println("📧📧 Ingrese el correo electronico: ");
                String correo= scanner.nextLine();

                System.out.println("🔑🔑 Ingrese la contraseña: ");
                String contraseña= scanner.nextLine();

                inicioSecion(correo, contraseña, nombre);
                System.out.println("🎉 ¡Inicio de sesión exitoso! 🎉");
                break;


            }catch (Exception error){
                intentos ++;
                System.out.println("Error: " +error.getMessage());
            }

        } if (intentos ==3){
            System.out.println("🚫 Has excedido los intentos permitidos. Usuario bloqueado.");
        }
    }

    public static boolean inicioSecion(String correo, String contraseña, String nombre){

        if (nombre == null || nombre.trim().isEmpty()) {
            throw new InputMismatchException("⚠️ El nombre no puede estar vacío.");
        }

        if (correo.matches("^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,}$")){
            throw new InputMismatchException("⚠️ Correo invalido. Verifique que tenga @ y ´.´ ");
        }

        if (contraseña.length() <= 5) {
            throw new InputMismatchException("⚠️ contraseña invalida. verifique que tenga mas de 5 caracteres. ");
        }
        return true;

    }
}
