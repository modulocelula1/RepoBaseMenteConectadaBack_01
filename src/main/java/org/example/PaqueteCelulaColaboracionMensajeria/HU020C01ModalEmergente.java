package org.example.PaqueteCelulaColaboracionMensajeria;

import javax.swing.*;
import java.awt.*;

public class HU020C01ModalEmergente {

    public static void main(String[] args) {

        // Garantiza que la interfaz gráfica se ejecute en el hilo correcto (EDT)

        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Ejemplo de Respuesta Modal");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(300, 200);
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);

            // Solicita al usuario que ingrese una respuesta
            String respuesta = JOptionPane.showInputDialog(
                    frame,
                    "Escribe tu respuesta:",
                    "Respuesta requerida.",
                    JOptionPane.PLAIN_MESSAGE
            );

            if (respuesta == null) {
                // Se presionó "Cancelar" o cerró la ventana.
                JOptionPane.showMessageDialog(
                        frame,
                        "Has cancelado la respuesta.",
                        "Cancelado",
                        JOptionPane.WARNING_MESSAGE
                );
            } else if (respuesta.trim().isEmpty()) {
                // Se ingresó texto vacío o solo espacios.
                JOptionPane.showMessageDialog(
                        frame,
                        "No se aceptan respuestas vacías.",
                        "Error",
                        JOptionPane.ERROR_MESSAGE
                );
            } else {
                // Entrada válida.
                JOptionPane.showMessageDialog(
                        frame,
                        "Has respondido: " + respuesta,
                        "Confirmación",
                        JOptionPane.INFORMATION_MESSAGE
                );
            }

            // Cierra la ventana principal después de la interacción.
            frame.dispose();
        });
    }
}
