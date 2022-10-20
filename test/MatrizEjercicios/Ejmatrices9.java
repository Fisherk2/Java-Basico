/*
EJERCICIO 9:
Crear y cargar una matriz de 4 filas por 4 columnas. Imprimir la diagonal principal

x - - -
- x - -
- - x -
- - - x

 */
package MatrizEjercicios;

import java.util.Scanner;

/**
 *
 * @author Fisher
 */
public class Ejmatrices9 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int matriz[][] = new int[4][4];
        //RELLENAMOS LA MATRIZ Y LA IMPRIMIMOS
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Rellene la matriz ["+i+"]["+j+"]: ");
                matriz[i][j]=teclado.nextInt();
            }
        }
        System.out.println("La matriz es: ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j]+"  ");
            }
            System.out.println("");
        }
        //IMPRIMIMOS LOS VALORES DE LA DIAGONAL PRINCIPAL
        System.out.println("LA DIAGONAL PRINCIPAL ES: ");
        for (int k = 0; k < matriz.length; k++) {
            System.out.print(matriz[k][k]+"  ");
        }
        
        
    }//PSVM

}
