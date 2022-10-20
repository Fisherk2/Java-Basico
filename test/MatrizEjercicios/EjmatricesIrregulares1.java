/*
EJERCICIO 1:
Confeccionar un programa que permita crear una matriz irregular y luego imprimir la matriz en forma completa
 */
package MatrizEjercicios;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Fisher
 */
public class EjmatricesIrregulares1 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int nFilas;
        int[][] matrizIrregular;

        nFilas = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de filas para la matriz irregular"));
        matrizIrregular = new int[nFilas][];//Asignamos el numero de filas de la matriz
        
        //RELLENAMOS LA MATRIZ IRREGULAR
        for (int i = 0; i < matrizIrregular.length; i++) {//FILAS
            int nColumnas = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de columnas de la fila n°" + i));
            matrizIrregular[i] = new int[nColumnas];//Asignamos el numero de columnas por cada fila iterada
            System.out.println("RELLENE LA FILA N°" + i + ": ");
            for (int j = 0; j < matrizIrregular[i].length; j++) {//COLUMNAS
                System.out.print("[" + i + "][" + j + "]: ");
                matrizIrregular[i][j] = teclado.nextInt();
            }
        }
        //IMPRESION DE MATRIZ IRREGULAR
        System.out.println("\nLA MATRIZ IRREGULAR ES: ");
        for (int i = 0; i < matrizIrregular.length; i++) {//FILAS
            for (int j = 0; j < matrizIrregular[i].length; j++) {//COLUMNAS
                System.out.print("[" + matrizIrregular[i][j] + "]  ");
            }
            System.out.println("");//SALTO DE LINEA POR CADA FILA
        }
    }

}
