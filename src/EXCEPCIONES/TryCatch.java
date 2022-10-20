/*
TRY - CATCH con excepciones verificadas
 */
package EXCEPCIONES;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;

public class TryCatch {

    public static void main(String[] args) {

        //OBJETOS
        TryCatch menu = new TryCatch();
        //INVOCACIONES
        menu.leerArchivo2();
    }

    public void leerArchivo() throws FileNotFoundException, IOException { //Hacemos la declaracion obligatoria de excepcion verificada en metodos que se puedan generar estos mismos
        File archivo = new File("C:\\Users\\msi\\Desktop\\ITL\\Cursos de programacion\\Ficheros JAVA\\texto.txt");
        FileReader fr = new FileReader(archivo);
        BufferedReader bf = new BufferedReader(fr);
        String linea;

        while ((linea = bf.readLine()) != null) {
            System.out.println(linea);
        }
    }

    public void leerArchivo2() {
        //Este codigo sirve para que nuestro programa no frene de forma repentina cuando ocurre una excepcion
        try {
            //BLOQUE DE CODIGO QUE PUEDA GENERAR UNA EXCEPCION
            leerArchivo();
        } catch (FileNotFoundException|NullPointerException error01) { //Puedes ingresar multiples excepciones sin necesidad de hacer muchos CATCH
            //BLOQUE DE CODIGO QUE CORRE SI OCURRE ESA EXCEPCION
            JOptionPane.showMessageDialog(null, "ERROR 01, NO SE HA ENCONTRADO EL ARCHIVO VERIFICADO");
        } catch (IOException errorGeneral) {
            //BLOQUE DE CODIGO QUE CORRE SI OCURRE ESA EXCEPCION VERIFICADA GENERAL
            JOptionPane.showMessageDialog(null, "Ha ocurrido una excepcion verificada");
        } finally{ 
            //BLOQUE DE CODIGO QUE CORRE SI OCURRE O NO UNA EXCEPCION
        }

        System.out.println("PROGRAMA TERMINADO");

    }

}//CLASS
