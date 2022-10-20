/*
 Ejercicio 8: Leer 10 enteros ordenados crecientemente. Leer N y buscarlo en la tabla. Se debe mostrar
la posicion en que se encuentra. Si no esta, indicarlo con un mensaje.
 */
package ArreglosEjercicios;

import java.util.Scanner;

public class EJarreglos8 {

    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
        int arreglo[], numero;
        boolean creciente = true;//Se inicia en true porque el usuario debe ingresarlo correctamente, a menos que el operador demuestre lo contrario

        arreglo = new int[10];//Creamos el arreglo con 10 espacios

        //Revision: si nuestros valores estan de forma creciente
        do {
            //Metemos nuestros valores ordenados al arreglo
            System.out.println("Rellene los valores en forma creciente");
            for (int i = 0; i < 10; i++) {
                System.out.print("Posicion " + i + " Introduzca el valor: ");
                arreglo[i] = entry.nextInt();
            }
            //Verificar si nuestros valores estan en forma creciente
            for (int i = 0; i < 9; i++) {//Se llega hasta nueve porque el ultimo valor no se puede comparar con el siguiente ya que no existe espacio en este arreglo
                if (arreglo[i] < arreglo[i + 1]) {//Si esta condicion se cumple, nuestro arreglo esta en forma creciente
                    creciente = true;
                }
                if (arreglo[i] > arreglo[i + 1]) {//Si esta condicion se cumple, nuestro arreglo esta en forma decreciente, por lo tanto, debe repetir el ciclo
                    creciente = false;
                    break;//Si ya se cumplio esta condicion, se sale del ciclo for para determinar que nuestro arreglo no esta ordenado correctamente
                }
            }

            if (creciente == false) {//Anuncia al usuario que los valores que introdujo estan mal
                System.out.println("\nERROR, vuelva a introducir sus valores, ya que no los hizo de forma creciente\n");
            }
        } while (creciente == false);
        //Leer N que vaya introducir el usuario
        System.out.println("\nIntroduzca el valor que quiere buscar en el arreglo");
        numero = entry.nextInt();

        //Buscar el numero que este en el arreglo (while)
        //Busca en que posicion podria estar el numero que introducimos en los valores del arreglo
        int i = 0;
        while (i < 10 && arreglo[i] < numero) { //Va a buscar el numero hasta que llegue el numero que ingresaste o menor a este     
            i++;
        }
        //Se verifica si en la posicion donde se paro el ciclo coicide con el numero que ingresamos
        if (i == 10) {//Se recorrio todo el arreglo y no encontro el numero que ingresaste
            System.out.println("\nEl numero que ingreso NO se encuentra en el arreglo");
        } else {
            if (arreglo[i] == numero) {//Si el numero es igual a la posicion en el que se detuvo el arreglo, significa que si existe ese numero
                System.out.println("\nEl numero que ingresaste SI se encuentrea en tu arreglo y se encuentra en la posicion " + i);
            } else {//Significa que el numero del arreglo es mayor al que ingresaste, por lo tanto, tampoco se encontro
                System.out.println("\nEl numero que ingreso NO se encontro en el arreglo");
            }
        }
    }

}
