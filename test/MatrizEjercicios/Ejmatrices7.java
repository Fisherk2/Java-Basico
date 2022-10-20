/*
 EJERCICIO 7:
Crear una matriz de n x m elementos (cargar n y m por teclado), intercambiar la primera fila con la segunda.
Imprimir luego la matriz
 */
package MatrizEjercicios;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Fisher
 */
public class Ejmatrices7 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int matriz[][], n, m;

        n = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de filas de su matriz"));
        m = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de columnas de su matriz"));
        matriz = new int[n][m];
        //RELLENAMOS LA MATRIZ
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Rellene la matriz [" + i + "][" + j + "]: ");
                matriz[i][j] = teclado.nextInt();
            }
        }
        //IMPRIMIR MATRIZ
        System.out.println("LA MATRIZ ES: ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "  ");
            }
            System.out.println("");//SALTO DE LINEA POR CADA FILA
        }
        //INTERCAMBIO DE FILAS E IMPRESION 
        int auxiliar;
        for (int i = 0; i < matriz[0].length; i++) {//RECORREMOS LA PRIMER FILA
            auxiliar = matriz[0][i];//GUARDAMOS EL VALOR DE LA PRIMER FILA
            matriz[0][i] = matriz[1][i];//ENVIAMOS EL VALOR DE LA SEGUNDA FILA A LA PRIMERA
            matriz[1][i] = auxiliar; //ENVIAMOS EL VALOR GUARDADO A LA SEGUNDA FILA
        }
        
        System.out.println("LA MATRIZ NUEVA ES: ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "  ");
            }
            System.out.println("");//SALTO DE LINEA POR CADA FILA
        }
    }

}
