/*
Ejercicio 1: Hacer un programa que lea un numero entero y muestre si el numero es multiplo de 10
 */
package CondicionalesEjercicios;

import javax.swing.JOptionPane;

public class EJcondicionales1 {

    public static void main(String[] args) {
        int numero;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));

        if (numero%10 == 0) { //Si da 0, es multiplo de 10, si no, es lo contrario.
            JOptionPane.showMessageDialog(null, "Tu numero "+numero+" es multiplo de 10");

        } else {
            JOptionPane.showMessageDialog(null, "Tu numero "+numero+" no es divisible entre 10");
        }
    }
    
}
