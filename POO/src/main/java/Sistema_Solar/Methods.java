/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sistema_Solar;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Methods {

    public static int printMenu() {
        String[] options = {"ADD PLANET", "SHOW PLANETS", "SEARCH PLANET", "DELETE PLANET", "EXIT"};
        int x = JOptionPane.showOptionDialog(null, "Elige una opción:",
                "Ventana",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
        System.out.println(x);
        return x;
    }

    public static int getId (){
        String planeta;
        int planetaInt;
        do {
            planeta = JOptionPane.showInputDialog(null, "Introduce el id del Planeta que quiere ver:");
            planetaInt = Integer.parseInt(planeta);
        } while (ComprobarMenorCeroInt(planetaInt));
        return planetaInt;
    }
    
    public static Planetas[] showPlanets(Planetas[] planetas) {
        System.out.println("");
        int contador = 1;
        boolean encontrado = false;
        for (int i = 0; i < planetas.length; i++) {
            if (planetas[i] != null) {
                JOptionPane.showMessageDialog(null, "PLANETA Nº : " + contador + "\nID: " + planetas[i].getId() + " | "
                        + "NOMBRE: " + planetas[i].getName() + " | "
                        + "MASA: " + planetas[i].getMass() + " | "
                        + "DENSIDAD: " + planetas[i].getDens() + " | "
                        + "DISTANCIA SOL: " + planetas[i].getDist_sol() + "\n\n");
                encontrado = true;
            }
            contador++;
        }
        if (!encontrado) {
            JOptionPane.showMessageDialog(null, "¡No hay planetas!");
        }
        return planetas;
    }

    public static boolean ComprobarMenorCeroInt(int numero) {
        boolean menorCero = false;
        if (numero < 0) {
            menorCero = true;
        }
        return menorCero;
    }

    public static boolean ComprobarMenorCeroDouble(double numero) {
        boolean menorCero = false;
        if (numero < 0) {
            menorCero = true;
        }
        return menorCero;
    }

    public static Planetas[] createFullPlanet(Planetas[] planetas) {
        String id, mass, dens, dist_sol;
        int idInt;
        String name;
        double massDouble, densDouble, dist_solDouble;

        do {
            id = JOptionPane.showInputDialog(null, "Introduce el id del Planeta:");
            idInt = Integer.parseInt(id);
        } while (ComprobarMenorCeroInt(idInt));

        name = JOptionPane.showInputDialog(null, "Introduce el nombre del Planeta:");

        do {
            mass = JOptionPane.showInputDialog(null, "Introduce la masa del Planeta:");
            massDouble = Double.parseDouble(mass);
        } while (ComprobarMenorCeroDouble(massDouble));

        do {
            dens = JOptionPane.showInputDialog(null, "Introduce la densidad del Planeta:");
            densDouble = Double.parseDouble(dens);
        } while (ComprobarMenorCeroDouble(densDouble));

        do {
            dist_sol = JOptionPane.showInputDialog(null, "Introduce la distancia al desde Planeta:");
            dist_solDouble = Double.parseDouble(dist_sol);
        } while (ComprobarMenorCeroDouble(dist_solDouble));

        boolean espacio = false;

        for (int i = 0; i < planetas.length && !espacio; i++) {
            if (planetas[i] == null) {
                planetas[i] = new Planetas(idInt, name, massDouble, densDouble, dist_solDouble);
                espacio = true;
            }
        }
        if (!espacio) {
            JOptionPane.showMessageDialog(null, "¡Posiciónes ocupadas. Borra algún planeta!");
        } else {
            JOptionPane.showMessageDialog(null, "¡El planeta se ha introducido correctamente!");
        }
        return planetas;
    }

    public static void deletePlanets(Planetas[] planetas) {

        boolean encontrado = false;
        String id;
        id = JOptionPane.showInputDialog(null, "Introduce el id del Planeta que quiere eliminar:");
        int finalId = Integer.parseInt(id);
        for (int i = 0; i < planetas.length && !encontrado; i++) {
            if (planetas[i] != null && planetas[i].getId() == finalId) {
                JOptionPane.showMessageDialog(null, "¡Planeta " + planetas[i].getName() + " eliminado correctamente!");
                planetas[i] = null;
                encontrado = true;
            }

            if (!encontrado) {
                JOptionPane.showMessageDialog(null, "¡Planeta no encontrado!");
                break;
            }
        }
    }

    public static Planetas[] showOnePlanet(Planetas[] planetas) {
        Scanner sc = new Scanner(System.in);
        String planetaShow;
        boolean encontrado = false;
        int contador = 1, planetaShowInt;
        
        do {
            planetaShow = JOptionPane.showInputDialog(null, "Introduce el id del Planeta que quiere ver:");
            planetaShowInt = Integer.parseInt(planetaShow);
        } while (ComprobarMenorCeroInt(planetaShowInt));

        for (int i = 0; i < planetas.length && !encontrado; i++) {
            if (planetas[i] != null && planetas[i].getId() == planetaShowInt) {
                JOptionPane.showMessageDialog(null, "PLANETA Nº : " + contador + "\nID: " + planetas[i].getId() + " | "
                        + "NOMBRE: " + planetas[i].getName() + " | "
                        + "MASA: " + planetas[i].getMass() + " | "
                        + "DENSIDAD: " + planetas[i].getDens() + " | "
                        + "DISTANCIA SOL: " + planetas[i].getDist_sol() + "\n\n");
                encontrado = true;
            }
        }
        if (!encontrado) {
            JOptionPane.showMessageDialog(null, "¡No hay planetas con esas características!");
        }
        return planetas;
    }
}
