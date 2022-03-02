/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Athlete;
import static Model.Athlete.isSenior;
import static MyLibrary.DataValidation.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ajose
 */
public class AthleteController {

    private static ArrayList<Athlete> athletes = new ArrayList<>();

    // YA SE VERÁ
    public static ArrayList<Athlete> getAthletes() {
        return athletes;
    }

    // RECOGEMOS EL ID Y RECORREMOS PARA SABER SI HAY UN ID REPETIDO
    public static boolean idAthleteRepeated(String ID) {
        boolean repeated = false;
        for (int i = 0; i < athletes.size() && !repeated; i++) {
            if (athletes.get(i).getID().equals(ID)) {
                repeated = true;
            }
        }
        return repeated;
    }

    // REGISTRO DEL ATLETA
    public static void registerAthlete() {
        Scanner sc = new Scanner(System.in);
        int age = 0; // EDAD
        int dorsal; // BIB (DORSAL)
        int extraInfo; // VARIABLE PARA ELEGIR SI QUEREMOS INTRODUCIR INFO ADICIONAL O NO
        String name; // VARIABLE PARA EL NOMBRE DEL ATLETA.

        System.out.println("Getting started with athlete registration");
        System.out.println("Enter the ID: ");
        String id = readStringIDnoRepeated(8, 1); // NO REPEATED PARA INTRODUCIR NUEVO ATLETA YA QUE NO PUEDE CONSTAR UNO IGUAL
        boolean onlyWord = false;

        do {
            System.out.println("Insert your name:");
            name = sc.nextLine(); // INSERTAMOS EL NOMBRE DEL ATLETA Y SE LO PASAMOS AL MÉTODO
            onlyWord = onlyWords(name); // MÉTODO PARA SABER SI EN LA CADENA DE TEXTO ÚNICAMENTE HAYAN LETRAS
        } while (!onlyWord);

        //dorsal = between1000and9999(); // MÉTODO CREADO PARA QUE EL DORSAL TENGA 4 DIGITOS
        System.out.println("Do you want to type extra information?\n[1]YES\n[2]NO");
        extraInfo = sc.nextInt(); // RECOGEMOS LA OPCIÓN
        switch (extraInfo) {
            case 1:
                age = over18();
                athletes.add(new Athlete(id, name, age));
                break;
            case 2:
                athletes.add(new Athlete(id, name));
                break;
            default:
                System.out.println("Incorrect option!");
        }
    }

    // VISUALIZAR ATLETAS
    public static void viewAthletes() {

        if (athletes.size() <= 0) {
            System.out.println("\n**************************");
            System.out.println("**No athletes registered**");
            System.out.println("**************************");
        } else {
            for (int i = 0; i < athletes.size(); i++) {
                System.out.println("*************************************");
                System.out.println("DORSAL = " + athletes.get(i).getBib());
                System.out.println("NAME = " + athletes.get(i).getName());
                System.out.println("DNI = " + athletes.get(i).getID());
                if (athletes.get(i).getAge() != 0) {
                    System.out.println("AGE = " + athletes.get(i).getAge());
                    if (isSenior(athletes.get(i).getAge()) == true) {
                        System.out.println("Senior: " + isSenior(athletes.get(i).getAge()));
                    } else {
                        System.out.println("Senior: " + isSenior(athletes.get(i).getAge()));
                    }
                }
                System.out.println("*************************************");

            }
        }
    }

    // MODIFICAR ATLETA!
    public static void modifyAthlete() {
        Scanner sc = new Scanner(System.in);
        if (athletes.size() <= 0) {
            System.out.println("\n**************************");
            System.out.println("**No athletes registered**");
            System.out.println("**************************");
        } else {
            System.out.println("Getting started with the athlete modification");
            System.out.println("Enter the ID:");
            String id = readStringID(8, 1);
            if (idAthleteRepeated(id)) {
                boolean exit = false;
                do {
                    Athlete athToMod = getAthletebyID(id);
                    System.out.println("---- Modifying " + athToMod.getID());
                    System.out.println("Which atribute do you want to modify?\n"
                            + "[1] NAME\n"
                            + "[2] AGE\n"
                            + "[3] EXIT MODIFYER\n");
                    switch (sc.nextInt()) {
                        case 1:
                            sc.nextLine();
                            System.out.println("Enter the new name");
                            athToMod.setName(sc.nextLine());
                            break;
                        case 2:
                            sc.nextLine();
                            System.out.println("Enter the new age");
                            athToMod.setAge(over18());
                            break;
                        case 3:
                            sc.nextLine();
                            System.out.println("Closing the modifyer...");
                            exit = true;
                            break;
                        default:
                            System.out.println("Wrong option");
                    }
                } while (!exit);
            } else {
                System.out.println("The program didn't found any coincidence");
            }
        }

    }

    // CONSEGUIR EL ATLETA SEGÚN SU ID
    public static Athlete getAthletebyID(String id) {
        boolean found = false;
        Athlete athMod = null;
        for (int i = 0; i < athletes.size(); i++) {
            if (id.equals(athletes.get(i).getID())) {
                athMod = athletes.get(i);
                found = true;
                break;
            } else {
                found = false;
            }
        }
        if (found == true) {
            System.out.println("The application found a coincidence.");
        }
        return athMod;
    }

    // ELIMINAR ATLETA!
    public static void deleteAthlete() {
        if (athletes.size() <= 0) {
            System.out.println("\n**************************");
            System.out.println("**No athletes registered**");
            System.out.println("**************************");
        } else {
            System.out.println("Getting started with the athlete removal tool");
            System.out.println("Enter the ID:");
            String id = readStringID(8, 1);
            boolean found = false;
            int pos = 0;
            for (int i = 0; i < athletes.size(); i++) {
                if (id.equals(athletes.get(i).getID())) {
                    pos = i;
                    found = true;
                    break;
                } else {
                    found = false;
                }
            }
            if (found == true) {
                System.out.println("Deleting user...");
                System.out.println("The user " + athletes.get(pos).getName() + " has been deleted.");
                athletes.remove(pos);
            } else {
                System.out.println("No coincidence.");
            }
        }
    }
}
