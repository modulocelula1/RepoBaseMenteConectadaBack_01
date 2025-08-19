package org.example.PaqueteCelulaColaboracionMensajeria;

import java.util.ArrayList;
import java.util.Scanner;

public class HU026C01RestaurarContraseña {  // Es buena práctica que la clase pública y el archivo tengan el mismo nombre.

    // Clase Usuario
    static class Usuario {
        String correo;
        String contrasena;
    }

    public static void main(String[] args) {
        // Lista de usuarios registrados
        ArrayList<Usuario> usuarios = new ArrayList<>();

        // Crear usuarios manualmente y asignar correo y contraseña
        Usuario juan = new Usuario();
        juan.correo = "juan@example.com";
        juan.contrasena = "1234";

        Usuario ana = new Usuario();
        ana.correo = "ana@example.com";
        ana.contrasena = "abcd";

        Usuario pedro = new Usuario();
        pedro.correo = "pedro@example.com";
        pedro.contrasena = "qwerty";

        usuarios.add(juan);
        usuarios.add(ana);
        usuarios.add(pedro);

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Recuperación de Contraseña ===");
        System.out.print("Ingrese su correo electrónico: ");
        String correoIngresado = scanner.nextLine();

        // Buscar el usuario por correo
        Usuario usuarioEncontrado = null;
        for (Usuario u : usuarios) {
            if (u.correo.equalsIgnoreCase(correoIngresado)) {
            }

        }
    }
}