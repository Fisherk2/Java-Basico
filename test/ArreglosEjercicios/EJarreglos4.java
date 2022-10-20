/*
 Ejercicio 7: Leer por teclado una serie de 10 numeros enteros. La aplicacion debe indicarnos si los numeros estan
ordenado de forma creciente, decreciente, o si estan desordenados.
 */
package ArreglosEjercicios;

import java.util.Scanner;

public class EJarreglos4 {

    /*
    Hay 4 casos:
    -El arreglo este ordenado en forma ascendente {1,2,3,4,5,6,7,8,9,10}
    -El arreglo este ordenado en forma decreciente {10,9,8,7,6,5,4,3,2,1}
    -El arreglo este desordenado                           {3,1,5,7,3,5,8,9,3,5}
    -El arreglo tenga todos los elementos iguales     {2,2,2,2,2,2,2,2,2,2}
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int arreglo[] = new int[10]; //Se crea los espacios para almacenar los valores que deseamos saber
        boolean creciente = false, decreciente = false;

        System.out.println("Llenar el arreglo");
        for (int i = 0; i < 10; i++) {
            System.out.print((i + 1) + ".- Ingrese el valor entero: ");
            arreglo[i] = entrada.nextInt();
        }
        for (int i = 0; i < 9; i++) { //Se baja a 9 porque no hay posicion 10 al momento de hacer la ultima comparacion
            if (arreglo[i] < arreglo[i + 1]) {//Creciente, el primer arreglo siempre tiene que ser menor que el segundo
                creciente = true;
            }
            if (arreglo[i] > arreglo[i + 1]) {//Decreciente, el primer valor siempre tiene qu ser mayor que el segundo
                decreciente = true;
            }
        }

        if (creciente == true && decreciente == false) { //Si solo se cumplio la condicion de creciente
            System.out.println("\nSus valores van en aumento");
        } else if (decreciente == true && creciente == false) {//Si solo se cumplio la condicion de decreciente
            System.out.println("\nSus valores van en descenso");
        } else if (creciente == true && decreciente == true) {//Si se cumplen ambas condiciones, significa que hay variaciones de valores desordenados
            System.out.println("\nSus valores estan desordenados");
        } else if (creciente == false && decreciente == false) {//Si nunca se cumplio esas condiciones, significa que los valores son identicos3
            System.out.println("\nSus valores estan ordenados");
        }
    }
}
