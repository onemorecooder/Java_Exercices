/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tictactoe;

import java.util.Scanner;

/**
 *
 * @author ajose
 */
public class ticTacToe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /* CREAMOS EL SCAN PARA METER EN UNA VARIABLE LO QUE 
        EL USUARIO INTRODUZCA POR CONSOLA */
        Scanner scan = new Scanner(System.in);
        boolean victoria = false;
        boolean turno = true;
        
        /* CREACIÓN DE LA MATRIZ 3*3 QUE HACE DE TABLERO */
        int[][] matriz = new int[3][3];
        
        /* CREAMOS LAS "FICHAS" DE LOS JUGADORES. 
        QUE EN ESTE CASO SERÁN EL NÚMERO 1 Y EL 2.*/
        int p1 = 1;
        int p2 = 2;
        
        // CONTADOR PARA LOS TURNOS.
        int numTurnos = 0;
        System.out.println("TIC TAC TOE");
        System.out.println("");
        do {
            /* IMPRIMIMOS LA MATRIZ MOSTRANDO EL TABLERO. POR CADA TURNO 
            YA QUE ESTÁ DENTRO DEL BUCLE DO WHILE.*/
            for (int x = 0; x < matriz.length; x++) {
                System.out.println("+---+-----+---+");
                for (int y = 0; y < matriz[x].length; y++) {
                    System.out.print("| " + matriz[x][y] + " |");
                }
                System.out.println("");
                // SALTO DE LÍNEA PARA QUE SE MUESTRE EL TABLERO DE 3*3.
            }
            System.out.println("+---+-----+---+");
            if (turno == true) {
                // EL JUGADOR 1 ELIGE LA POSICIÓN EN LA QUE QUIERE COLOCAR SU FICHA.
                System.out.println("");
                System.out.println("Es el turno número: " + numTurnos + ". \n");
                System.out.println("Elige fila J1: ");
                String fila = scan.next();
                System.out.println("Elige columna J1: ");
                String columna = scan.next();
                System.out.println("");

                // PARSEINT PARA CONVERTIR EN UN INT UNA CADENA DE TEXTO.
                int newFila = Integer.parseInt(fila);
                int newCol = Integer.parseInt(columna);
                if (matriz[newFila][newCol] == p2 || matriz[newFila][newCol] == p1) {
                    /* IMPRIMIREMOS ESTA LINEA EN EL CASO DE QUE EL 
                     JUGADOR ELIJA UNA POSICIÓN QUE YA SE HA UTILIZADO.*/
                    System.out.println("");
                    System.out.println("Tira otra vez, has elegido una posición que ya está ocupada!");
                } else {
                    //CAMBIO DE TURNO AL JUGADOR 2 Y SUMA AL CONTADOR.
                    matriz[newFila][newCol] = p1;
                    turno = !turno;
                    numTurnos++;
                }
                // TODAS ESTAS SON LAS CONDICIONES DE VICTORIA.
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
                    /* AQUÍ CAMBIAMOS EL BOOL DE VICTORIA A TRUE PARA QUE EL 
                    BUCLE DO WHILE FINALICE Y ASÍ ACABE LA PARTIDA
                    PARANDO EL CÓDIGO.*/
                    victoria = !victoria;
                } else if (numTurnos == 9 && victoria == false) {
                    /* AQUÍ CAMBIAMOS EL BOOL DE VICTORIA A TRUE PARA QUE EL 
                    BUCLE DO WHILE FINALICE Y ASÍ ACABE LA PARTIDA
                    PARANDO EL CÓDIGO.*/
                    break;
                }
            } else {
                /* EJECUTAMOS ESTE CODIGO EN EL CASO DE QUE EL TURNO SEA FALSE
                    YA QUE SI FUERA TRUE AÚN LE TOCARIA AL JUGADOR 1
                    POR ESO AL FINAL COLOCAMOS EL TRURNO = !TURNO PARA
                HACER UN CAMBIO DE TRUE A FALSE Y DE FALSE A TRUE.*/
                System.out.println("");
                System.out.println("Es el turno número: " + numTurnos + ". \n");
                System.out.println("Elige fila J2: ");
                String fila = scan.next();
                System.out.println("Elige columna J2: ");
                String columna = scan.next();
                System.out.println("");
                
                /* LE ASIGNAMOS EL VALOR INTRODUCIDO A UNA VARIABLE. 
                FILAS Y COLUMNAS PARA PODER ELEGIR LA POSICIÓN*/
                int newFila = Integer.parseInt(fila);
                int newCol = Integer.parseInt(columna);
                if (matriz[newFila][newCol] == p1 || matriz[newFila][newCol] == p2) {
                    System.out.println("");
                    System.out.println("Tira otra vez, has elegido una posición que ya está ocupada!");
                } else {
                    //CAMBIO DE TURNO AL JUGADOR 1 Y SUMA AL CONTADOR.
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
                } else if (numTurnos == 9 && victoria == false) {
                    /* AQUÍ CAMBIAMOS EL BOOL DE VICTORIA A TRUE PARA QUE EL 
                    BUCLE DO WHILE FINALICE Y ASÍ ACABE LA PARTIDA
                    PARANDO EL CÓDIGO.*/
                    break;
                }
            }
            /* HAREMOS TODO LO DE ARRIBA MIENTRAS VICTORIA SEA FALSE 
            CUANDO SEA TRUE SALDREMOS DEL BUCLE.*/
        } while (victoria == false);
        if (victoria == true){
            // IMPRIMIMOS LA MATRIZ CON EL RESULTADO FINAL.
            System.out.println("Felicidades, has ganado en " + numTurnos + " turnos.");
            System.out.println("");
            for (int x = 0; x < matriz.length; x++) {
                System.out.println("+-------------+");
                for (int y = 0; y < matriz[x].length; y++) {
                    System.out.print("| "+matriz[x][y] + " |");
                    
                }
                System.out.println("");
                // SALTO DE LÍNEA PARA QUE SE MUESTRE EL TABLERO DE 3*3.
            }
            System.out.println("+-------------+");
        } else {
            System.out.println("¡¡¡EMPATE!!!.");
            System.out.println("");
            for (int x = 0; x < matriz.length; x++) {
                for (int y = 0; y < matriz[x].length; y++) {
                    System.out.print(matriz[x][y] + " ");
                }
                System.out.println("");
                victoria = false;
            }
        }
        
        
    }

}
