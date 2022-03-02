/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package View;

import static Controller.AthleteController.*;
import static Controller.RaceController.*;
import static MyLibrary.DataValidation.showMenu;
import java.util.Scanner;
/**
 *
 * @author ajose
 */
public class Main {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        boolean exit = false;
        do{
            /* MÉTODO DE MENÚ! */
            showMenu();
            /* LO ÚNICO QUE NO CONTROLO ES LA EXCEPCIÓN DE CUANDO SE INTRODUCEN CARÁCTERES EN UN INT */
            switch(sc.nextLine()){
                case "1" -> registerAthlete(); // MÉTODO REGISTRO
                case "2" -> viewAthletes(); // MÉTODO DE VISUALIZACIÓN
                case "3" -> modifyAthlete(); // MODIFICAR ATLÉTAS
                case "4" -> deleteAthlete(); // ELIMINAR ATLETAS
                case "5" -> registerRace(); // REGISTRAR CARRERA
                case "6" -> viewRaces(); // VER CARRERASS
                case "7" -> deleteRace(); // BORRAR CARRERAS
                case "0" -> {
                    // ÚNICAMENTE LA OPCIÓN 5 ES PARA SALIR DEL PROGRAMA
                    exit = true;
                    System.out.println("Closing application...");
                }
                default -> System.out.println("Selection not availible. Try again.");
            }
        } while (!exit);
    }
}
