/*
Ejercicio 2: Hacer un programa que lea un caracter por teclado y compruebe si es una letra mayuscula.
 */
package CondicionalesEjercicios;

import javax.swing.JOptionPane;

public class EJcondicionales2 {

    public static void main(String[] args) {
        char letra;
        letra = JOptionPane.showInputDialog("Ingresa una letra").charAt(0); 
        //El cero es la posicion del String que se va capturar con forma char
        
        if (Character.isUpperCase(letra)) { //El metodo .isUpperCase es por si nuestra letra es mayuscula devolviendote un valor Boolean.
            JOptionPane.showMessageDialog(null, "La letra "+letra+" es mayuscula");
            
        } else {
            JOptionPane.showMessageDialog(null, "Tu letra "+letra+" es minuscula");
        }
        
    }
    
}
