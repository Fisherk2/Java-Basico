package ArchivosEjercicio1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * CLASE QUE CREA Y ESCRIBE SOBRE UN ARCHIVO DE TEXTO
 *
 * @author Fish
 */
public class Archivo {

    private File archivo;

    public void crearFichero() {
        archivo = new File("C:\\Users\\msi\\Desktop\\ITL\\Cursos de programacion\\Ficheros\\AgendaContactos.txt");
        try {
            if (archivo.createNewFile()) {
                //El archivo ha sido creado
            }
        } catch (IOException ex) {
            System.err.println("EL ARCHIVO NO SE PUDO CREAR CORRECTAMENTE: " + ex);
        }
    }

    /**
     * Metodo que requiere la informacion del objeto de la clase Persona para
     * poder escribir sobre el fichero
     *
     * @param persona
     */
    public void escribirTexto(Persona persona) {
        try {
            FileWriter escribir = new FileWriter(archivo,true);//Ademas de escribir, se podra añadir mas texto
            //Separamos los datos con un simbolo y al final damos un interlineado
            escribir.write(persona.getNombre()+"%"+persona.getCorreo()+"%"+persona.getCelular()+"\r\n");
            escribir.close(); //Terminamos de usar la clase FileWriter cerrando el archivo
        } catch (IOException ex) {
            System.err.println("EL ARCHIVO NO SE PUDO ESCRIBIR CORRECTAMENTE: " + ex);
        }
    }
}
