/*
EJERCICIO 12:
Llenar una matriz con numeros aleatorios de n x m ó la cantidad de filas y columnas que se desea.
 */
package MatrizEjercicios;

import javax.swing.JOptionPane;

/**
 *
 * @author Fisher
 */
public class Ejmatrices12 {

    public static void main(String[] args) {

        int matriz[][], n, m, limite;
        n = Integer.parseInt(JOptionPane.showInputDialog("DIGITE LA CANTIDAD DE FILAS"));
        m = Integer.parseInt(JOptionPane.showInputDialog("DIGITE LA CANTIDAD DE COLUMNAS"));
        limite = Integer.parseInt(JOptionPane.showInputDialog("DIGITE LA CANTIDAD LIMITE DE VALORES"));

        matriz = new int[n][m];

        //RELLENAMOS LA MATRIZ Y LA IMPRIMIMOS
        for (int i = 0; i < matriz.length; i++) {//FILAS
            for (int j = 0; j < matriz[i].length; j++) {//COLUMNAS
                //GENERAMOS NUMEROS ALEATORIOS POR CADA ESPACIO DEL 0 AL LIMITE INGRESADO EN LA ENTRADA
                matriz[i][j] = (int) (Math.random() * limite);//Hacemos un cast ya que el metodo random() devuelve double.
            }
        }
        for (int i = 0; i < matriz.length; i++) {//FILAS
            for (int j = 0; j < matriz[i].length; j++) {//COLUMNAS
                System.out.print(matriz[i][j] + "  ");
            }
            System.out.println("");//SALTO DE LINEA POR CADA FILA IMPRESA
        }
    }

}
