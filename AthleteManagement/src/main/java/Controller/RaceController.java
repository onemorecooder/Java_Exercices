/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import static Controller.AthleteController.getAthletebyID;
import static Controller.AthleteController.getAthletes;
import static Controller.AthleteController.idAthleteRepeated;
import Model.Athlete;
import Model.Race.*;
import Model.Race;
import static MyLibrary.DataValidation.onlyWords;
import static MyLibrary.DataValidation.readStringID;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ajose
 */
public class RaceController {

    private static ArrayList<Race> races = new ArrayList<>();

    // REGISTRO DE CARRERA
    public static void registerRace() {
        Scanner sc = new Scanner(System.in);
        String codeRace, Location;
        int distance;

        System.out.println("Getting started with race registration");
        System.out.println("Enter the code: ");
        codeRace = sc.nextLine();
        codeRace = codeRace.toUpperCase();
        boolean onlyWord = false;

        do {
            System.out.println("Insert the Location:");
            Location = sc.nextLine();
            onlyWord = onlyWords(Location);
        } while (!onlyWord);
        System.out.println("Enter the race distance:");
        distance = sc.nextInt();
        races.add(new Race(codeRace, Location, distance));
        Race registeringRace = races.get(races.size() - 1);
        sc.nextLine();
        int option;
        System.out.println("\nDo you want to add any athlete?\n[1] YES\n[2] NO\n");
        option = sc.nextInt();
        switch (option) {
            case 1:
                System.out.println("Aquí están los atletas que no han sido registrados aún:\n");
                if (viewAthletesNotRegistered(registeringRace)) {
                    System.out.println("Introduce the athlete id:");
                    String id = readStringID(8, 1);
                    if (idAthleteRepeated(id)) {
                        registeringRace.getRaceAthletes().add(getAthletebyID(id));
                        AthleteController.getAthletebyID(id).getAthleteRaces().add(registeringRace);
                        System.out.println("The race with code " + codeRace + " was succesfully saved!");
                    } else {
                        System.out.println("Athlete not found");
                    }
                    int option2;
                    System.out.println("\nDo you want to add another athlete?\n[1] YES\n[2] NO\n");
                    option = sc.nextInt();
                    switch (option) {
                        case 1:
                            if (viewAthletesNotRegistered(registeringRace)) {
                                System.out.println("Introduce the athlete id:");
                                id = readStringID(8, 1);
                                if (idAthleteRepeated(id)) {
                                    registeringRace.getRaceAthletes().add(getAthletebyID(id));
                                    System.out.println("The race with code " + codeRace + " was succesfully saved!");
                                } else {
                                    System.out.println("Athlete not found");
                                }
                            } else {
                                System.out.println("\n***********************************");
                                System.out.println("*********No athlete found**********");
                                System.out.println("***********************************\n");
                            }
                            break;
                        case 2:
                            System.out.println("Bye");
                            break;
                    }
                } else {
                    System.out.println("\n***********************************");
                    System.out.println("*********No athlete found**********");
                    System.out.println("***********************************\n");
                }
                break;
            case 2:
                races.add(new Race(codeRace, Location, distance));
                System.out.println("The race with code " + codeRace + " was succesfully saved!");
                break;
            default:
                System.out.println("Wrong option.");
        }
    }

    public static void viewRaces() {

        if (races.size() <= 0) {
            System.out.println("\n***********************************");
            System.out.println("********No races registered********");
            System.out.println("***********************************\n");
        } else {
            for (int i = 0; i < races.size(); i++) {
                Race race = races.get(i);
                System.out.println("-----------------------------------");
                System.out.println("CODE = " + race.getCodeRace());
                System.out.println("LOCATION = " + race.getLocation());
                System.out.println("DISTANCE = " + race.getDistance() + "km");
                System.out.println("CREATION DATE = " + race.getDateTime());
                System.out.println("-----------------------------------");
                System.out.println("\n**************RUNNERS**************");
                for (int z = 0; z < race.getRaceAthletes().size(); z++) {
                    System.out.println("Name: " + race.getRaceAthletes().get(z).getName() + " || ID: " 
                            + race.getRaceAthletes().get(z).getID());
                }
                System.out.println("***********************************");

                System.out.println("-----------------------------------");

                //System.out.println(athleteRaces.get(0).getCodeRace() + "\n" + athleteRaces.get(0).getLocation() + "\n" + athleteRaces.get(0).getDistance());
            }
        }
    }

    public static boolean viewAthletesNotRegistered(Race rac) {
        boolean freeAthletes = false;
        System.out.println("**********NOT REGISTERED***********");
        for (int i = 0; i < AthleteController.getAthletes().size(); i++) {
            if (!rac.getRaceAthletes().contains(AthleteController.getAthletes().get(i))) {
                System.out.println("Name: " + AthleteController.getAthletes().get(i).getName() + " || ID: "
                        + AthleteController.getAthletes().get(i).getID());
                freeAthletes = true;
            }
        }
        System.out.println("***********************************");
        return freeAthletes;
    }

    public static void deleteRace() {
        Scanner sc = new Scanner(System.in);
        if (races.size() <= 0) {
            System.out.println("\n***********************************");
            System.out.println("********No races registered********");
            System.out.println("***********************************\n");
        } else {
            System.out.println("Getting started with the race removal tool");
            System.out.println("Enter the race Coded:");
            String id = sc.nextLine();
            boolean found = false;
            int pos = 0;
            for (int i = 0; i < races.size(); i++) {
                if (id.equals(races.get(i).getCodeRace())) {
                    pos = i;
                    found = true;
                    break;
                } else {
                    found = false;
                }
            }
            if (found == true) {
                System.out.println("Deleting race...");
                System.out.println("The race with code " + races.get(pos).getCodeRace() + " has been deleted.");
                races.remove(pos);
            } else {
                System.out.println("No coincidence.");
            }
        }
    }

}
