/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Athlete;
import static Model.Athlete.isSenior;
import static MyLibrary.Arrays.*;
import static MyLibrary.DataValidation.*;
import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author ajose
 */
public class AthleteController {

    private static Athlete athletes[];

    // RECOGEMOS EL ID Y RECORREMOS PARA SABER SI HAY UN ID REPETIDO
    public static boolean idAthleteRepeated(String ID) {
        boolean repeated = false;
        for (int i = 0; i < athletes.length && !repeated; i++) {
            if (athletes[i] != null) {
                if (athletes[i].getID().equals(ID)) {
                    repeated = true;
                }
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
        int min = 1, max = 10; // MÁXIMOS Y MÍNIMOS DEL ID
        String name; // VARIABLE PARA EL NOMBRE DEL ATLETA.

        if (athletes == null) {
            System.out.println("How many athletes do you want to register?");
            athletes = new Athlete[readIntBetweenMinAndMax(min, max)];
        }
        if (isFull(athletes)) {
            System.out.println("There is no space to enter more athletes");
        } else {
            System.out.println("Getting started with athlete registration");
            System.out.println("Enter the ID: ");
            String id = readStringIDnoRepeated(8, 1); // NO REPEATED PARA INTRODUCIR NUEVO ATLETA YA QUE NO PUEDE CONSTAR UNO IGUAL
            System.out.println(id);
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
                    /* [SI] SI SE INTRODUCE INFORMACIÓN ADICIONAL QUE EN ESTE CASO ES LA EDAD, SE CREA EL 
                            ATLETA CON EL CONSTRUCTOR QUE TIENE LA VARIABLE DE EDAD*/
                    age = over18(); // MÉTODO CREADO PARA QUE NO SE PUEDAN INSCRIBIR MENORES O MAYORES DE 100 AÑOS
                    for (int i = 0; i < athletes.length; i++) {
                        if (athletes[i] == null) {
                            int pos = firstFreeArrayPosition(athletes); // PRIMERA POSICIÓN DEL ARRAY
                            athletes[pos] = new Athlete(id, name, age);
                            break;
                        }
                    }
                    manyPositions(athletes); // MÉTODO QUE TE IMPRIME LA CANTIDAD DE POSICIONES RESTANTES
                    break;
                case 2:
                    /* [NO] SI NO SE INTRODUCE INFORMACIÓN ADICIONAL QUE EN ESTE CASO ES LA EDAD, SE CREA EL 
                            ATLETA CON EL CONSTRUCTOR QUE NO TIENE LA VARIABLE DE EDAD*/
                    for (int i = 0; i < athletes.length; i++) {
                        if (athletes[i] == null) {
                            int pos = firstFreeArrayPosition(athletes); // SEGUARDA LA PRIMERA POSICIÓN LIBRE
                            athletes[pos] = new Athlete(id, name);// Y SE LA PASAMOS PARA QUE INTRODUZCA EL NUEVO ATLETA AHÍ
                            break;
                        }
                    }
                    manyPositions(athletes); // CUANTAS POSICIONES LIBRES QUEDAN
                    break;
                default:
                    System.out.println("Incorrect option!");
            }
        }
    }

    // VISUALIZAR ATLETAS
    public static void viewAthletes() {
        int contPersonas = 1;
        /* RECOGEMOS EL VALOR BOOLEANO DEL MÉTODO QUE NOS 
            DICE SI EL MÉTODO ESTÁ VACÍO*/
 /* EN EL CASO DE QUE ESTÉ VACÍO NOS MOSTRARÁ EL SIGUIENTE MENSAJE */
        boolean empty = isEmpty(athletes);
        if (empty == true) {
            System.out.println("Try again!");
        } else {
            /* SI NO ESTÁ VACÍO NOS MOSTRARÁ TODOS LOS DATOS INTRODUCIDOS */
            System.out.println("#################\nATHLETE VIEWER:\n#################");
            for (int i = 0; i < athletes.length; i++) {
                if (athletes[i] != null) {
                    System.out.println("Athlete nº: " + contPersonas + "."); // CONTEO DE ATLETAS
                    System.out.print("ID: " + athletes[i].getID() + "\n");
                    System.out.print("Name: " + athletes[i].getName() + "\n");
                    System.out.print("Dorsal: " + athletes[i].getBib() + "\n");
                    if (athletes[i].getAge() != 0) {
                        /* LA VARIABLE, EN EL CASO DE SER INICIADA, AL SER ENTERO SE INICIA POR DEFECTO EN 0,
                                                        LE DECIMOS QUE SI LA EDAD ES DISTINTA A 0 IMPRIMA LA EDAD Y DIGA SI ES SENIOR O NO.*/
                        System.out.print("Age: " + athletes[i].getAge() + "\n");
                        System.out.println("Senior: " + isSenior(athletes[i].getAge()));
                    }
                    System.out.println();
                    contPersonas++;
                } else {
                    System.out.println("\nEMPTY SPACE\n"); // PARA QUE SEA MÁS VISUAL, POR CADA ESPACIO EN BLANCO SALDRÁ ESTE MENSAJE
                }
            }
        }
    }

    // MODIFICAR ATLETA!
    public static void modifyAthlete() {
        Scanner sc = new Scanner(System.in);
        boolean correct;
        if (athletes == null) {
            System.out.println("No athletes registered");
        }

        if (!isEmpty(athletes)) {
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
                            + "[2] DORSAL\n"
                            + "[3] AGE\n"
                            + "[4] EXIT MODIFYER\n");
                    switch (sc.nextInt()) {
                        case 1:
                            sc.nextLine();
                            System.out.println("Enter the new name");
                            athToMod.setName(sc.nextLine());
                            break;
                        case 2:
                            sc.nextLine();
                            do {
                                System.out.println("Enter the new dorsal");
                                int dorsal;
                                dorsal = sc.nextInt();
                                correct = fourNumbersDorsal(dorsal);
                                if (correct == true) {
                                    athToMod.setBib(dorsal);
                                }
                            } while (!correct);
                            break;
                        case 3:
                            sc.nextLine();
                            System.out.println("Enter the new age");
                            athToMod.setAge(over18());
                            break;
                        case 4:
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

    // ELIMINAR ATLETA!
    public static void deleteAthlete() {
        if (!isEmpty(athletes)) {// sabemos si el array está vacío
            System.out.println("Getting started with the athlete removal tool");
            System.out.println("Enter the ID:");
            String id = readStringID(8, 1);
            boolean found = false;
            int pos = 0;
            for (int i = 0; i < athletes.length && athletes[i] != null; i++) {
                if (id.equals(athletes[i].getID())) {
                    pos = i;
                    found = true;
                    break;
                } else {
                    found = false;
                }
            }
            if (found == true) {
                System.out.println("Deleting user...");
                System.out.println("The user " + athletes[pos].getName() + " has been deleted.");
                athletes[pos] = null;
            } else {
                System.out.println("No coincidence.");
            }
        }
    }

    // DEVOLVER EL ATLETA CON EL MISMO ID!!!!!!!
    public static Athlete getAthletebyID(String id) {
        boolean found = false;
        Athlete athMod = null;
        for (int i = 0; i < athletes.length; i++) {
            if (id.equals(athletes[i].getID())) {
                athMod = athletes[i];
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

    public static Athlete raceAthletes() {
        Scanner sc = new Scanner(System.in);

        Athlete winner = null;
        int option, contRace;
        boolean entrada = false;
        do {
            System.out.println("¿Cuantos atletas quieres que compitan? (Mínimo 2)");
            option = sc.nextInt();

            System.out.println("¿Cuantas carreras quieres que corran?");
            contRace = sc.nextInt();
            if (option < 2 || option > manyPositionsFull(athletes)) {
                entrada = false;
                System.out.println("Introduce un valor correcto");
            } else {
                entrada = true;
            }

        } while (!entrada);
        if (entrada = true) {
            Athlete[] race = new Athlete[option];
            int[][] carreras = new int[option][contRace];
            float[] medias = new float[option];
            for (int i = 0; i < race.length; i++) {
                System.out.println("Introduce el competidor nº " + i + ":");
                String id = readStringID(8, 1);
                race[i] = getAthletebyID(id);
            }

            System.out.println("Resumen de las carreras: :");
            for (int i = 0; i < carreras.length; i++) {
                for (int j = 0; j < carreras[i].length; j++) {
                    carreras[i][j] = (int) (Math.random() * option) + 1;
                }
            }

            for (int i = 0; i < carreras.length; i++) {
                System.out.print("- Atleta con dorsal nº " + race[i].getBib() + ": ");
                for (int j = 0; j < carreras[i].length; j++) {
                    System.out.print(carreras[i][j] + " ");

                }
                System.out.println();
            }
            int sum = 0;
            float media;

            for (int i = 0; i < carreras.length; i++) {
                for (int j = 0; j < carreras[i].length; j++) {
                    sum = sum + carreras[i][j];
                }
                medias[i] = (float) sum / (float) contRace;
            }

            for (int i = 0; i < carreras.length; i++) {
                System.out.println("\n Media de victorias del atleta con dorsal nº " + race[i].getBib() + ": " + (float) medias[i] + " ");
            }
            float menor = medias[0];
            for (int i = 0; i < medias.length; i++) {
                if (medias[i] < menor) {
                    menor = medias[i];
                }
            }
            System.out.println("El ganador es el atleta con la media: " + menor);

        } else {
            System.out.println("Volviendo al menú");
        }
        return winner;
    }
}
