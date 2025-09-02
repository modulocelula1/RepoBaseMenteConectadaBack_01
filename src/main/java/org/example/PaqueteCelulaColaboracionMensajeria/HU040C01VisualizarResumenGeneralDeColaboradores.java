package org.example.PaqueteCelulaColaboracionMensajeria;

public class HU040C01VisualizarResumenGeneralDeColaboradores {
    public static void main(String[] args) {

        String[] colaboradores = {
                "activo", "completado", "activo", "completado",
                "completado", "activo", "activo", "completado",
                "no activo", "no completado", "activo", "no completado",
                "activo", "completado", "no activo", "no completado",
                "activo", "completado", "activo", "completado",
                "completado", "activo", "activo", "completado",
                "no activo", "no completado", "activo", "no completado",
                "activo", "completado", "no activo", "no completado"
        };

        mostrarColaboradores(colaboradores);
    }

    public static void mostrarColaboradores(String[] estado) {
        int total = estado.length;
        int activos = 0;
        int completados = 0;

        for (int i = 0; i < estado.length; i++) {
            if (estado[i].equalsIgnoreCase("activo")) {
                activos++;
            } else if (estado[i].equalsIgnoreCase("completado")) {
                completados++;
            }
        }

        double porcentajeExito = 0;
        if (total > 0) {
            porcentajeExito = (completados * 100.0) / total;
        }

        // Imprimir tabla
        System.out.println("+----------------------------+");
        System.out.println("| Resumen de Colaboradores  |");
        System.out.println("+----------------------------+");
        System.out.printf("| Total         | %4d       |\n", total);
        System.out.printf("| Activos       | %4d       |\n", activos);
        System.out.printf("| Completados   | %4d       |\n", completados);
        System.out.printf("| %% de Éxito    | %5.1f%%     |\n", porcentajeExito);
        System.out.println("+----------------------------+");
    }
}
