/*
Matriz
 */
package BASICO;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Matriz {

    public static void main(String[] args) {
        //Forma 1 de rellenar valores en una matriz
        int matriz1[][] = {
            {1, 2, 3, 4}, 
            {5, 6, 7, 8}, 
            {9, 10, 11, 12}}; //Matriz de 3x4
        //Impresion
        System.out.println("FORMA 1 DE CREAR UNA MATRIZ"
                + "\n_____________________________\n");
        for (int i = 0; i < matriz1.length; i++) { //Bucle que cuenta el numero de renglones
            for (int j = 0; j < matriz1[i].length; j++) {//Bucle que cuenta el numero de columnas
                System.out.print(matriz1[i][j] + "-");//Donde i es el numero de renglones y j el numero de columnas 
            }
            System.out.println("");//Salto de linea
        }
        System.out.println("--------------------------------------");//Separador

        //Forma 2 de rellenar valores en una matriz
        Scanner entrada = new Scanner(System.in); //Abrimos entrada para rellenar la matriz
        int matriz2[][], nRenglones, nColumnas;

        nRenglones = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de renglones de la matriz"));
        nColumnas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de columnas de la matriz"));
        matriz2 = new int[nRenglones][nColumnas]; //Declaramos los valores de la matriz
        //Captura
        System.out.println("FORMA 2 DE CREAR UNA MATRIZ"
                + "\n___________________________________\n");
        System.out.println("INGRESE LOS VALORES DE LA MATRIZ (i=Posicion del Renglon)(j=Posicion de la Columna)\n");
        for (int i = 0; i < nRenglones; i++) {
            for (int j = 0; j < nColumnas; j++) {//Se ingresa los valores en los renglones pasando por las posiciones de la columna.
                System.out.print("Matriz[" + i + "][" + j + "]:");
                matriz2[i][j] = entrada.nextInt();
            }
        }
        //Impresion
        System.out.println("\nLA MATRIZ QUE INGRESO ES LA SIGUIENTE:");
        for (int i = 0; i < nRenglones; i++) {
            for (int j = 0; j < nColumnas; j++) {
                System.out.print(matriz2[i][j] + "-");//Donde i es el numero de renglones y j el numero de columnas
            }
            System.out.println("");//Salto de linea
        }
        System.out.println("--------------------------------------");//Separador

    }

}
