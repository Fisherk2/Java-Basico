/*
EJERCICIO 2:
Confeccionar una clase para administrar una matriz irregular de 5 filas,
1 columna en la primera
2 columnas en la segunda y asi sucesivamente hasta 5 columnas en la ultima fila.
Realizar la carga por teclado e imprimir posteriormente.
 */
package MatrizEjercicios;

import java.util.Scanner;

/**
 *
 * @author Fisher
 */
public class EjmatricesIrregulares2 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int matrizIrregular[][] = new int[5][];//Asignamos las 5 filas a la matriz
        //RELLENAMOS LA MATRIZ
        System.out.println("RELLENE LA MATRIZ");
        for (int i = 0; i < matrizIrregular.length; i++) {
            matrizIrregular[i] = new int[i + 1];//Asignamos el numero de columnas por fila interada
            System.out.println("DIGITE LOS VALORES DE LA FILA N°" + i);
            for (int j = 0; j < matrizIrregular[i].length; j++) {
                System.out.print("[" + i + "][" + j + "]: ");
                matrizIrregular[i][j] = teclado.nextInt();
            }
        }
        //IMPRESION DE LA MATRIZ
        System.out.println("LA MATRIZ FUE:");
        for (int i = 0; i < matrizIrregular.length; i++) {
            for (int j = 0; j < matrizIrregular[i].length; j++) {
                System.out.print("[" + matrizIrregular[i][j] + "]  ");
            }
            System.out.println("");//SALTO DE LINEA POR CADA FILA
        }

    }

}
