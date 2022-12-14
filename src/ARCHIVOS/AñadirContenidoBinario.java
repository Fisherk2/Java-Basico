package ARCHIVOS;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

/**
 * Clase que hereda de ObjectOutputStream para poder eliminar la cabecera cada que se vuelve escribir un fichero binario
 * @author Fisher
 */
public class A├▒adirContenidoBinario extends ObjectOutputStream{

    public A├▒adirContenidoBinario(OutputStream out) throws IOException {
        super(out);
    }

    public A├▒adirContenidoBinario() throws IOException, SecurityException {
    }
    
    @Override 
    //Este es el metodo que crea las cabecera de inicio cada que se crea un objeto de tipo ObjectOutputStream
    public void writeStreamHeader() throws IOException{
        reset(); //Con esto eliminamos la cabecera
    }
    
}
