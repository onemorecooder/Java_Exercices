/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package UF1NF2_2_exercices;

import java.util.Scanner;

/**
 *
 * @author ajose
 */
public class ex_03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int[] V = new int[20];
        int random;
        int eleccion;
        int pos1 = 0, pos2 = 1, contPar = 0, contImpar = 0, suma = 0;
        boolean salida = false;
        Scanner sc = new Scanner(System.in);

        for (int x : V) {
            System.out.print(x + " ");
        }

        System.out.println("");
        while (salida == false) {
            System.out.println("\nMENÚ:\n"
                    + "\n[1] Poner número.\n"
                    + "[0] Salir.\n");

            eleccion = sc.nextInt();

            switch (eleccion) {
                case 1:
                    random = (int) ((Math.random() * 10) + 1);
                    System.out.println("\nNúmero random: " + random + ".");
                    for (int i = 0; i < 20; i++) {
                        if (random % 2 == 0 && contPar < 10) {
                            V[pos2] = random;
                            pos2 += 2;
                            contPar++;
                        } else if (random % 2 == 0 && contPar >= 10) {
                            System.out.println("¡El número " + random + " no ha podido introducirse!");
                        }
                        if (random % 2 != 0 && contImpar < 10) {
                            V[pos1] = random;
                            pos1 += 2;
                            contImpar++;
                        } else if (random % 2 != 0 && contPar >= 10) {
                            System.out.println("¡El número " + random + " no ha podido introducirse!");
                        }
                        break;
                    }

                    for (int x : V) {
                        System.out.print(x + " ");
                    }
                    System.out.println("");

                    if (contPar + contImpar == 20) {
                        for (int i = 0; i < 20; i++) {
                            suma = V[i] + suma;
                        }
                        System.out.println("¡FIN DEL PROGRAMA!");
                        System.out.println("La suma total es: " + suma + ".");
                        salida = true;
                    }
                    break;
                case 0:
                    System.out.println("Adiós!");
                    for (int i = 0; i < 20; i++) {
                        suma = V[i] + suma;
                    }
                    for (int x : V) {
                        System.out.print(x + " ");
                    }
                    System.out.println("La suma total es: " + suma + ".");
                    salida = true;
            }
        }
    }
}
