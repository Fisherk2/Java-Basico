/*
Realizar un programa que contenga un vector cuya longitud sea proporcionado por el usuario, posteriormente solicitar al usuario los numeros necesarios para llenar todas
las posiciones del vector, es decir, si el usuario solicito un arreglo de 10 posiciones, entonces el programa debera de solicitarle al usuario 10 numeros, fianlmente
se debe imprimir el arreglo en pantalla de la siguiente manera:

[5][54][12][65][6][54][897]

 */
package ArreglosEjercicios;

import java.util.Scanner;

/**
 *
 * @author Fisher
 */
public class EJarreglos9 {

    public static void main(String[] vectores) {

        int longitud;

        Scanner entrada = new Scanner(System.in);
        System.out.print("¿Cuantos numeros deseas ingresar?: ");
        longitud = entrada.nextInt();

        int[] numeros = new int[longitud];

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("¿Porfavor dame el valor #" + (i + 1) + ": ");
            numeros[i] = entrada.nextInt();
        }

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("[" + numeros[i] + "]");
        }

    }

}
