package org.example.PaqueteCelulaColaboracionMensajeria;

import java.time.LocalDate;
import java.util.ArrayList;

public class HU039C01LimitarLasColaboracionesPorDia {

    private static final int LIMITE_DIARIO = 3;
    private ArrayList<LocalDate> colaboracionesHoy = new ArrayList<>();

    public boolean registrarColaboracion() {
        LocalDate hoy = LocalDate.now();

        // Limpiar registros de fechas previas que no son hoy
        colaboracionesHoy.removeIf(fecha -> !fecha.equals(hoy));

        if (colaboracionesHoy.size() >= LIMITE_DIARIO) {
            // Excede el límite
            System.out.println("Has alcanzado el límite de " + LIMITE_DIARIO + " colaboraciones por día.");
            return false;
        } else {
            colaboracionesHoy.add(hoy);
            System.out.println("Colaboración registrada. Total hoy: " + colaboracionesHoy.size());
            return true;
        }
    }

    public static void main(String[] args) {
        HU039C01LimitarLasColaboracionesPorDia colaborador = new HU039C01LimitarLasColaboracionesPorDia();

        // Simula intentos de colaboración.
        for (int intento = 1; intento <= 5; intento++) {
            System.out.println("Intento #" + intento + ":");
            boolean exito = colaborador.registrarColaboracion();
            if (!exito) {
                System.out.println("No puedes colaborar más hoy.\n");
            } else {
                System.out.println("Colaboración aceptada.\n");
            }
        }
    }
}
