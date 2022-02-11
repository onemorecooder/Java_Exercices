/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Sistema_Solar;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class inicio {

    public static void main(String[] args) {
        // TODO code application logic here

        Scanner sc = new Scanner(System.in);
        Planetas [] planetas = new Planetas[5];

        // VARIABLES //
        boolean exit = false;

        do{
        switch (Methods.printMenu()) {
            case 0 -> Methods.createFullPlanet(planetas);
            case 1 -> Methods.showPlanets(planetas);
            case 2 -> Methods.showOnePlanet(planetas);
            case 3 -> Methods.deletePlanets(planetas);
            case 4 -> exit = true;
        }
        }while(!exit);
    }
}