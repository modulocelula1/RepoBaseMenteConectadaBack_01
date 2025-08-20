package org.example.PaqueteCelulaColaboracionMensajeria;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HU035C04SimularSistemaDeMensajesConOtrosUsuarios {
    // Lista de mensajes en orden de envío
    static List<String> mensajes = new ArrayList<>();

    // Agrega un mensaje al arrayList
    static void agregarMensaje(String texto) {
        mensajes.add(texto);
    }


    static void mostrarChat() {
        System.out.println("\n--- Chat ---");
        for (int i = 0; i < mensajes.size(); i++) {
            String remitente = (i % 2 == 0) ? "Tú" : "Otro";
            System.out.println(remitente + ": " + mensajes.get(i));
        }
        System.out.println("------------\n");
    }


    static String autoRespuesta(String ultimoMensaje) {
        if (ultimoMensaje.trim().isEmpty()) return "¿Podrías repetir?";
        if (ultimoMensaje.endsWith("?"))       return "Buena pregunta. Déjame pensar…";
        if (ultimoMensaje.length() < 8)        return "Ok.";
        return "Recibido: " + ultimoMensaje;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Simulador de chat (escribe 'salir' para terminar).");

        while (true) {
            System.out.print("Tú: ");
            String entrada = sc.nextLine();
            if (entrada.equalsIgnoreCase("salir")) break;

            agregarMensaje(entrada);
            mostrarChat();

            String respuesta = autoRespuesta(entrada);
            agregarMensaje(respuesta);
            mostrarChat();
        }

        System.out.println("Fin de la conversacion. Mensajes totales: " + mensajes.size());
    }

}
