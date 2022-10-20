/*
 Ejercicio 6: Leer 5 elementos numericos que se introduciran ordenados de forma creciente. Estos los
guardaremos en una tabla de tamaño 10. Leer un numero N, e insertarlo en el lugar adecuado para que
la tabla continue ordenada
 */
package ArreglosEjercicios;

import java.util.Scanner;

public class EJarreglos6 {

    /*
    Al usuario le tienes que pedir al principio 5 elementos y  ordenarlos de forma creciente
    Si no estan de esta forma, hacer que el usuario lo vuelva a introducir (do while)
    Ahora introduce cualquier valor para ordenarlo y acomodarlo en los elementos que introducimos primero (while)
    Tenemos que recorrer el arreglo para encontrar la posicion del valor que introdujo el usuario 
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int arreglo[] = new int[10];
        boolean creciente = true; //Solo se va iniciar en true porque es lo que se espera que el usuario introduzca para no repetir el ciclo do while

        System.out.println("Llene los primeros 5 datos");//Se verifican los primeros 5 valores
        do {
            for (int i = 0; i < 5; i++) {//Se llenan los valores en el arreglo
                System.out.print((i + 1) + ".- Introduzca el numero: ");
                arreglo[i] = entrada.nextInt();
            }
            //Comprobar si el arreglo esta ordenado de manera creciente
            for (int i = 0; i < 4; i++) {//Hasta 4 porque el ultimo valor no se va comparar con el siguiente
                if (arreglo[i] < arreglo[i + 1]) {
                    creciente = true;
                }
                if (arreglo[i] > arreglo[i + 1]) {
                    creciente = false;
                    break; //Sale de este bucle si en algun momento se comprueba que el valor no esta ordenado correctamente
                }
            }
            if (creciente == false) { //Generamos un mensaje de error
                System.out.println("\nERROR, VUELVE A INTRODUCIR LOS VALORES DE MANERA CRECIENTE\n");
            }
        } while (creciente == false);//Si el usuario teclea de manera correcta, el ciclo se termina

        int numero, posicionN = 0, j = 0; //Se crea la variable para insertar el valor en el arreglo
        System.out.println("\nDigite el numero a insertar");
        numero = entrada.nextInt();

        //Se esta buscando en que posicion puede caer el numero que ingresamos y se detiene de sumar hasta que encuentre un valor mayor al que introducimos
        while (arreglo[j] < numero && j < 5) { //Si el primer valor es menor que el numero que ingresamos, se recorre uno para compararlo con el siguiente            
            posicionN++;
            j++;
        }
        //Movemos nuestro valor introducido a la posicion del arreglo y recorremos en que sustituimos
        for (int i = 5; i >= posicionN; i--) {//Generamos el hueco donde vamos a introducir el valor
            arreglo[i + 1] = arreglo[i];
        }
        //Insertamos el valor en el espacio que creamos
        arreglo[posicionN] = numero;
        
        System.out.println("\nEl arreglo queda asi:");
        for (int i = 0; i < 6; i++) {
            System.out.print(arreglo[i]+" ");
        }
    }
}
