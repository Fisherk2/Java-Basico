package ARCHIVOS;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Clase principal que crea y escribe un documento de texto .txt
 *
 * @author Fisher
 */
public class Basico {

    public static void main(String[] archivo) throws IOException { //Cuando se manejan archivos, se deben declarar IOException

        File libreta = new File("ArchivoGenerico.txt"); //Es el archivo donde se va almacenar las cadenas de texto
        FileWriter lapiz = new FileWriter(libreta); //Es la clase que sirve como herramienta para realizar todas las cadenas sobre una clase File

        lapiz.write("Este es un archivo generico escrito por un metodo de la clase FileWrite dentro de un objeto de tipo File");
        lapiz.write("\nSe puede usar el mismo metodo para seguir escribiendo dentro del archivo");

        lapiz.close(); //Sirve para confirmar que el espacio de memoria donde usamos el lapiz sea almacenada en el archivo creado por la clase File

    }

}
