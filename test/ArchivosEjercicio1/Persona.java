package ArchivosEjercicio1;

/**
 * CLASE QUE ALMACENA TODA LA INFORMACION DEL CONTACTO
 *
 * @author Fisher
 */
public class Persona {

    private String nombre, correo, celular;

    public Persona(String nombre, String correo, String celular) {
        this.nombre = nombre;
        this.correo = correo;
        this.celular = celular;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public String getCelular() {
        return celular;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

}
