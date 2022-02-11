/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package UF1NF2_2_exercices;

/**
 *
 * @author ajose
 */
public class ex_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int[] VEX = new int[10];
        int aux = 0, cont = 0, rotacion = 0;
        for (int i = 0; i < VEX.length; i++) {
            VEX[i] = (int) ((Math.random() * 11) + 10);
        }

        for (int i : VEX) {
            System.out.print(i + " ");
        }

        System.out.println("");

        for (int i = 0; i < VEX.length; i++) {
            if (VEX[i] == 12) {
                cont++;
                VEX[i] = VEX[i] - VEX[i];
            }
        }
        
        for (int i : VEX) {
            System.out.print(i + " ");
        }

        System.out.println("");

        while (cont > 0) {
            for (int i = 0; i < VEX.length - 1; i++) {
                if (VEX[i] == 0) {
                    aux = VEX[i];
                    VEX[i] = VEX[i + 1];
                    VEX[i + 1] = aux;
                }
            }
            cont--;
        }

        for (int i : VEX) {
            System.out.print(i + " ");
        }

    }

}
