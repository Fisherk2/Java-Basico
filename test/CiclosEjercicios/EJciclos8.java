/*
 Ejercicio 8: Dadas las edades y alturas de 5 alumnos, mostrar la edad y la estatura media, la cantidad de
alumnos mayores de 18 años, y la cantidad de alumnos que miden mas de 1.75
 */
package CiclosEjercicios;

import javax.swing.JOptionPane;

public class EJciclos8 {

    public static void main(String[] args) {
        int edad,sumaedad=0,contadorA18=0,contador175=0;
        float estatura,sumaAltura=0,mediaedad,mediaestatura;
        
        for (int i = 1; i <= 5; i++) {
            edad = Integer.parseInt(JOptionPane.showInputDialog("Alumno numero "+i+":\n¿Cual es su edad?"));
            estatura = Float.parseFloat(JOptionPane.showInputDialog("Alumno numero "+i+":\n¿Cual es su estatura? (en metros)"));
            
            sumaedad+=edad; //Acumulacion de edades
            sumaAltura+=estatura; //Acumulacion de estaturas
            
            if (edad>18) {
                contadorA18++;//Cuenta el numero de mayores de edad
            }
            if (estatura>1.75) {
                contador175++;//Cuenta el numero de mayores de 1.75
            }
        }
        mediaedad = (float) sumaedad/5; //convertimos los valores a float
        mediaestatura = (float) sumaAltura/5;
        
        System.out.println("La edad media es :"+mediaedad
                +"\nLa estatura media es: "+mediaestatura
                +"\nNumero de alumnos mayores de 18 es: "+contadorA18
                +"\nNumero de alumnos que miden mas de 1.75 son: "+contador175);
    }
    
}
