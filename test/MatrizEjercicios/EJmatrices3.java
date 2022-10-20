/*
Suma de renglones y columnas de una matriz
 */
package MatrizEjercicios;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class EJmatrices3 {

    public static void main(String[] args) {
        int matriz[][], nRenglones, nColumnas;

        Scanner Input = new Scanner(System.in);
        nRenglones = Integer.parseInt(JOptionPane.showInputDialog("INGRESE NUMERO DE RENGLONES"));
        nColumnas = Integer.parseInt(JOptionPane.showInputDialog("INGRESE NUMERO DE COLUMNAS"));
        matriz = new int[nRenglones][nColumnas];

        //Input
        System.out.println("RELLENE LA MATRIZ\n");
        for (int i = 0; i < nRenglones; i++) {
            for (int j = 0; j < nColumnas; j++) {
                System.out.print("Posicion [" + i + "][" + j + "]: ");
                matriz[i][j] = Input.nextInt();
            }
        }

        //Output
        System.out.println("\n----------------------\n"
                + "MATRIZ ORIGINAL\n");
        for (int i = 0; i < nRenglones; i++) {
            for (int j = 0; j < nColumnas; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");//Salto de linea por cada renglon
        }
        System.out.println("-------------------------");

        //Suma de renglones y columnas
        int sumatoriaR, sumatoriaC; //Suma total de renglones y columnas
        //Renglones
        for (int i = 0; i < nRenglones; i++) {
            sumatoriaR = 0;
            for (int j = 0; j < nColumnas; j++) {
                sumatoriaR += matriz[i][j]; //sumatoriaR= sumatoriaR+matriz[ i ][ j ]
            }
            System.out.println("La suma de los valores del renglon [" + i + "]= " + sumatoriaR);
        }
        //Columnas
        System.out.println("");//Salto de linea para diferenciarlo de las columnas
        for (int j = 0; j < nColumnas; j++) {// Se inicia por las columnas
            sumatoriaC = 0;
            for (int i = 0; i < nRenglones; i++) {
                sumatoriaC += matriz[i][j]; //sumatoriaC= sumatoriaC+matriz[ i ][ j ]
            }
            System.out.println("La suma de los valores de la columna [" + j + "]= " + sumatoriaC);
        }
    }//PSVM

}
