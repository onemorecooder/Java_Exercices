/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen_2_1_Alejandro;

import java.util.Scanner;

/**
 *
 * @author ajose
 */
public class ej_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner sc = new Scanner(System.in);
        int numMaquinas = 0, edad, km, numEdad = 0, numKm = 0, sumaEdad = 0, sumaKm = 0, eleccion, contKm = 0;
        boolean exit = false;
        double mediaEdad, mediaKm;

        do {
            System.out.println("¿Cuantas máquinas hay disponibles?");
            numMaquinas = sc.nextInt();
            if (numMaquinas > 0) {
                System.out.println("Número de máquinas correcto.");
            } else {
                System.out.println("Número de máquinas incorrecto!");
            }
        } while (numMaquinas <= 0);

        for (int i = 1; i <= numMaquinas; i++) {
            do {
                System.out.println("Introduce los datos para la máquina " + i + ".");
                System.out.println("Edad:");
                edad = sc.nextInt();
                numEdad++;
                sumaEdad += edad;
                System.out.println("Kilómetros:");
                km = sc.nextInt();
                contKm++;
                numKm++;
                sumaKm += km;
                if (edad >= 0 && km >= 0 && km <= (edad*100)) {
                    System.out.println("Datos correctos.");
                } else {
                    System.out.println("Datos incorrectos.");
                }
            } while (edad < 0 || km < 0 || km > (edad*100));

        }
        System.out.println("Los años totales son: " + sumaEdad + ".");
        System.out.println("Los kilómetros totales son: " + sumaKm + ".");

        do {
            System.out.println("\n ***    MENÚ    *** \n"
                    + " [1] - Nueva máquina\n"
                    + " [2] - Resultados\n"
                    + " [0] - Salir\n");

            eleccion = sc.nextInt();
            switch (eleccion) {
                case 1:
                    System.out.println("NUEVA MÁQUINA.");
                    do {
                        System.out.println("Introduce los datos para la máquina " + (numMaquinas+=1) + ".");
                        System.out.println("Edad:");
                        edad = sc.nextInt();
                        numEdad++;
                        sumaEdad += edad;
                        System.out.println("Kilómetros:");
                        km = sc.nextInt();
                        numKm++;
                        sumaKm += km;
                        if (edad >= 0 && km >= 0 && edad <=3 && km <= 20) {
                            System.out.println("Datos correctos.");
                        } else {
                            System.out.println("Datos incorrectos.");
                            numMaquinas--;
                        }
                    } while (edad < 0 || km < 0 || edad > 3 || km > 20);
                    break;
                case 2:
                    mediaEdad = (double) sumaEdad / (double) numEdad;
                    mediaKm = (double) sumaKm / (double) numKm;
                    System.out.println("La media de edad es: " + (double) mediaEdad + ".");
                    System.out.println("La media de km es: " + (double) mediaKm + ".");
                    break;
                case 0:
                    System.out.println("¡Hasta la próxima!");
                    exit = true;
                    break;
                default:
                    System.out.println("Elección erronea.");
            }
        } while (exit == false);

    }

}
