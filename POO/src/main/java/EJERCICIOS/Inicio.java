/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EJERCICIOS;

import java.util.Scanner;

/**
 *
 * @author ajose
 */
public class Inicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        boolean exit = false;

        ATLETA atletas[] = new ATLETA[5];

        int opcion;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Bienvenido a atleta v2:");
            System.out.println(" 1 | INGRESAR ATLETA");
            System.out.println(" 2 | MOSTRAR TODOS LOS ATLETAS");
            System.out.println(" 3 | ELIMINAR ATLETA");
            System.out.println(" 4 | MODIFICAR ATLETA");
            System.out.println(" 0 | SALIR");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    int edad, dorsal;
                    String nombre;
                    char genero;

                    do {
                        System.out.println("Introduce la edad del Atleta:");
                        edad = sc.nextInt();
                    } while (edad < 0);

                    do {
                        System.out.println("Introduce el dorsal :");
                        dorsal = sc.nextInt();
                    } while (dorsal < 0);

                    sc.nextLine();
                    System.out.println("Introduce el nombre:");
                    nombre = sc.nextLine();

                    do {
                        System.out.println("Introduce el género:");
                        genero = sc.next().charAt(0);
                    } while (genero != 'f' && genero != 'm');

                    boolean espacio = false;

                    for (int i = 0; i < atletas.length && !espacio; i++) {
                        if (atletas[i] == null) {
                            atletas[i] = new ATLETA(dorsal, edad, nombre, genero);
                            espacio = true;
                        }
                    }
                    if (!espacio) {
                        System.out.println("Posiciónes ocupadas. Borra cosas Willy");
                    } else {
                        System.out.println("Atleta introducido.");
                    }
                    break;

                case 2:
                    System.out.println("");
                    for (int i = 0; i < atletas.length; i++) {
                        if (atletas[i] != null) {
                            System.out.print("Name: " + atletas[i].nombre + " | ");
                            System.out.print("Edad: " + atletas[i].edad + " | ");
                            System.out.print("Dorsal: " + atletas[i].dorsal + " | ");
                            System.out.print("Género: " + atletas[i].genero + "\n");
                        } else {
                            i++;
                        }
                        System.out.println("");
                    }
                    break;
                case 3:
                    sc.nextLine();
                    boolean encontrado = false;
                    String atletaEliminado;
                    System.out.println("Eliminar un atleta:");
                    System.out.println("Escribe el nombre del atleta a eliminar");
                    atletaEliminado = sc.next();

                    for (int i = 0; i < atletas.length && !encontrado; i++) {
                        if (atletas[i] != null && atletas[i].nombre.equalsIgnoreCase(atletaEliminado)) {
                            atletas[i] = null;
                            encontrado = true;
                        }
                    }

                    if (!encontrado) {
                        System.out.println("No hay coincidencias parguela.");
                    }
                    break;
                case 4:
                    sc.nextLine();
                    encontrado = false;
                    boolean fin = false;
                    String atletaModificar;
                    int campo;
                    System.out.println("Escribe el nombre del atleta a modificar");
                    atletaModificar = sc.next();

                    for (int i = 0; i < atletas.length && !encontrado; i++) {
                        do {
                        if (atletas[i] != null && atletas[i].nombre.equalsIgnoreCase(atletaModificar)) {
                            System.out.println("Que quieres modificar:");
                            System.out.println(" 1 | DORSAL");
                            System.out.println(" 2 | EDAD");
                            System.out.println(" 3 | GÉNERO");
                            System.out.println(" 0 | SALIR");
                            campo = sc.nextInt();
                            switch (campo) {
                                case 1:
                                    System.out.println("Modificando dorsal:");
                                    int nuevoDorsal = sc.nextInt();
                                    atletas[i].dorsal = nuevoDorsal;
                                    System.out.println("El nuevo dorsal es " + atletas[i].dorsal);
                                    break;
                                case 2:
                                    System.out.println("Modificando edad:");
                                    int nuevaEdad = sc.nextInt();
                                    atletas[i].edad = nuevaEdad;
                                    System.out.println("La nueva edad es " + atletas[i].edad);
                                    break;
                                case 3:
                                    char nuevoGenero;
                                    do {
                                        System.out.println("Introduce el nuevo género ( F | femenino || M | masculino):");
                                        nuevoGenero = sc.next().charAt(0);
                                    } while (nuevoGenero != 'f' && nuevoGenero != 'm');
                                    atletas[i].genero = nuevoGenero;
                                    System.out.println("El nuevo género es " + atletas[i].getGenero());
                                    break;
                                case 0:
                                    fin = true;
                                    System.out.println("Atleta modificado");
                                    break;
                            }
                            encontrado = true;
                        }
                        }while(!fin);
                    }
                    if (!encontrado) {
                        System.out.println("No hay coincidencias parguela.");
                    }
                    break;
                case 0:
                    System.out.println("Adiós");
                    exit = true;
                    break;
                default:
                    System.out.println("Opción incorrecta!");
            }
        } while (!exit);
    }
}