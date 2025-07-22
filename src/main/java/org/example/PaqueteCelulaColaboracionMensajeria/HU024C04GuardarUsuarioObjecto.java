package org.example.PaqueteCelulaColaboracionMensajeria;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class HU024C04GuardarUsuarioObjecto {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //Inicio la declaracion del Hash, donde le digo que solo puede recibir datos tipo String y un ArrayList
        LinkedHashMap<String, ArrayList<String>> userInformation = new LinkedHashMap<>();
        /*
          Declaro 3 ArrayList todos del mismo tipo que me van a guardar
          todos los nombres que agregue, todos los emails y todas las especialidades
        */
        ArrayList<String> names = new ArrayList<>();
        ArrayList<String> emails = new ArrayList<>();
        ArrayList<String> roles = new ArrayList<>();

        //Voy a contar los usuarios que vaya agregando al sistema
        int countUsers = 0;

        //Esta variable se encargara de inciar mi bucle
        boolean state = true;

        do{
            System.out.println("Bienvenido al sistema, Que desea hacer? \n" +
                    "1. Ingresar un usuario \n" +
                    "2. Ver las informacion de los usuarios guardados \n" +
                    "3. Cambiar una especialidad de un usuario \n" +
                    "4. Salir"
            );

            int userOption = sc.nextInt();

            switch (userOption){
                case 1:
                    sc.nextLine();
                    System.out.println("Por favor ingrese su nombre: ");
                    String name = sc.nextLine();
                    //Aqui lo que estoy haciendo es tomando el dato guardado en la variable name(singular) y guardalo en mi ArrayList llamado names(plural)
                    names.add(name);

                    System.out.println("Ahora ingrese su correo: ");
                    String email = sc.nextLine();
                    //Aqui lo que estoy haciendo es tomando el dato guardado en la variable email(singular) y guardalo en mi ArrayList llamado emails(plural)
                    emails.add(email);

                    //Aqui lo que estoy haciendo es tomando el dato guardado en la variable rol(singular) y guardalo en mi ArrayList llamado roles(plural)
                    System.out.println("Por ultimo ingrese su especialidad: ");
                    String rol = sc.nextLine();
                    roles.add(rol);

                    /*
                      Aqui lo que estoy haciendo es llamando mi variable hash y declarando 3 llaves que van a ser
                      1. Nombres y me va a guardar el ArrayList que se llama names
                      2. Correos y me va a guardar el ArrayList que se llama emails
                      3. Especialidades y me va a guardar el ArrayList que se llama roles
                      Recuerden que un diccionario guarda una <clave> y un <valor> mis claves son:
                      Nombres, Correos y Especialidades
                      y mis valores son:
                      names, emails, roles
                    */
                    userInformation.put("Nombres", names);
                    userInformation.put("Correos", emails);
                    userInformation.put("Especialidades", roles);

                    //Como un usuario ha sido creado aumentamos el contador
                    countUsers++;
                    System.out.println("Usuario registrado con exito ");
                    System.out.println("\n" + "\n" + "\n");
                    break;
                case 2:

                    //Si no hay usuarios mostramos este mensaje y devolvemos al usuario al menu para crear un nuevo usuario
                    if (countUsers == 0) {
                        System.out.println("Usted no ha registrado usuarios todavia");
                        System.out.println("\n" + "\n" + "\n");
                        break;
                    }
                    else {
                        System.out.println("Los usuarios registrados son :");
                        /*
                          Aqui lo que estamos haciendo es un for para que se repita las veces que countUsers haya guardado un usario
                          y despues me imprima el nombre del usuario, su email y su role
                         */
                        for(int i = 0; i < countUsers; i++){
                            System.out.println(names.get(i) + ", "+ emails.get(i) + ", " + roles.get(i));
                        }
                        //Mostramos el diccionario con los usuarios guardados
                        System.out.println("Hash con todos los usuarios" + userInformation);

                        System.out.println("Para continuar presione 1, Para Salir 2");
                        userOption = sc.nextInt();
                        if(userOption == 1) continue;
                            //Detenmos forzadamente el programa ya que con state = false; no me dejaba pero esto significa matar el programa
                        else System.exit(0);
                    }

                case 3:
                    System.out.println("Por favor ingrese la posicion del usuario a modificar su especialidad: ");
                    /*
                      Aqui lo que estamos haciendo es un for para que se repita las veces que countUsers haya guardado un usario
                      y despues me imprima la posicion del usuario, el nombre del usuario, su email y su role
                     */
                    for(int i = 0; i < countUsers; i++){
                        System.out.println(i + ". " + names.get(i) + ", "+ emails.get(i) + ", " + roles.get(i));
                    }
                    int indexToModify = sc.nextInt();
                    sc.nextLine();

                    //Validamos que el usuario exista mediante su posicion, no puede ser mayor o menor a lo que guarde el ArrayList
                    if (indexToModify < 0 || indexToModify >= roles.size()) System.out.println("Indice invalido");
                    else {
                        //Obtenemos la posicion actual del usuario que queremos cambiar su especialidad
                        System.out.println("La especialidad actual es : " + roles.get(indexToModify));
                        System.out.println("Ingrese la nueva especialidad: ");
                        String newRole = sc.nextLine();
                        //Cambiamos su especialidad meidante la variable newRole que se ha creo
                        roles.set(indexToModify, newRole);
                        System.out.println("Especialidad actualizada con exito");
                        System.out.println("\n" + "\n" + "\n");
                    }
                    break;
                case 4:
                    //Salimos del programa cambiando el estado de la variable a false y detenemos el while
                    state = false;
            }
        }
        while (state);

    }
}
