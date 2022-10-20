/*
 Ejercicio 5: Pedir el dia, mes y año de una fecha e indicar si la fecha es correcta
Suponiendo que todos los meses son de 30 dias.
 */
package CondicionalesEjercicios;

import javax.swing.JOptionPane;

public class EJcondicionales5 {

    public static void main(String[] args) {
        int dia, mes, año;

        dia = Integer.parseInt(JOptionPane.showInputDialog("Dia"));
        mes = Integer.parseInt(JOptionPane.showInputDialog("Mes"));
        año = Integer.parseInt(JOptionPane.showInputDialog("Año"));

        if ((dia >= 1) && (dia <= 30)) { //Si se cumple los requisitos del dia, mes y año, arrojara un resultado positivo, si incumple uno o mas de los tres, te saldra un mensaje de error.
            if ((mes >= 1) && (mes <= 12)) {
                if (año != 0) {
                    JOptionPane.showMessageDialog(null, "Dia: " + dia + " Mes: " + mes + " Año: " + año); //Todos los if se cumplen

                } else {
                    JOptionPane.showMessageDialog(null, "Su fecha es incorrecta ya que " + año + " no existe ese año");//Si año falla
                }
            } else {
                JOptionPane.showMessageDialog(null, "Su fecha es incorrecta ya que " + mes + " no es un valor correcto del mes");//Si mes falla
            }
        } else {
            JOptionPane.showMessageDialog(null, "Su fecha es incorrecta ya que " + dia + " no es un valor correcto del dia");//Si dia falla
        }
    }
}
