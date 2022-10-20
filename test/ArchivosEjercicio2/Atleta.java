package ArchivosEjercicio2;

import java.io.Serializable;

/**
 *Clase con flujo de bytes que guarda los registros de los atletas
 * @author Fisher
 */
public class Atleta implements Serializable {
    private String nombre;
    private int edad,estatura;
    private float peso;

    public Atleta(String nombre, int edad, int estatura, float peso) {
        this.nombre = nombre;
        this.edad = edad;
        this.estatura = estatura;
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public int getEstatura() {
        return estatura;
    }

    public float getPeso() {
        return peso;
    }

    
}
