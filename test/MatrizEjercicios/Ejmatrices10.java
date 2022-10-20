/*
EJERCICIO 10:
Crear y cargar una matris de 3 x 4. Imprimir la primer fila, imprimir la ultima fila e imprimir la primera columna
 */
package MatrizEjercicios;

import java.util.Scanner;

/**
 *
 * @author Fisher
 */
public class Ejmatrices10 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int matriz[][] = new int[3][4];

        //RELLENO E IMPRESION DE LA MATRIZ
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("RELLENE LA MATRIZ [" + i + "][" + j + "]: ");
                matriz[i][j] = teclado.nextInt();
            }
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "  ");
            }
            System.out.println("");
        }
        //IMPRESION DE LA PRIMER FILA
        System.out.println("\nIMPRESION DE LA PRIMER FILA: ");
        for (int i = 0; i < matriz[0].length; i++) {
            System.out.print(matriz[0][i] + "  ");
        }
        //IMPRIMIMOS LA ULTIMA FILA
        System.out.println("\nIMPRESION DE LA ULTIMA FILA: ");
        for (int i = 0; i < matriz[matriz.length-1].length; i++) {
            System.out.print(matriz[matriz.length - 1][i] + "  ");
        }
        //IMPRIMIMOS LA PRIMER COLUMNA
        System.out.println("\nIMPRESION DE LA PRIMER COLUMNA: ");
        for (int i = 0; i < matriz.length; i++) {
            System.out.print(matriz[i][0]+"  ");
        }

    }//PSVM

}
