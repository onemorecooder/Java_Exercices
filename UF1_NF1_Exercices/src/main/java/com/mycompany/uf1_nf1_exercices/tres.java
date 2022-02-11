/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uf1_nf1_exercices;

import java.util.Scanner;

/**
 *
 * @author ajose
 */
public class tres {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        boolean victoria = false;
        boolean turno = true;
        int[][] matriz = new int[3][3];
        int p1 = 1;
        int p2 = 2;
        int numTurnos = 0;
        System.out.println("TIC TAC TOE");
        System.out.println("");
        do {
            for (int x = 0; x < matriz.length; x++) {
                for (int y = 0; y < matriz[x].length; y++) {
                    System.out.print(matriz[x][y] + " ");
                }
                System.out.println("");
            }
            if (turno == true) {
                System.out.println("");
                System.out.println("Es el turno número: " + numTurnos + ". \n");
                System.out.println("Elige fila J1: ");
                String fila = scan.next();
                System.out.println("Elige columna J1: ");
                String columna = scan.next();
                System.out.println("");
                int newFila = Integer.parseInt(fila);
                int newCol = Integer.parseInt(columna);
                if (matriz[newFila][newCol] == p2 || matriz[newFila][newCol] == p1) {
                    System.out.println("");
                    System.out.println("Tira otra vez, has elegido una posición que ya está ocupada!");
                } else {
                    matriz[newFila][newCol] = p1;
                    turno = !turno;
                    numTurnos++;
                }
                if (matriz[0][0] == p1 && matriz[0][1] == p1 && matriz[0][2] == p1) {
                    System.out.println("TIC TAC TOE JUGADOR 1!!!");
                    victoria = !victoria;
                } else if (matriz[1][0] == p1 && matriz[1][1] == p1 && matriz[1][2] == p1) {
                    System.out.println("TIC TAC TOE JUGADOR 1!!!");
                    victoria = !victoria;
                } else if (matriz[2][0] == p1 && matriz[2][1] == p1 && matriz[2][2] == p1) {
                    System.out.println("TIC TAC TOE JUGADOR 1!!!");
                    victoria = !victoria;
                } else if (matriz[0][0] == p1 && matriz[1][0] == p1 && matriz[2][0] == p1) {
                    System.out.println("TIC TAC TOE JUGADOR 1!!!");
                    victoria = !victoria;
                } else if (matriz[0][1] == p1 && matriz[1][1] == p1 && matriz[2][1] == p1) {
                    System.out.println("TIC TAC TOE JUGADOR 1!!!");
                    victoria = !victoria;
                } else if (matriz[0][2] == p1 && matriz[1][2] == p1 && matriz[2][2] == p1) {
                    System.out.println("TIC TAC TOE JUGADOR 1!!!");
                    victoria = !victoria;
                } else if (matriz[0][0] == p1 && matriz[1][1] == p1 && matriz[2][2] == p1) {
                    System.out.println("TIC TAC TOE JUGADOR 1!!!");
                    victoria = !victoria;
                } else if (matriz[0][2] == p1 && matriz[1][1] == p1 && matriz[2][0] == p1) {
                    System.out.println("TIC TAC TOE JUGADOR 1!!!");
                    victoria = !victoria;
                }
            } else {
                System.out.println("");
                System.out.println("Es el turno número: " + numTurnos + ". \n");
                System.out.println("Elige fila J2: ");
                String fila = scan.next();
                System.out.println("Elige columna J2: ");
                String columna = scan.next();
                System.out.println("");
                int newFila = Integer.parseInt(fila);
                int newCol = Integer.parseInt(columna);
                if (matriz[newFila][newCol] == p1 || matriz[newFila][newCol] == p2) {
                    System.out.println("");
                    System.out.println("Tira otra vez, has elegido una posición que ya está ocupada!");
                } else {
                    matriz[newFila][newCol] = p2;
                    turno = !turno;
                    numTurnos++;
                }
                if (matriz[0][0] == p2 && matriz[0][1] == p2 && matriz[0][2] == p2) {
                    System.out.println("TIC TAC TOE JUGADOR 2!!!");
                    victoria = !victoria;
                } else if (matriz[1][0] == p2 && matriz[1][1] == p2 && matriz[1][2] == p2) {
                    System.out.println("TIC TAC TOE JUGADOR 2!!!");
                    victoria = !victoria;
                } else if (matriz[2][0] == p2 && matriz[2][1] == p2 && matriz[2][2] == p2) {
                    System.out.println("TIC TAC TOE JUGADOR 2!!!");
                    victoria = !victoria;
                } else if (matriz[0][0] == p2 && matriz[1][0] == p2 && matriz[2][0] == p2) {
                    System.out.println("TIC TAC TOE JUGADOR 2!!!");
                    victoria = !victoria;
                } else if (matriz[0][1] == p2 && matriz[1][1] == p2 && matriz[2][1] == p2) {
                    System.out.println("TIC TAC TOE JUGADOR 2!!!");
                    victoria = !victoria;
                } else if (matriz[0][2] == p2 && matriz[1][2] == p2 && matriz[2][2] == p2) {
                    System.out.println("TIC TAC TOE JUGADOR 2!!!");
                    victoria = !victoria;
                } else if (matriz[0][0] == p2 && matriz[1][1] == p2 && matriz[2][2] == p2) {
                    System.out.println("TIC TAC TOE JUGADOR 2!!!");
                    victoria = !victoria;
                } else if (matriz[0][2] == p2 && matriz[1][1] == p2 && matriz[2][0] == p2) {
                    System.out.println("TIC TAC TOE JUGADOR 2!!!");
                    victoria = !victoria;
                }
            }
        } while (victoria == false);
        System.out.println("Felicidades, has ganado en " + numTurnos + " turnos.");
        System.out.println("");
        for (int x = 0; x < matriz.length; x++) {
            for (int y = 0; y < matriz[x].length; y++) {
                System.out.print(matriz[x][y] + " ");
            }
            System.out.println("");
        }
    }
    
}
