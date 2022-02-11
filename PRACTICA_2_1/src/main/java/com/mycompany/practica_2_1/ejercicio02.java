/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.practica_2_1;

/**
 *
 * @author ajose
 */
public class ejercicio02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        boolean victoria = false, empate = false;
        int p1, p2;

        while (victoria == false) {
            p1 = (int) ((Math.random() * 3) + 1);
            System.out.println(p1);
            p2 = (int) ((Math.random() * 3) + 1);
            System.out.println(p2);

            System.out.println("\nPLAYER 1:");
            // ASIGNAMOS UN "ROL" A CADA NÚMERO QUE SAQUE EL JUGADOR 1 UTILIZANDO UN SWITCH
            switch (p1) {
                case 1:
                    System.out.println("Piedra");
                    break;
                case 2:
                    System.out.println("Papél");
                    break;
                case 3:
                    System.out.println("Tijera");
                    break;
            }

            System.out.println("\nPLAYER 2:");
            // ASIGNAMOS UN "ROL" A CADA NÚMERO QUE SAQUE EL JUGADOR 2 UTILIZANDO UN SWITCH
            switch (p2) {
                case 1:
                    System.out.println("Piedra");
                    break;
                case 2:
                    System.out.println("Papél");
                    break;
                case 3:
                    System.out.println("Tijera");
                    break;
            }

            if (p1 == p2) {
                System.out.println("EMPATE");
                // EMPATE EN EL CASO DE QUE LOS VALORES DE LOS JUGADORES SEAN IGUALES.
                // SI SE EMPATA EL JUEGO CONTINUA YA QUE NO SE ACTIVA LA VARIABLE BOOLEANA.
            } else if (p1 == 1 && p2 == 2 || p1 == 2 && p2 == 3 || p1 == 3 && p2 == 1) {
                System.out.println("GANA JUGADOR 2!");
                // EN EL CASO DE QUE GANE EL JUGADOR 2. EN EL CASO DE VICTORIA ACTIVAMOS LA
                // VARIABLE BOOLEANA.
                victoria = true;
            } else {
                System.out.println("GANA JUGADOR 1!");
                // EN EL CASO DE QUE GANE EL JUGADOR 1. EN EL CASO DE VICTORIA ACTIVAMOS LA
                // VARIABLE BOOLEANA.
                victoria = true;
            }

        }

    }

}
