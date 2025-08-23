package org.example.PaqueteCelulaColaboracionMensajeria;

import javax.swing.*;
import java.awt.*;

public class HU031C01EditarTipoDeColaboracion extends JFrame {
    private DefaultListModel<String> modelo = new DefaultListModel<>();

    public HU031C01EditarTipoDeColaboracion() {
        super("Gestión de Tipos de Colaboración");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);

        // Panel principal con botones.
        JPanel btnPanel = new JPanel(new FlowLayout());
        JButton btnAgregar = new JButton("Agregar colaboración");
        JButton btnVerEditar = new JButton("Ver / Editar colaboraciones");
        btnPanel.add(btnAgregar);
        btnPanel.add(btnVerEditar);
        add(btnPanel, BorderLayout.NORTH);

        // Acciones asociadas a cada botón.
        btnAgregar.addActionListener(e -> {
            String nueva = JOptionPane.showInputDialog(
                    this,
                    "Ingrese nueva categoría de colaboración:",
                    "Agregar colaboración",
                    JOptionPane.QUESTION_MESSAGE
            );
            // Si hay información.
            if (nueva != null && !nueva.trim().isEmpty()) {
                modelo.addElement(nueva.trim());
                JOptionPane.showMessageDialog(this, "¡Colaboración agregada!", "Confirmación", JOptionPane.INFORMATION_MESSAGE);
            // Si no hay informaicón
            } else if (nueva.trim().isEmpty()) {
                JOptionPane.showMessageDialog(this, "No se acepta una colaboración vacía.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        });

        btnVerEditar.addActionListener(e -> {
            JList<String> lista = new JList<>(modelo);
            JScrollPane scroll = new JScrollPane(lista);
            scroll.setPreferredSize(new Dimension(250, 150));

            int opcion = JOptionPane.showOptionDialog(
                    this,
                    scroll,
                    "Seleccione una colaboración para editar",
                    JOptionPane.OK_CANCEL_OPTION,
                    JOptionPane.PLAIN_MESSAGE,
                    null,
                    new String[]{"Editar", "Cerrar"},
                    "Editar"
            );

            if (opcion == JOptionPane.OK_OPTION && lista.getSelectedIndex() != -1) {
                int idx = lista.getSelectedIndex();
                String seleccion = lista.getSelectedValue();
                String nuevaCategoria = JOptionPane.showInputDialog(this, "Edite el tipo de colaboración:", seleccion);
                if (nuevaCategoria != null && !nuevaCategoria.trim().isEmpty()) {
                    modelo.set(idx, nuevaCategoria.trim());
                    JOptionPane.showMessageDialog(this, "Categoría actualizada a: " + nuevaCategoria.trim(), "Actualización exitosa", JOptionPane.INFORMATION_MESSAGE);
                } else if (nuevaCategoria != null) {
                    JOptionPane.showMessageDialog(this, "No se aceptan categorías vacías.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new HU031C01EditarTipoDeColaboracion().setVisible(true));
    }
}
