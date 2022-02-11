/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MyLibrary;

import static Controller.AthleteController.idAthleteRepeated;
import java.util.Scanner;

/**
 *
 * @author ajose
 */
public class DataValidation {

    /* MÉTODO PARA MOSTRAR EL MENÚ DEL PROGRAMA */
    public static void showMenu() {
        System.out.println("\n########################"
                + "\nWELCOME TO ATHLETE MANAGEMENT"
                + "\nSelect an option:"
                + "\n[1] REGISTER ATHLETE"
                + "\n[2] VIEW ATHLETES"
                + "\n[3] MODIFY ATHLETE"
                + "\n[4] DELETE ATHLETE"
                + "\n[5] EXIT");
    }

    /* CON ESTE MÉTODO SABEMOS COMO SU NOMBRE INDICA SI EL NÚMERO 
       INTRODUCIDO ESTÁ ENTRE LOS DOS ENTEROS QUE SE INTRODUCEN.*/
    public static int readIntBetweenMinAndMax(int min, int max) {
        Scanner sc = new Scanner(System.in);
        int finalInt;
        do {
            finalInt = sc.nextInt();
            if (finalInt > 10 || finalInt < 0) {
                // MENSAJE PARA QUE SE CONOZCAN LOS VALORES A INTRODUCIR
                System.out.println("The array lenght should be under " + max + " or over " + min + ".");
            }
        } while (finalInt > max || finalInt < min);
        return finalInt;
    }

    /*  READ STRING ID ES PARA INTRODUCIR UN ID QUE SI PUEDA ESTAR REPETIDO
    YA QUE SU FINALIDAD ES ENCONTRAR UNO PARA MODIFICARLO*/
    public static String readStringID(int numbers, int characters) {
        Scanner sc = new Scanner(System.in);
        String id = null;

        /* CREAMOS ESTE VECTOR PARA COMPARARLO CON LOS NÚMEROS DEL DNI/NIE Y 
            SABER SI LO INTRODUCIDO SON ÚNICAMENTE NÚMEROS Y NO LETRAS
            AL TRATARSE DE UN STRING */
        String[] num = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};

        boolean correct = false;

        do {
            // INTRODUCIMOS LOS NÚMEROS DEL DNI
            System.out.println("Please, type the numbers of your DNI");
            int numerosDNI = sc.nextInt();
            sc.nextLine();
            /* SI LA LONGITUD DE DICHOS NÚMEROS SUPERA LA ESPECIFICADA CORTA
                       Y VOLVEMOS A REPETIR EL PROCESO. */
            if (Integer.toString(numerosDNI).length() != numbers) {
                System.out.println("Incorrect quantity of numbers!");
            } else {
                /* SI ES CORRECTO SE PROCEDEMOS CON LA INSERCIÓN DEL ÚLTIMO Y
                           ÚNICO CARÁCTER ESPECIFICADO, SI CUMPLE LOS REQUISITOS 
                           SEGUIMOS SINO NOS CORTA COMO EN EL CASO DE LOS NÚMEROS.*/
                System.out.println("Correct numbers! Now choose the final character");
                String lastChar = sc.nextLine();
                if (lastChar.length() != characters) {
                    System.out.println("Wrong amount of characters");
                } else {
                    for (int i = 0; i < num.length; i++) {
                        // PARA QUE EL ÚLTIMO CARÁCTER NO SEA UN NÚMERO
                        if (lastChar.equals(num[i])) {
                            correct = false;
                            break;
                        } else if (!lastChar.equals(num[i])) {
                            String stringNumbers = Integer.toString(numerosDNI);
                            String uppLast = lastChar.toUpperCase();
                            /* SE UTILIZA EL METODO CONCAT PARA UNIR LAS DOS PARTES Y DARLE UN 
                                       FORMATO ESPECÍFICO CON SU GUIÓN */
                            id = stringNumbers.concat(" - " + uppLast);
                            correct = true;
                        }
                    }
                }
            }
            /* REPETIREMOS EL MISMO BUCLE MIENTRAS EL FORMATO DEL ID SEA INCORRECTO O 
                       EL ID SE HAYA REPETIDO CON ALGUNO QUE YA CONSTA EN EL SISTEMA*/
            // LO MISMO PARA DARLE FORMATO AL NIE
        } while (correct == false);
        return id;
    }

    /*  READ STRING ID ES CREADO PARA CREAR UN DNI O UN NIE Y PARA
        CONFIGRAR AUTOMÁTICAMENTE ESTOS. */
    public static String readStringIDnoRepeated(int numbers, int characters) {
        Scanner sc = new Scanner(System.in);
        String id = null;

        /* CREAMOS ESTE VECTOR PARA COMPARARLO CON LOS NÚMEROS DEL DNI/NIE Y 
            SABER SI LO INTRODUCIDO SON ÚNICAMENTE NÚMEROS Y NO LETRAS
            AL TRATARSE DE UN STRING */
        String[] num = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};

        boolean correct = false, repeated = false;

        do {
            System.out.println("[1]DNI or [2]NIE");
            int option = sc.nextInt();
            switch (option) {
                case 1:
                    // INTRODUCIMOS LOS NÚMEROS DEL DNI
                    System.out.println("Please, type the numbers of your DNI");
                    int numerosDNI = sc.nextInt();
                    sc.nextLine();
                    /* SI LA LONGITUD DE DICHOS NÚMEROS SUPERA LA ESPECIFICADA CORTA
                       Y VOLVEMOS A REPETIR EL PROCESO. */
                    if (Integer.toString(numerosDNI).length() != numbers) {
                        System.out.println("Incorrect quantity of numbers!");
                    } else {
                        /* SI ES CORRECTO SE PROCEDEMOS CON LA INSERCIÓN DEL ÚLTIMO Y
                           ÚNICO CARÁCTER ESPECIFICADO, SI CUMPLE LOS REQUISITOS 
                           SEGUIMOS SINO NOS CORTA COMO EN EL CASO DE LOS NÚMEROS.*/
                        System.out.println("Correct numbers! Now choose the final character");
                        String lastChar = sc.nextLine();
                        char c = lastChar.charAt(0);
                        if (lastChar.length() != characters) {
                            System.out.println("Wrong amount of characters");
                        } else {
                            for (int i = 0; i < num.length; i++) {
                                // PARA QUE EL ÚLTIMO CARÁCTER NO SEA UN NÚMERO
                                if (!((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'))) {
                                    correct = false;
                                    break;
                                } else {
                                    String stringNumbers = Integer.toString(numerosDNI);
                                    char uppLast = Character.toUpperCase(c);
                                    /* SE UTILIZA EL METODO CONCAT PARA UNIR LAS DOS PARTES Y DARLE UN 
                                       FORMATO ESPECÍFICO CON SU GUIÓN */
                                    id = stringNumbers.concat(" - " + uppLast);
                                    repeated = idAthleteRepeated(id);
                                    correct = true;
                                }
                            }
                            // SI EL BOOLEANO CORRECT ES FALSO NOS DIRÁ QUE ALGO HA SALIDO MAL
                            if (correct == false) {
                                System.out.println("That's not a character!");
                                // SI SE HA REPETIDO EL ID NOS LO DIRÁ EL SISTEMA
                            } else if (repeated == true) {
                                System.out.println("Something went wrong, ID repeated.");
                                correct = false;
                                // SI TODO SALIÓ BIEN EL ID SE GUARDARÁ
                            } else {
                                System.out.println("ID was correctly saved");
                            }
                        }
                    }
                    /* REPETIREMOS EL MISMO BUCLE MIENTRAS EL FORMATO DEL ID SEA INCORRECTO O 
                       EL ID SE HAYA REPETIDO CON ALGUNO QUE YA CONSTA EN EL SISTEMA*/
                    break;
                // LO MISMO PARA DARLE FORMATO AL NIE
                case 2:
                    System.out.println("Please, type the numbers of your NIE");
                    numerosDNI = sc.nextInt();
                    sc.nextLine();
                    if (Integer.toString(numerosDNI).length() != numbers) {
                        System.out.println("Incorrect quantity of numbers!");
                    } else {
                        System.out.println("Correct numbers! Now choose the final character");
                        String lastChar = sc.nextLine();
                        if (lastChar.length() != characters) {
                            System.out.println("Wrong amount of characters");
                        } else {
                            for (int i = 0; i < num.length; i++) {
                                if (lastChar.equals(num[i])) {
                                    correct = false;
                                    break;
                                } else if (!lastChar.equals(num[i])) {
                                    String stringNumbers = Integer.toString(numerosDNI);
                                    String uppLast = lastChar.toUpperCase();
                                    id = uppLast.concat(" - " + stringNumbers);
                                    repeated = idAthleteRepeated(id);
                                    correct = true;
                                }
                            }
                            if (correct == false) {
                                System.out.println("That's not a character!");
                            } else if (repeated == true) {
                                System.out.println("Something went wrong, ID repeated.");
                                correct = false;
                                // SI TODO SALIÓ BIEN EL ID SE GUARDARÁ
                            } else {
                                System.out.println("ID was correctly saved");
                            }
                        }
                    }
                    break;
                default:
                    System.out.println("Wrong option!");
            }
        } while (correct == false);
        return id;
    }

    /*  ESTE MÉTODO ES CREADO PARA QUE LA EDAD ESTÉ ENTRE 18 Y 99 */
    public static int over18() {
        int age;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Insert your age:");
            age = sc.nextInt();
            if (age < 18 || age > 100) {
                System.out.println("You should be over 18 or under 100 to run the marathon!");
            }
        } while (age < 18 || age > 100);
        return age;
    }

    /*  ESTE MÉTODO ES CREADO PARA QUE EL DORSAL ESTÉ ENTRE 1000 Y 9999 PARA 
        QUE SOLO CONTENGA 4 CARÁCTERES. */
    public static int between1000and9999() {
        int dorsal;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Insert your dorsal:");
            dorsal = sc.nextInt();
            if (dorsal < 1000 || dorsal > 9999) {
                System.out.println("Your dorsal should be between 1000 & 9999!");
            }
        } while (dorsal > 9999 || dorsal < 1000);
        return dorsal;
    }
    
    /* MÉTODO PARA QUE ÚNICAMENTE HAYAN LETRAS EN EL NOMBRE */
    public static boolean onlyWords(String name) {
    for (int x = 0; x < name.length(); x++) {
        char c = name.charAt(x);
        // Si no está entre a y z, ni entre A y Z, ni es un espacio
        if (!((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || c == ' ')) {
            System.out.println("That's not a name!");
            return false;
        }
    }
    return true;
}
}
