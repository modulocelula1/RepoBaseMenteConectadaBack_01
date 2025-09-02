package org.example.PaqueteCelulaColaboracionMensajeria;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class HU032C01OrdenarColaboracionesPorFecha {
    public static void main(String[] args) {

        ArrayList<String[]> colaboraciones = new ArrayList<>();

        colaboraciones.add(new String[]{"Proyecto A", "2023-08-10"});
        colaboraciones.add(new String[]{"Proyecto B", "2025-09-01"});
        colaboraciones.add(new String[]{"Proyecto C", "2024-06-20"});
        colaboraciones.add(new String[]{"Proyecto D", "2024-07-07"});
        colaboraciones.add(new String[]{"Proyecto E", "2024-05-12"});

        ordenarPorFecha(colaboraciones);
        System.out.println("Colaboraciones ordenadas por fecha:");
        for (String[] colaboracion : colaboraciones){
            System.out.println(colaboracion [0] + " En la fecha: " + colaboracion [1]);
        }

        String[] masReciente = colaboraciones.get(colaboraciones.size() - 1);
        System.out.println("\nColaboración más reciente:");
        System.out.println(masReciente[0] + " En la fecha: " + masReciente[1]);
    }

    //fechas ordenadas
    public static void ordenarPorFecha(ArrayList<String[]> lista) {
        Collections.sort(lista, new Comparator<String[]>() {
            public int compare(String[] a, String[] b) {
                return a[1].compareTo(b[1]);
            }
        });
    }
}
