/*
Excepciones Verificadas (IOException) y No Verificadas (RunTimeException)
 */
package EXCEPCIONES;

//Paquetes para manejo de archivos
import java.io.BufferedReader; //Lector de archivos
import java.io.FileNotFoundException; //Error de lectura de archivo
import java.io.FileReader; //Lector de archivos
import java.io.IOException; //Excepcion Verificada

public class VerificadasYNoVerificadas {

    public static void main(String[] args) throws IOException {
        //Errores con IOException
        ExcepcionesVerificadas();
        //Errores con RunTimeException
        ExcepcionesNoVerificadas();

    }

    public static void ExcepcionesVerificadas() throws FileNotFoundException, IOException { //Java va tratar de evadir ese error ya que son problemas que no se solucionan con codigo
        //Excepciones Verificadas (IOExcepcion) [Se va leer el archivo con un nombre distinto o eliminado]
        BufferedReader bf = new BufferedReader(new FileReader("C:\\Users\\msi\\Desktop\\ITL\\Cursos de programacion\\Ficheros JAVA\\texto.txt")); //Se lee el archivo con esta direccion especifica
        String linea; //Creamos una variable para almacenar el fichero que vamos a leer
        while ((linea = bf.readLine()) != null) { //Seguira leyendo cadenas hasta que haya un vacio en el fichero
            System.out.println(linea);
        }
    }

    public static void ExcepcionesNoVerificadas() {
        //Excepciones NO Verificadas (RunTimeException) [Se va dividir un valor entero entre cero]
        int num1=5;
        int num2=0;
        int resultado=num1/num2;
        
        System.out.println(resultado);
    }
}//CLASS
