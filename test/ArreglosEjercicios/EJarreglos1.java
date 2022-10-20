/*
Ejercicio 1: Leer 5 numeros, guardarlos en un arreglo y mostrarlos en el mismo orden introducido.
 */
package ArreglosEjercicios;

import java.util.Scanner;

public class EJarreglos1 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float numeros[] = new float[5];
        
        System.out.println("Guardando los datos dentro del arreglo");
        for (int i = 0; i < 5; i++) { //Entrada de todo los numeros que queremos digitalizar
            System.out.print((i+1)+".- Digite el numero: ");
            numeros[i]=entrada.nextFloat();
        }
        System.out.println("\nImprimir los elementos del arreglo");
        for (float i : numeros) { //Imprime los valores que digitalizamos
            System.out.println(i);
        }
    }

}
