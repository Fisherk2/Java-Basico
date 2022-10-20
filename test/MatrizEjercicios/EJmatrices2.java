/*
Ejercicio 2: Crear y cargar una matriz de tamaño 3x3, transponerla y mostrarla.
 */
package MatrizEjercicios;

import java.util.Scanner;

public class EJmatrices2 {

    public static void main(String[] args) {

        int matriz[][] = new int[3][3]; //Matriz de 3x3
        
        //INPUT
        Scanner entrada = new Scanner(System.in);
        System.out.println("DIGITE LA MATRIZ"
                + "\n___________________\n");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Posicion [" + i + "][" + j + "]: ");
                matriz[i][j]=entrada.nextInt();
            }
        }
        
        //OUPUT ORIGINAL
        System.out.println("\n------------------------------\n"
                +"MATRIZ INGRESADA:\n");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println("");//Salto de linea por cada renglon
        }
        //CAMBIO DE VALORES
        int aux; 
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < i; j++) {
                aux=matriz[i][j];//Sirve de vaciado de valores para transferirlos a la nueva posicion
                matriz[i][j]=matriz[j][i];//Los valores de la matriz transpuesta se cambian de posicion del original
                matriz[j][i]=aux; //El valor auxiliar se va a la posicion transpuesta
            }
        }
        
        //OUPUT TRANSPUESTA
        System.out.println("\n------------------------------\n"
                +"MATRIZ TRANSPUESTA:\n");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println("");//Salto de linea por cada renglon
        }
        
    }//PSVM
}
