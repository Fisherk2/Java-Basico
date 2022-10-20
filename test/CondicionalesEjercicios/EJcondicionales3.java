/*
 Ejercicio 3: Un obrero necesita calcular su salario semanal, el cual se obtiene de la siguiente manera;:
-Si trabaja 40 horas o menos se le paga $16 por hora.
-Si trabaja mas de 40 horas se le paga $16 por cada una de las primeras 40 horas y $20 por cada hora extra.
 */
package CondicionalesEjercicios;

import javax.swing.JOptionPane;

public class EJcondicionales3 {

    public static void main(String[] args) {
        int horas,pago;
        horas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de horas del empleado"));
        
        if (horas<=40) {
            pago=horas*16;
        } else {
            pago=(40*16)+((horas-40)*20);
        }
        JOptionPane.showMessageDialog(null, "Su pago por haber estado "+horas+" horas es de "+pago);
    }
    
}
