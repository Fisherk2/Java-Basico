package ARCHIVOS;

import java.io.Serializable;

/**
 * Clase que se puede transportar en un flujo de bytes (ESTA SERIALIZADO)
 *
 * @author Fisher
 */
public class Persona implements Serializable {//Para que haya un flujo de bytes sobre el objeto, este se debe serializar

    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    public void mostrarDatos(){
        System.out.println("---------------------"
                +"\nSUJETO: "
                +"\nNOMBRE: "+nombre
                +"\nEDAD: "+edad);
    }

}
