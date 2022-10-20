/*
EJERCICIO 8:
Crear una matriz n x m, imprimir los cuatro valores que se encuentran en los vertices (las esquinas) de la misma.
(mat[ 0 ] [ 0 ], etc.)
 */
package MatrizEjercicios;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Fisher
 */
public class Ejmatrices8 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int matriz[][], n, m;

        n = Integer.parseInt(JOptionPane.showInputDialog("Numero de filas:"));
        m = Integer.parseInt(JOptionPane.showInputDialog("Numero de filas:"));
        matriz = new int[n][m];
        //RELLENAMOS LA MATRIZ Y LA IMPRIMIMOS
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Rellene la matriz [" + i + "][" + j + "]: ");
                matriz[i][j] = teclado.nextInt();
            }
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "  ");
            }
            System.out.println("");//SALTO DE LINEA POR CADA FILA
        }
        //IMPRIMIR LOS VERTICES
        System.out.println("El vertice superior izquierdo es: "+matriz[0][0]);
        System.out.println("El vertice superior derecho es: "+matriz[0][matriz[0].length-1]);
        System.out.println("El vertice inferior izquierdo es: "+matriz[matriz.length-1][0]);
        System.out.println("El vertice inferior derecho es: "+matriz[matriz.length-1][matriz[matriz.length-1].length-1]);
        
    }//PSVM

}
