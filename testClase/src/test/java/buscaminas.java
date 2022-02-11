
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author ajose
 */
public class buscaminas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        char[][] tablero = new char[10][10];
        Scanner sc = new Scanner(System.in);
        boolean victoria = false;

        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero.length; j++) {
                int pos1 = (int) (Math.random() * 10);
                int pos2 = (int) (Math.random() * 10);
                tablero[i][j] = 'O';
                tablero[pos1][pos2] = 'M';
            }
        }

        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero.length; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println("");
        }

        int posicion1, posicion2;
        do {
            System.out.println("Selecciona una posición:");
            posicion1 = sc.nextInt();
            posicion2 = sc.nextInt();
            
            for (int i = 0; i < tablero.length; i++) {
                for (int j = 0; j < tablero.length; j++) {
                    if (tablero[posicion1][posicion2] == 'M') {
                        tablero[posicion1][posicion2] = '*';
                        break;
                    } else if (tablero[posicion1][posicion2] == 'O') {
                        tablero[posicion1][posicion2-1] = '1';
                        tablero[posicion1][posicion2+1] = '1';
                        tablero[posicion1+1][posicion2+1] = '1';
                        tablero[posicion1-1][posicion2+1] = '1';
                        tablero[posicion1-1][posicion2] = '1';
                        tablero[posicion1+1][posicion2] = '1';
                        tablero[posicion1+1][posicion2-1] = '1';
                        tablero[posicion1-1][posicion2-1] = '1';
                        tablero[posicion1][posicion2] = 'X';
                    }
                }
            }

            for (int i = 0; i < tablero.length; i++) {
                for (int j = 0; j < tablero.length; j++) {
                    System.out.print(tablero[i][j] + " ");
                }
                System.out.println("");
            }
        } while (tablero[posicion1][posicion2] != '*');
        
        if (tablero[posicion1][posicion2] == '*'){
            System.out.println("¡Has perdido!");
        }

    }

}
