/*
 EJERCICIO 6:
Crear una matriz de n x m elementos (cargar n y m por teclado), imprimir el mayor elemento y la fila
y columna donde se almacena.
 */
package MatrizEjercicios;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Fisher
 */
public class Ejmatrices6 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int[][] matriz;
        int n, m;

        n = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de filas de su matriz"));
        m = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de columnas de su matriz"));
        matriz = new int[n][m];//ESTABLECEMOS EL NUMERO DE FILAS Y COLUMNAS DE LA MATRIZ
        //RELLENAR LA MATRIZ
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Digite los valores de la posicion [" + i + "][" + j + "]: ");
                matriz[i][j] = teclado.nextInt();
            }
        }
        //IMPRIMIR LA MATRIZ
        for (int i = 0; i < matriz.length; i++) { //FILA
            for (int j = 0; j < matriz[i].length; j++) {//COLUMNA
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");//Salto de linea por cada fila
        }
        //BUSCAR EL VALOR MAYOR DE LA MATRIZ E IMPRIMIRLA
        int elementoMayor=matriz[0][0];//Comenzamos con el primer valor de la matriz para hacer las comparaciones
        int posicionFila=0;
        int posicionColumna = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if(matriz[i][j]>elementoMayor){
                    elementoMayor=matriz[i][j];
                    posicionFila=i;
                    posicionColumna=j;
                }
            }
        }
        System.out.println("\nEl elemento con mayor valor es: "+elementoMayor
                +"\nUbicacion Fila: "+posicionFila
                +"\nUbicacion Columna: "+posicionColumna);
    }

}
