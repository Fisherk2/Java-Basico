/*
DECLARACION DE LAS EXCEPCIONES DE UN METODO
 */
package EXCEPCIONES;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class DeclaracionDeExcepciones {

    public static void main(String[] args) throws FileNotFoundException {//Java nos obliga a declarar esta excepcion porque no se pueden solucionar con codigo
        DeclaracionDeExcepciones obj = new DeclaracionDeExcepciones();
        obj.leerArchivo();
    }

    public void leerArchivo() throws FileNotFoundException { //Throws nos sirve para declarar una excepcion verificada 
        File archivo = new File("C:\\Users\\msi\\Desktop\\ITL\\Cursos de programacion\\Ficheros JAVA\\texto.txt");
        FileReader fr = new FileReader(archivo);
    }

    public void leerArchivo2() throws IOException, FileNotFoundException { //Se le puede agregar una coma para multiples excepciones
        leerArchivo();
    }
}
