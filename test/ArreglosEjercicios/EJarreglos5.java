/*
Crear un programa que ela por teclado una tabla de 10 numeros enteros y la desplace una posicion hacia abajo:
el primero pasa a ser el segundo, el segundo pasa a ser el tercer y asi sucesivamente. El ultimo pasa a ser 
el primero.
 */
package ArreglosEjercicios;

import java.util.Scanner;

public class EJarreglos5 {

    /*
    El usuario va introducir los valores que quiera
    Despues de introducirlos, el ultimo valor va quedar excluido, este lo almacenamos en otra variable para no perderlo
    Al final determinamos la posicion 0 del arreglo como la variable que hicimos para no perder el ultimo valor
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int arreglo[] = new int[10]; //Creamos el arreglo para los 10 espacios

        System.out.println("Llene los valores");
        for (int i = 0; i < 10; i++) {
            System.out.print(i + ".- Introduzca el valor: ");
            arreglo[i] = entrada.nextInt();
        }

        int ultimo = arreglo[9]; //Guardamos el ultimo valor del arreglo
        for (int i = 8; i >= 0; i--) { //El iterador va descendiendo de uno en uno hasta el cero, 8 es porque el ultimo elemento ya esta guardado.
            arreglo[i+1]=arreglo[i]; //El valor mas alto se desplazara al siguiente, osea hacia abajo
           //Este valor <-------Este valor se convierte a               
        }
        arreglo[0]=ultimo; //Ponemos el ultimo valor como primero
        //Se imprime el nuevo arreglo
        System.out.println("\nEl nuevo arreglo es:");
        for (int i = 0; i < 10; i++) {
            System.out.println(i+".- valor: "+arreglo[i]);
        }
    }
}
