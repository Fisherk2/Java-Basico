/*
Ejercicio 4: Pedir tres numeros y mostrarlos ordenados de mayor a menor.
 */
package CondicionalesEjercicios;

import javax.swing.JOptionPane;

public class EJcondicionales4 {

    public static void main(String[] args) {
        int A,B,C;
        
        A=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor A"));
        B=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor B"));
        C=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor C"));
        
        if ((A>B) && (B>C)) {
           JOptionPane.showMessageDialog(null, "Orden: "+A+" - "+B+" - "+C);
        } 
        //Se ramifica ya que el else tiene otra condicion if
        else if ((A>C) && (C>B)) {
           JOptionPane.showMessageDialog(null, "Orden: "+A+" - "+C+" - "+B);
           
        } else if ((B>A) && (A>C)) {
           JOptionPane.showMessageDialog(null, "Orden: "+B+" - "+A+" - "+C);
            
        } else if ((B>C) && (C>A)) {
           JOptionPane.showMessageDialog(null, "Orden: "+B+" - "+C+" - "+A);
            
        } else if ((C>A) && (A>B)) {
           JOptionPane.showMessageDialog(null, "Orden: "+C+" - "+A+" - "+B);
            
        } else{
           JOptionPane.showMessageDialog(null, "Orden: "+C+" - "+B+" - "+A);
            
        }

    }
}
    

