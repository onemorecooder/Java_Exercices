
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.uf1_nf1_exercices;

import java.util.Scanner;

/**
 *
 * @author ajose
 */
public class exercice_12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner teclado = new Scanner(System.in);
        String resp1, resp2;
        boolean correcto;

        do {
            System.out.println("¡JUEGO PIEDRA(P), PAPÉL(L) O TIJERA(T)!");
            System.out.println("ELIGE UNA OPCIÓN EL JUGADOR 1 (P, L, T):");
            resp1 = teclado.next();
            System.out.println("ELIGE UNA OPCIÓN EL JUGADOR 2 (P, L, T):");
            resp2 = teclado.next();
            correcto = true;

            // PIEDRA VS PIEDRA -> EMPATE
            if (resp1.equals("P") && resp2.equals("P") || resp1.equals("p") && resp2.equals("p")) {
                System.out.println("¡EMPATE!");
                correcto = false;

                // PAPEL VS PAPEL -> EMPATE
            }
            if (resp1.equals("L") && resp2.equals("L") || resp1.equals("l") && resp2.equals("l")) {
                System.out.println("¡EMPATE!");
                correcto = false;

                // TIJERA VS TIJERA -> EMPATE
            }
            if (resp1.equals("T") && resp2.equals("T") || resp1.equals("t") && resp2.equals("t")) {
                System.out.println("¡EMPATE!");
                correcto = false;

                // TIJERA VS PAPEL -> GANA TIJERA
            }
            if (resp1.equals("T") && resp2.equals("L") || resp1.equals("t") && resp2.equals("l")) {
                System.out.println("¡GANA EL JUGADOR 2!");
                correcto = false;

                // TIJERA VS PIEDRA -> GANA PIEDRA
            }
            if (resp1.equals("T") && resp2.equals("P") || resp1.equals("t") && resp2.equals("p")) {
                System.out.println("¡GANA EL JUGADOR 2!");
                correcto = false;

                // PIEDRA VS PAPEL -> GANA PAPEL
            }
            if (resp1.equals("P") && resp2.equals("L") || resp1.equals("p") && resp2.equals("l")) {
                System.out.println("¡GANA EL JUGADOR 2!");
                correcto = false;

                // PIEDRA VS TIJERA -> GANA PIEDRA
            }
            if (resp1.equals("P") && resp2.equals("T") || resp1.equals("p") && resp2.equals("t")) {
                System.out.println("¡GANA EL JUGADOR 1!");
                correcto = false;

                // PAPEL VS TIJERA -> GANA TIJERA
            }
            if (resp1.equals("L") && resp2.equals("P") || resp1.equals("l") && resp2.equals("p")) {
                System.out.println("¡GANA EL JUGADOR 1!");
                correcto = false;

                // PAPEL VS TIJERA -> GANA TIJERA
            }
            if (resp1.equals("L") && resp2.equals("T") || resp1.equals("l") && resp2.equals("t")) {
                System.out.println("¡GANA EL JUGADOR 2!");
                correcto = false;
            }

        } while (correcto == false);

    }

}
