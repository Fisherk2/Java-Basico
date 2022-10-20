package ArchivosEjercicio2;

import java.io.File;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

/**
 * SUBCLASE QUE USAREMOS PARA PODER AÑADIR OBJETOS SIN LA CREACION DE UNA
 * CABECERA
 *
 * @author Fisher
 */
public class AñadirBinario extends ObjectOutputStream {

    public AñadirBinario(OutputStream out) throws IOException {
        super(out);
    }

    public AñadirBinario() throws IOException, SecurityException {
    }

    @Override
    public void writeStreamHeader() {
        File archivo = new File("C:\\Users\\msi\\Desktop\\ITL\\Cursos de programacion\\Ficheros\\registroAtletas.bin");

        if (archivo.length() == 0) {
            try {
                //SI EL ARCHIVO ESTA VACIO, DEBE ESCRIBIR UNA CABECERA
                super.writeStreamHeader();//USAMOS EL METODO COMPLETO DE LA SUPERCLASE PARA ESCRIBIR LA CABECERA
            } catch (IOException ex) {
                System.err.println("ERROR, NO SE PUEDE ESCRIBIR SOBRE EL ARCHIVO "+ex);
            }
        } else {
            try {
                reset();//ESCRIBIMOS EL OBJETO SOBRE EL FICHERO SIN LA CABECERA
            } catch (IOException ex) {
                System.err.println("ERROR, NO SE PUEDE ESCRIBIR SOBRE EL ARCHIVO "+ex);
            }
        }
    }

}
