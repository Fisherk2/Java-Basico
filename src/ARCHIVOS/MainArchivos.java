package ARCHIVOS;

import java.io.BufferedReader;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * ARCHIVOS: Un archivo o fichero informatico es un conjunto de bits almacenados
 * en un dispositivo. Es identificado por un nombre y la descripcion de la
 * carpeta o directorio que lo contiene. Los archivos informaticos facilitan uan
 * manera de organizar los recursos usados para almacenar permanetemente los
 * datos en un sistema informatico virtual.
 *
 * @author Fisher
 */
public class MainArchivos {

    /* TIPOS DE ARCHIVOS
    Archivos de texto: Son reconocidos por su contenido, ya que pueden abrirse con cualquier editor de texto.
    Archivos binarios: Contienen informacion de cualquier tipo codificada en binario para el proposito de almacenamiento y 
    procesamiento en ordenadores, estos almacenan objetos en formato de bytes.
     */
    File archivo, directorio;
    FileOutputStream archivoBinario;

    public static void main(String[] args) {
        MainArchivos navegador = new MainArchivos();
        //ARCHIVOS DE TEXTO
        navegador.buscarFicheroYDirectorio();
        navegador.creacionFichero();
        navegador.creacionDirectorio();
        navegador.escribirFichero();
        navegador.leerFichero();
        //ARCHIVOS BINARIOS
        navegador.escribirBinario();
        navegador.añadirBinario();
        navegador.leerBinario();

    }//PSVM

    private void buscarFicheroYDirectorio() {
        //Ruta absoluta
        archivo = new File("C:\\Users\\msi\\Desktop\\ITL\\Cursos de programacion\\Ficheros\\prueba.txt");
        directorio = new File("C:\\Users\\msi\\Desktop\\ITL\\Cursos de programacion\\Ficheros\\directorioPrueba");
        //Ruta relativa, esta funciona siempre y cuando el archivo este dentro de la carpeta del proyecto
        File archivoRel = new File("prueba.txt");

        if (archivo.exists()) {//Si el archivo existe, enviara un mensaje
            System.out.println("El archivo existe");
            System.out.println("\nLA RUTA DE TU ARCHIVO SE ENCUENTRA AQUI:\n" + archivo.getAbsolutePath());
            System.out.println("Es un archivo: " + archivo.isFile());
            System.out.println("Es una carpeta/directorio: " + archivo.isDirectory());
            System.out.println("Este archivo se puede leer: " + archivo.canRead());
            System.out.println("El directorio de prueba se puede leer: " + directorio.isDirectory());

        } else {
            System.out.println("NO EXISTE");
        }
    }

    private void creacionFichero() {
        try {
            archivo = new File("C:\\Users\\msi\\Desktop\\ITL\\Cursos de programacion\\Ficheros\\ficheroCreado.txt");
            if (archivo.createNewFile()) {//Si el archivo a sido creado, enviara un mensaje
                System.out.println("\n---------------------------\n"
                        + "El archivo se ha creado exitosamente");
            }
        } catch (IOException ex) { //serr + tabulador = System.err.println();
            System.err.println("NO SE PUDO CREAR EL ARCHIVO " + ex);
        }
    }

    private void creacionDirectorio() {
        directorio = new File("C:\\Users\\msi\\Desktop\\ITL\\Cursos de programacion\\Ficheros\\carpetaCreada");
        if (directorio.mkdir()) {//Si la carpeta es creada, enviara un mensaje
            System.out.println("\n---------------------------\n"
                    + "El directorio se ha creado exitosamente");
        } else {
            System.err.println("ERROR, NO SE HA PODIDO CREAR UN DIRECTORIO");
        }
    }

    private void escribirFichero() {
        archivo = new File("C:\\Users\\msi\\Desktop\\ITL\\Cursos de programacion\\Ficheros\\archivoEscrito.txt");
        try {
            //El constructor requiere un objeto tipo File, que es el cual vamos a escribir, se declara los bloques de Try Catch
            FileWriter escribir = new FileWriter(archivo);
            escribir.write("BUENOS DIAS FISH");
            //Para poder escribir en el siguiente interlineado, debemos escribir \r\n, ya que funciona como maquina de escrbir a la hora de hacer un retorno de carro
            escribir.write("\r\nMAS TEXTO");
            //Siempre que se va utilizar la clase FileWriter se debe cerrar el archivo cuando se termine de utilizar.
            escribir.close();
            añadirTextoFichero(archivo);

        } catch (IOException ex) {
            System.err.println("ERROR, EL ARCHIVO NO SE PUDO ESCRIBIR SOBRE EL ARCHIVO " + ex);
        }
    }

    private void añadirTextoFichero(File archivo) {
        //Cada que usemos FileWriter en el mismo archivo, se va sobreescribir todo el fichero y no va añadir nada, por eso se debe habilitar el Append en TRUE
        try {
            FileWriter escribir = new FileWriter(archivo, true);
            //Para poder escribir en el siguiente interlineado, debemos escribir \r\n, ya que funciona como maquina de escrbir a la hora de hacer un retorno de carro
            escribir.write("\r\nTEXTO AÑADIDO DESPUES");
            //Siempre que se va utilizar la clase FileWriter se debe cerrar el archivo cuando se termine de utilizar.
            escribir.close();
        } catch (IOException ex) {
            System.err.println("ERROR, EL ARCHIVO NO SE PUDO ESCRIBIR SOBRE EL ARCHIVO " + ex);
        }

    }

    private void leerFichero() {
        String cadena;
        archivo = new File("C:\\Users\\msi\\Desktop\\ITL\\Cursos de programacion\\Ficheros\\archivoLeido.txt");
        try {
            //Vinculamos primero la clase FileReader al fichero poniendolo de argumento en su constructor
            FileReader lector = new FileReader(archivo);
            //Despues vinculamos la clase BufferedReader al lector de archivos para poder interactuar con algunos metodos utiles de lectura.
            BufferedReader lectura = new BufferedReader(lector);

            //Se encapsula en un bloque Try Catch porque puede lanzar IO Exceptions
            cadena = lectura.readLine(); //Leera la primer linea que se encuentra en el fichero hasta que llegue a un null
            while (cadena != null) {//Si no hay vacios en nuestro archivos, entonces se tiene que seguir leyendo el archivo
                System.out.println("\n" + cadena);
                cadena = lectura.readLine(); //Volvera a leer la siguiente linea hasta encontrar con un vacio
            }

        } catch (FileNotFoundException ex) {
            System.err.println("ERROR, NO SE PUEDE ENCONTRAR EL ARCHIVO " + ex);
        } catch (IOException ex) {
            System.err.println("ERROR, NO SE PUEDE LEER EL ARCHIVO " + ex);
        }
    }

    private void escribirBinario() {
        Persona sujeto1 = new Persona("Fisher", 24);
        Persona sujeto2 = new Persona("Alberto", 21);
        Persona sujeto3 = new Persona("Zuñiga", 18);
        try {
            //Los archivos binarios pueden crearse con cualquier extension, en este caso se va crear en formato .BIN
            archivoBinario = new FileOutputStream("C:\\Users\\msi\\Desktop\\ITL\\Cursos de programacion\\Ficheros\\ficheroBinario.bin");
            //El constructor requiere un objeto tipo FileOutputStream, que es el cual vamos a escribir, se declara otra clausula CATCH
            ObjectOutputStream escritura = new ObjectOutputStream(archivoBinario);
            //El archivo binario se puede escribir sobre un monton de cosas, de todo tipo de datos.
            escritura.writeObject(sujeto1);
            escritura.writeObject(sujeto2);
            escritura.writeObject(sujeto3);
            //Siempre que se va utilizar la clase ObjectOutputStream se debe cerrar el archivo cuando se termine de utilizar.
            escritura.close();
        } catch (FileNotFoundException ex) {
            System.err.println("ERROR, EL ARCHIVO NO SE ENCUENTRA: " + ex);
        } catch (IOException ex) {
            System.err.println("ERROR, EL ARCHIVO NO SE PUEDE ESCRIBIR: " + ex);
        }
    }

    private void leerBinario() {
        Persona objetoPersona;
        try {
            //Vinculamos primero la clase FileInputStream al fichero poniendolo de argumento en su constructor
            FileInputStream ficheroBinario = new FileInputStream("C:\\Users\\msi\\Desktop\\ITL\\Cursos de programacion\\Ficheros\\ficheroBinario.bin");
            //El constructor requiere un objeto tipo FileInputStream, que es el cual vamos a leer, se declara otra clausula CATCH
            ObjectInputStream lectura = new ObjectInputStream(ficheroBinario);
            while (true) {//Recorremos por TODO el archivo binario 
                //readObject() devuelve un objeto, por lo tanto debemos hacer un CAST
                objetoPersona = (Persona) lectura.readObject();
                //Se imprime en consola los datos de la persona por objeto creado
                objetoPersona.mostrarDatos();
            }
        } catch (EOFException ex) { //CUANDO SE FINALICE DE LEER TODO EL ARCHIVO LANZARA UNA EXCEPCION
            return; //Finalizo de leer todo el archivo binario
        } catch (FileNotFoundException ex) {
            System.err.println("ERROR, EL ARCHIVO NO SE HA ENCONTRADO: " + ex);
        } catch (IOException ex) {
            System.err.println("ERROR, EL ARCHIVO NO SE HA PODIDO LEER: " + ex);
        } catch (ClassNotFoundException ex) {
            System.err.println("ERROR, LA CLASE NO SE ENCUENTRA: " + ex);
        }
    }

    private void añadirBinario() {
        Persona sujeto1 = new Persona("Knight", 22);
        Persona sujeto2 = new Persona("Gomez", 16);
        try {
            //Cada que usemos FileOutputStream en el mismo archivo, se va sobreescribir todo el fichero y no va añadir nada, por eso se debe habilitar el Append en TRUE
            archivoBinario = new FileOutputStream("C:\\Users\\msi\\Desktop\\ITL\\Cursos de programacion\\Ficheros\\ficheroBinario.bin",true);
            //Remplazamos la clase ObjectOutputStream con uno similar pero con la caracteristica de que no añade una cabecera cada que se escribe en archivo binarios
            AñadirContenidoBinario añadir = new AñadirContenidoBinario(archivoBinario);
            añadir.writeObject(sujeto1);
            añadir.writeObject(sujeto2);
            //Siempre que se va utilizar las clases heredadas de ObjectOutputStream se debe cerrar el archivo cuando se termine de utilizar.
            añadir.close();
        } catch (FileNotFoundException ex) {
            System.err.println("ERROR, EL ARCHIVO NO SE ENCUENTRA: " + ex);
        } catch (IOException ex) {
            System.err.println("ERROR, EL ARCHIVO NO SE PUEDE ESCRIBIR: " + ex);
        }
    }

}//CLASS
