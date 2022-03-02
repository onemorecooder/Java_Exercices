/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import static Controller.AthleteController.*;
import static MyLibrary.DataValidation.*;
import java.util.*;
import Model.Race;


/**
 *
 * @author ajose
 */
public class RaceController {

    /*INICIAMOS EL ARRAYLIST EN EL QUE GUARDAREMOS LAS CARRERAS*/
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
            /*INICIAMOS LA LOCALIZACIÓN QUE SERÁN UNICAMENTE LETRAS*/
            System.out.println("Insert the Location:");
            Location = sc.nextLine();
            onlyWord = onlyWords(Location);
        } while (!onlyWord);
        /*ELEGIMOS LA DISTANCIA DE LA CARRERA*/
        System.out.println("Enter the race distance:");
        distance = sc.nextInt();
        /*SE CREA EL ARRAYLIST PASANDOLE LOS VALORES INTRODUCIDOS ANTERIORMENTE*/
        races.add(new Race(codeRace, Location, distance));
        /*CREAMOS EL ARRAYLIST AUXILIAR PARA PODER EDITARLO E INTRODUCIR LOS ATLETAS EN SU ARRAYLIST
        DONDE SE ALBERGAN LOS ATLETAS QUE PARTICIPAN EN ESAS CARRERAS*/
        Race registeringRace = races.get(races.size() - 1);
        sc.nextLine();
        int option;
        System.out.println("\nDo you want to add any athlete?\n[1] YES\n[2] NO\n");
        option = sc.nextInt();
        /*HACEMOS EL SWITCH PARA PODER DARLE A ELEGIR AL USUARIO SI CREAR LA CARRERA VACÍA O 
        INTRODUCIR AL MOMENTO DE CREARLA UNO O VARIOS ATLETAS*/
        switch (option) {
            case 1:
                System.out.println("Aquí están los atletas que no han sido registrados aún:\n");
                /*METODO QUE NOS IMPRIMIRÁ LOS ATLETAS NO REGISTRADOS DE ESA CARRERA (DEVUELVE UN BOOLEANO
                POR ESO ESTÁ DENTRO DEL IF, PARA SABER SI HAY ALGÚN ATLETA QUE NO ESTÉ REGISTRADO)*/
                if (viewAthletesNotRegistered(registeringRace)) {
                    System.out.println("Introduce the athlete id:");
                    String id = readStringID(8, 1);
                    if (idAthleteRepeated(id)) {
                        /*SI EL ID COINCIDE GUARDAMOS EN EL ARRAYLIST DE ATLETAS UBICADO EN CARRERA AL ATLETA 
                        Y EN EL ARRAYLIST DE CARRERAS UBICADO EN ATLETAS SUS CARRERAS RECORRIDAS, UTILIZANDO
                        LA CARRERA AUXILIAR CREADA ANTERIORMENTE*/

                        /*SE GUARDA EN LA CARRERA EL ATLETA INTRODUCIDO A TRAVÉS DEL METODO*/
                        registeringRace.getRaceAthletes().add(getAthletebyID(id));
                        /*SE AÑADE LA CARRERA AUXILIAR AL ARRAYLIST DE CARRERAS DE LOS ATLETAS*/
                        AthleteController.getAthletebyID(id).getAthleteRaces().add(registeringRace);
                        System.out.println("The race with code " + codeRace + " was succesfully saved!");
                    } else {
                        /*SI NO HAY ATLETAS POR REGISTRAR MOSTRARÁ ESE MENSAJE*/
                        System.out.println("Athlete not found");
                    }
                    System.out.println("\nDo you want to add another athlete?\n[1] YES\n[2] NO\n");
                    option = sc.nextInt();
                    /*HAREMOS OTRO SWITCH PARA PREGUNTAR SI QUIERE AÑADIR ALGÚN ATLETA MÁS A ESA CARRERA*/
                    do {
                        switch (option) {
                            case 1:
                                /*SE SIGUE EL PROCESO ANTERIOR*/
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
                                /*SALIMOS CON LOS ATLETAS CREADOS EN EL ARRAYLIST DE CARRERAS*/
                                System.out.println("Bye");
                                break;
                        }
                        /*ESTE BUCLE SE HARÁ MIENTRAS LA OPCIÓN ELEGIDA SEA DISTINTA A 2, LA OPCION
                        DE SALIDA.*/
                    } while (option != 2);
                } else {
                    /*SI NO HAY ATLETAS REGISTRADOS SALDRÁ ESTE MENSAJE*/
                    System.out.println("\n***********************************");
                    System.out.println("*********No athlete found**********");
                    System.out.println("***********************************\n");
                }
                break;
            case 2:
                /*EN EL CASO DE NO QUERER REGISTRAR A NINGÚN ATLETA AL CREAR LA CARRERA
                SE CREARÁ LA CARRERA DE FORMA NORMAL*/
                races.add(new Race(codeRace, Location, distance));
                System.out.println("The race with code " + codeRace + " was succesfully saved!");
                break;
            default:
                System.out.println("Wrong option.");
        }
    }

    public static void viewRaces() {
        if (races.size() <= 0) {
            /*SI NO HAY CARRERAS EN EL ARRAYLIST DE CARRERAS NOS MOSTRARÁ ESE MENSAJE*/
            System.out.println("\n***********************************");
            System.out.println("********No races registered********");
            System.out.println("***********************************\n");
        } else {
            /*HACEMOS EL BUCLE PARA RECORRER LAS CARRERAS*/
            for (int i = 0; i < races.size(); i++) {
                Race race = races.get(i);
                System.out.println("-----------------------------------");
                System.out.println("CODE = " + race.getCodeRace());
                System.out.println("LOCATION = " + race.getLocation());
                System.out.println("DISTANCE = " + race.getDistance() + "km");
                System.out.println("CREATION DATE = " + race.getDateTime());
                System.out.println("-----------------------------------");
                System.out.println("\n**************RUNNERS**************");
                /*Y OTRO BUCLE ANIDADO EN EL ANTERIOR PARA RECORRER EL ARRAYLIST DE ATLETAS
                QUE ESTÁ DENTRO DEL ARRAYLIST DE CARRERAS, SACAMOS SU NOMBRE Y DNI*/
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
