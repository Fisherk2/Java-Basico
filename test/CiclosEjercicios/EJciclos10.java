/*
Ejercicio 10: Dadas 6 notas, escribir la cantidad de alumnos aprobados, condicionados (=4) y suspensos
 */
package CiclosEjercicios;

import javax.swing.JOptionPane;

public class EJciclos10 {

    public static void main(String[] args) {
        int alumnosAP=0,alumnosCON=0,alumnosSUS=0;
        float notas;
        
        for (int i = 1; i <= 6; i++) {
            
            do {    //Validar nuestros numeros del 0-10, si la condicion del ciclo se cumple, se vuelve a repetir la pregunta.            
            notas = Float.parseFloat(JOptionPane.showInputDialog("Alumno n° "+i+"\n¿Cual es su calificacion? (0-10)"));
            } while (notas<0 || notas>10);//Si el usuario ingresa un numero negativo e ingresa uno mayor a 10, vuelve a repetir el ciclo
            
            if (notas==4) {//Alumnos condicionados
                alumnosCON++;
            }
            if (notas<4) {//Alumnos suspendidos
                alumnosSUS++;
            }
            if (notas>4) {//Alumnos aprobados
                alumnosAP++;
            }
        }
        
        System.out.println("NUMERO DE ALUMNOS APROBADOS: "+alumnosAP);
        System.out.println("NUMERO DE ALUMNOS REPROBADOS: "+alumnosSUS);
        System.out.println("NUMERO DE ALUMNOS CONDICIONADOS: "+alumnosCON);
        
    }
    
}
