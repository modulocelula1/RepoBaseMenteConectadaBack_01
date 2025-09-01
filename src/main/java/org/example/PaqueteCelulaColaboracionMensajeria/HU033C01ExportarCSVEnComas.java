package org.example.PaqueteCelulaColaboracionMensajeria;


import java.util.ArrayList;


public class HU033C01ExportarCSVEnComas {
    public static void main(String[] args) {
        ArrayList<String[]> historial = new ArrayList<>();

        String[] encabezado = {"Nombre", "Especialidad", "Tipo ", "Tiempo"};

        historial.add(new String[]{"Juan", "Cardiología", "Correo", "30min"});
        historial.add(new String[]{"María", "Psicología", "Video", "45min"});
        historial.add(new String[]{"Pedro", "Neurología", "Teléfono", "20min"});

        for (String arriba : encabezado){
            System.out.print(arriba + "\t");
        }
        System.out.println();

        for (String[] fila : historial){
            for (String columna : fila){
                System.out.print(columna + ",\t" );
            }
            System.out.println();
        }

    }

}
