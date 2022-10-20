/*
 Ejercicio 2: Leer 5 numeros por teclado, almacenarlos en un arreglo y a continuacion realizar la media de los
numeros positivos, la media de los negativos y contar el numero de ceros
 */
package ArreglosEjercicios;

import java.util.Scanner;

public class EJarreglos2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float numeros[] = new float[5], mediaPOS, mediaNEG, sumaPOS = 0, sumaNEG = 0;
        int contador0 = 0, contadorPOS = 0, contadorNEG = 0;

        System.out.println("Guardando los numero del arreglo");
        for (int i = 0; i < 5; i++) {
            System.out.print((i + 1) + ".- Digite el numero: ");
            numeros[i] = entrada.nextFloat();

            if (numeros[i] == 0) {
                contador0++;
            }
            if (numeros[i] > 0) {
                contadorPOS++;
                sumaPOS += numeros[i];
            }
            if (numeros[i] < 0) {
                contadorNEG++;
                sumaNEG += numeros[i];
            }
        }
        //Sacar la media
        if (contadorPOS == 0) { //Es para evitar divisiones entre 0
            System.out.println("NO HUBO NUMEROS POSITIVOS");
        } else {
            mediaPOS = sumaPOS / contadorPOS;
            System.out.println("Media de positivos: " + mediaPOS);
        }
        if (contadorNEG == 0) { //Es para evitar divisiones entre 0
            System.out.println("NO HUBO NUMEROS NEGATIVOS");
        } else {
            mediaNEG = sumaNEG / contadorNEG;
            System.out.println("Media de negativos: "+mediaNEG);
        }
        //Imprimir el numero de ceros
        System.out.println("Numero de ceros introducidos: "+contador0);
    }
}
