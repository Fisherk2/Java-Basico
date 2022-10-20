package ARCHIVOS;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Clase que lee archivo con formato de arreglo y los almacena en uno
 *
 * @author Fish
 */
public class LecturaArrays {

    public static void main(String[] args) throws FileNotFoundException { //Excepcion que lanza cuando no se encuentra el archivo

        File archivo = new File("ArchivoConArreglos.txt");
        Scanner lector = new Scanner(archivo);
        String linea;
        String[] separador;

        while (lector.hasNext()) {
            linea = lector.nextLine(); //Almacenamos por linea en una variable
            separador = linea.split(","); //Dividimos la linea por comas y lo almacenamos en el arreglo
            if (separador.length == 2) { //Si el tamaño del separador es de dos espacios, significa que esta disponible
                System.out.println(separador[0] + ".- ESTA DISPONIBLE");
            }
        }
        lector.close(); //Confirmamos que lector se estara escribiendo en la consola
    }

}
