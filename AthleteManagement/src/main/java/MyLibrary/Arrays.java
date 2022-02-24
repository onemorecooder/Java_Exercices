/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MyLibrary;

/**
 *
 * @author ajose
 */
public class Arrays {

    /* PARA SABER SI EL VECTOR ESTÁ LLENO */
    public static boolean isFull(Object[] array) {
        boolean isFull = true;
        int fullCount = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null) {
                fullCount++;
            }
        }
        if (fullCount < array.length) {
            isFull = false;
        }
        return isFull;
    }

    /* PARA SABER SI EL VECTOR ESTÁ VACÍO AL COMPLETO */
    public static boolean isEmpty(Object[] array) {
        boolean isEmpty = false; // BOOLEANO A DEVOLVER, SI ES FALSE HAY ALGO SI DEVUELVE TRUE ESTÁ VACÍO
        // AQUÍ VALORO DOS COSAS, SI EL VECTOR ATLETAS ESTÁ CREADO EN ESTE CONDICIONAL
        if (array == null) {
            isEmpty = true;
            // SI NO ESTÁ CREADO, TE DICE QUE INICIES LA PRIMERA OPCIÓN QUE CREA EL VECTOR DE ATLETAS.
            System.out.println("You haven't inicialized the program!\n- Try to introduce the first athlete.");
        }
        /* EN CAMBIO EN ESTO VALORO SI LAS POSICIONES ESTÁN VACÍAS
           YA QUE SI MUESTRAS LA LISTA SIN INICIAR LA PRIMERA OPCIÓN
            EL VECTOR NO ESTÁ CREADO Y DA ERROR*/
        if (array != null) { // SI EL VECTOR ESTÁ CREADO INDEPENDIENTEMENTE DE LOS VALORES DE SUS POSICIONES ENTRE
            for (int i = 0; i < array.length; i++) { // YA QUE SI NO ESTÁ CREADO NO PUEDE HACER EL .LENGHT YA QUE ES NULL.
                if (array[i] == null) {
                    isEmpty = true;
                } else {
                    isEmpty = false;
                    break;
                }
            }
            if (isEmpty == true){
                // SI ESTÁ VACÍO MUESTRA ESTE MENSAJE, QUE INTRODUZCAS ALGÚN ATLETA
                System.out.println("The program is empty!\n- Try to introduce some athletes.");
            }
        }
        
        return isEmpty;
    }

    /* PARA SACAR LA PRIMERA POSICIÓN VACÍA DE NUESTRO ARRAY*/
    public static int firstFreeArrayPosition(Object array[]) {
        int pos = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                pos = i;
                break;
            } else {

            }
        }
        return pos;
    }

    /* IMPRIME LA CANTIDAD DE POSICIONES VACÍAS */
    public static void manyPositions(Object[] array) {
        int freePos = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                freePos++;
            }
        }
        System.out.println("\nThere are " + freePos + " positions left.");
    }
    
    // CANTIDAD DE POSICIONES LLENAS
    public static int manyPositionsFull(Object[] array) {
        int fullPos = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null) {
                fullPos++;
            }
        }
        return fullPos;
    }
    
}
