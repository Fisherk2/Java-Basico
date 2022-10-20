/*
MATRICES IRREGULARES

Java nos permite crear matrices irregulares. Se dice que una matriz es irregular si la cantidad de elementos de cada
fila varia. Luego podemos imaginar una matriz irregular.
Ejemplo:

1 2 3
4 5
6 7 8 9

 */
package BASICO;

/**
 *
 * @author Fisher
 */
public class MatrizIrregular {

    public static void main(String[] args) {
        //Asignamos el numero de filas solamente que tendra nuestra matriz, dejando espacio en las columnas
        int[][] matriz = new int[3][];
        //Debemos asignar por fila los espacios que va tener de la siguiente manera
        matriz[0] = new int[3]; 
        matriz[1] = new int[2]; 
        matriz[2] = new int[4]; 
        
        for (int i = 0; i < matriz.length; i++) {//FILAS
            System.out.println("La cantidad de columnas que tiene la fila "+i+" es: "+matriz[i].length);
        }
    }

}
