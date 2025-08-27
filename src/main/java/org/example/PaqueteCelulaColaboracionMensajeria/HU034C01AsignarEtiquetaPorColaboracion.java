package org.example.PaqueteCelulaColaboracionMensajeria;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
public class HU034C01AsignarEtiquetaPorColaboracion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<HashMap<String, String>> usuarios = new ArrayList<>();
        int opcion = -1;

        do {
            System.out.println(" Gestión de Etiqueta de Colaboración  ");
            System.out.println("1  Crear usuario");
            System.out.println("2 Listar usuarios");
            System.out.println("3.Modificar etiqueta de un usuario");
            System.out.println("0 Salir");
            System.out.print("Elige una opción: ");

            try {
                opcion = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                opcion = -1;
            }

            switch (opcion) {
                case 1: {
                    HashMap<String, String> u = new HashMap<>();
                    System.out.print("Nombre: ");
                    u.put("nombre", scanner.nextLine());
                    System.out.print("Correo: ");
                    u.put("correo", scanner.nextLine());
                    System.out.print("Etiqueta de colaboración: ");
                    u.put("etiqueta", scanner.nextLine());
                    usuarios.add(u);
                    System.out.println(" Usuario creado con éxito.");
                    break;
                }
                case 2: {
                    if (usuarios.isEmpty()) {
                        System.out.println("No hay usuarios registrados.");
                    } else {
                        System.out.println(" Lista de usuarios slac");
                        for (int i = 0; i < usuarios.size(); i++) {
                            HashMap<String, String> x = usuarios.get(i);
                            System.out.println(
                                    (i + 1) + ". Nombre: " + x.get("nombre") +
                                            " | Correo: " + x.get("correo") +
                                            " | Etiqueta: " + x.get("etiqueta")
                            );
                        }
                    }
                    break;
                }
                case 3: {
                    System.out.print("Ingresa el correo del usuario a modificar: ");
                    String correoBuscado = scanner.nextLine();
                    boolean encontrado = false;
                    for (HashMap<String, String> x : usuarios) {
                        if (x.get("correo").equalsIgnoreCase(correoBuscado)) {
                            System.out.print("Nueva etiqueta: ");
                            String nueva = scanner.nextLine();
                            x.put("etiqueta", nueva);
                            System.out.println(" Etiqueta actualizada.");
                            encontrado = true;
                            break;
                        }
                    }
                    if (!encontrado) {
                        System.out.println("⚠️ Usuario no encontrado por ese correo.");
                    }
                    break;
                }
                case 0:
                    System.out.println("Saliendo... ¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción inválida. Intenta de nuevo.");
            }
        } while (opcion != 0);
    }
}




