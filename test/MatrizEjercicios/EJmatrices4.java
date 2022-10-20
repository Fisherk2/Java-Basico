/*
Crear una matriz "marco" de tamaño 5x5: todos sus elementos deben ser 0 salvo los de los bordes que deben ser 1. Mostrarla.
 */
package MatrizEjercicios;

public class EJmatrices4 {

    public static void main(String[] args) {
        int matriz[][] = new int[5][5]; //Matriz 5x5

        //RELLENANDO LA MATRIZ
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == 0 || i == 4) { //Delimita las columnas
                    matriz[i][j] = 1;
                } else if (j == 0 || j == 4) {//Delimita los renglones
                    matriz[i][j] = 1;
                }else{
                    matriz[i][j]=0; //Los demas espacios seran rellenados por el numero cero
                }
            }
        }

        //IMPRESION
        System.out.println("MATRIZ MARCO\n");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println(""); //Salto de linea por cada renglon
        }
        
    }//PSVM

}
