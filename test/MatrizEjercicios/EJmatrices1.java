/*
 Ejercicio 1: Crear y cargar una matriz de tamaño n x m y decir si es simetrica o no.
Una matriz simetrica debe cumplir con estos requisitos:
-Ser cuadrada
-nFilas==nCol
-Cuando se obtiene la misma matriz al cambiar sus filas por columnas (Transpuesta)
 */
package MatrizEjercicios;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class EJmatrices1 {

    public static void main(String[] args) {
        int matriz[][], nFilas, nColumnas;
        nFilas = Integer.parseInt(JOptionPane.showInputDialog("INGRESE EL NUMERO DE FILAS"));
        nColumnas = Integer.parseInt(JOptionPane.showInputDialog("INGRESE EL NUMERO DE COLUMNAS"));

        matriz = new int[nFilas][nColumnas];
        Scanner entrada = new Scanner(System.in);
        System.out.println("ESCRIBA SU MATRIZ"
                + "\n______________________\n");
        for (int i = 0; i < nFilas; i++) {
            for (int j = 0; j < nColumnas; j++) {
                System.out.print("Posicion [" + i + "][" + j + "]: ");
                matriz[i][j] = entrada.nextInt();
            }
        }
        if (nFilas == nColumnas) {//Condicion para saber si es una matriz cuadrada
            int i, j;
            boolean simetrica = true;
            i = 0;//Contador inicial de filas
            while (i < nFilas && simetrica == true) {
                j = 0;//Contador inicial de columnas
                while (j < i && simetrica == true) {
                    if (matriz[i][j] != matriz[j][i]) { //Condicion si la matriz transpuesta es igual que a la matriz original
                        simetrica = false;
                    }
                    j++;
                }
                i++;
            }

            if (simetrica == true) {
                JOptionPane.showMessageDialog(null, "Su matriz es simetrica");
            } else {
                JOptionPane.showMessageDialog(null, "Su matriz no es simetrica");
            }

        } else {
            JOptionPane.showMessageDialog(null, "Su matriz no es simetrica");
        }

    }//PSVM

}
