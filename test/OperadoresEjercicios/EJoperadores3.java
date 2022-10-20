/*
 Ejercicio 3: La calificacion final de un estudiante de informatica se calcula con vase a las calificaciones
de cuatro aspectos de su rendimiento academico: participacion, primer examen parcial, segundo examen parcial 
y examen final. Sabiendo que las calificaciones anteriores entran a la calificacion final con ponderaciones del
10%, 25%, y 40%, Hacer un programa que calcule e imprima la calificacion final obtenida por un estudiante.
(Con JoptionPane)
 */
package OperadoresEjercicios;
//Participacion = 10%
//Primer parcial = 25%
//Segundo parcial = 25%
//Final parcial = 40%
import javax.swing.JOptionPane;

public class EJoperadores3 {

    public static void main(String[] args) {
        double participacion,primer,segundo,fin, promedio; //Declarar las variables de las notas
        participacion = Double.parseDouble(JOptionPane.showInputDialog("Participacion"));
        primer = Double.parseDouble(JOptionPane.showInputDialog("Primer parcial"));
        segundo = Double.parseDouble(JOptionPane.showInputDialog("Segundo parcial"));
        fin = Double.parseDouble(JOptionPane.showInputDialog("Tercer parcial"));
        
        participacion *= 0.1;
        primer *= 0.25;
        segundo *= 0.25;
        fin*=0.40;
        promedio = participacion+primer+segundo+fin;
        
        JOptionPane.showMessageDialog(null, promedio);
    }
    
}
