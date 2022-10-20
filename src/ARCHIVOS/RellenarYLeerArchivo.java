package ARCHIVOS;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Clase principal que crea, escribe y lee archivos .txt por medio de la consola
 *
 * @author Fisher
 */
public class RellenarYLeerArchivo {

    public static void main(String[] args) throws IOException { //Se declara una excepcion

        File cuaderno = new File("ArchivoEscritoEnConsola.txt");
        FileWriter pluma = new FileWriter(cuaderno);

        String textoIngresado;
        Scanner teclado = new Scanner(System.in, "latin1");//El argumento "latin1" es para que lea archivos del idioma latin

        /*
        ESCRITURA DE TEXTO
         */
        System.out.println("Escribe lo que quieras llenar en el archivo de texto (Terminas de rellenar con la palabra 'fin'): ");
        while (!(textoIngresado = teclado.nextLine()).equals("fin")) { //Condicion que termina cuando el texto ingresado de la linea sea exactamente "fin"
            pluma.write(textoIngresado + "\n"); //Seguira rellenandose por cada salto de linea en el archivo de texto
        }
        pluma.close(); //Confirmamos que pluma se esta escribiendo en el objeto de tipo File
        System.out.println("--------------------------------------------");
        
        /*
        LECTURA DE ARCHIVO DE TEXTO
         */
        Scanner lector1 = new Scanner(cuaderno);
        Scanner lector2 = new Scanner(cuaderno);

        System.out.println("IMPRESION POR LINEA DE TEXTO DEL ARCHIVO ESCANEADO:");

        while (lector1.hasNext()) { //Condicion que termina cuando el texto ingresado haya llegado a su fin
            System.out.println(lector1.nextLine()); //Se imprimira el Scanner por linea de texto del archivo
        }
        System.out.println("______________________________________________");

        System.out.println("\nIMPRESION POR CADENA DEL ARCHIVO ESCANEADO:");

        while (lector2.hasNext()) { //Condicion que termina cuando el texto ingresado haya llegado a su fin
            System.out.println(lector2.next()); //Se imprimira el Scanner por cadena del archivo
        }
        lector1.close(); //Confirmamos que lector se estara escribiendo en la consola
        lector2.close(); //Confirmamos que lector se estara escribiendo en la consola

    }

}
