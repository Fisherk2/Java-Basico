/*
EJERCICIO 5: 
Crear una matriz de n x m filas (cargar n y m por teclado), imprimir la matriz completa y la ultima fila.
 */
package MatrizEjercicios;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Fisher
 */
public class Ejmatrices5 {

    public static void main(String[] args) {

        int[][] matriz;
        int nFilas, nColumas;

        Scanner teclado = new Scanner(System.in);
        nFilas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero de filas de su matriz"));
        nColumas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero de columnas de su matriz"));
        matriz = new int[nFilas][nColumas]; //ESTABLECEMOS EL TAMAÑO DE LA MATRIZ

        //RELLENAMOS LA MATRIZ
        for (int i = 0; i < matriz.length; i++) {//FILAS
            for (int j = 0; j < matriz[i].length; j++) {//COLUMNAS
                System.out.print("DIGITE UN NUMERO ENTERO DE LA POSICION [" + i + "]" + "[" + j + "]: ");
                matriz[i][j] = teclado.nextInt();
            }
        }

        //IMPRIMIMOS LA MATRIZ ENTERA
        System.out.println("\nIMPRIMIMOS LA MATRIZ: ");
        for (int i = 0; i < matriz.length; i++) {//FILAS
            for (int j = 0; j < matriz[i].length; j++) {//COLUMNAS
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");//Salto de linea por cada fila impresa
        }
        //IMPRIMIMOS LA ULTIMA FILA
        System.out.println("\nLOS VALORES DE LA ULTIMA FILA DE LA MATRIZ SON: ");
        for (int i = 0; i < matriz[matriz.length - 1].length; i++) {//ULTIMA FILA, matriz[ posicion de la ultima fila ].length
            System.out.print(matriz[matriz.length - 1][i] + " ");//IMPRIMIRA SOLO LA ULTIMA FILA
        }
        System.out.println("");

    }//PSVM

}
