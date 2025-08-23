package org.example.PaqueteCelulaColaboracionMensajeria;

import javax.swing.*;
import java.awt.*;

/**
 Clase principal, tiene JFrame = permite crear una ventana (frame).
 */

public class HU011C04AdministracionDeColaboradores extends JFrame {

    /**
      Solicitud individual.
      Etiqueta con el nombre y botones para aceptar o rechazar.
     */

    static class SolicitudPanel extends JPanel {
        JLabel label;
        JButton aceptar, rechazar;

        SolicitudPanel(String nombre) {
            // Usa FlowLayout para organizar los componentes horizontalmente.
            setLayout(new FlowLayout(FlowLayout.LEFT));
            setBorder(BorderFactory.createLineBorder(Color.BLACK));
            setBackground(Color.LIGHT_GRAY);

            label = new JLabel("Solicitud de: " + nombre);
            aceptar = new JButton("Aceptar");
            rechazar = new JButton("Rechazar");

            add(label);
            add(aceptar);
            add(rechazar);

            aceptar.addActionListener(e -> {
                setBackground(Color.GREEN);
                JOptionPane.showMessageDialog(this,
                        "Has aceptado la solicitud de " + nombre);
                aceptar.setEnabled(false);
                rechazar.setEnabled(false);
            });

            rechazar.addActionListener(e -> {
                setBackground(Color.RED);
                JOptionPane.showMessageDialog(this,
                        "Has rechazado la solicitud de " + nombre);
                aceptar.setEnabled(false);
                rechazar.setEnabled(false);
            });
        }
    }

    // Constructor.
    public HU011C04AdministracionDeColaboradores() {
        setTitle("Administración de Colaboraciones"); // Título de la ventana.
        setDefaultCloseOperation(EXIT_ON_CLOSE); // Permite cerrar la aplicación al cerrar la ventana
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS)); // Organiza paneles en columnas verticales.

        add(new SolicitudPanel("Juan"));
        add(new SolicitudPanel("Ana"));
        add(new SolicitudPanel("Pedro"));

        setSize(400, 200);// Tamaño de la ventana
        setLocationRelativeTo(null);//Centra ventana en ántalla.
    }
    /**
      Método main: punto de entrada del programa.
     Usamos SwingUtilities.invokeLater para crear y mostrar la ventana en el hilo correcto.
     ESto es muy importante! No lo elimines otra vez!!
     */
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new HU011C04AdministracionDeColaboradores().setVisible(true);
        });
    }
}
