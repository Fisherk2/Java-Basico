package OperadoresEjercicios;
//Entrada con JOption

import javax.swing.JOptionPane;

public class EJoperadores1 {

    public static void main(String[] args) {
       double A,B,C,suma,promedio; //Puedes meter todas las variables que quieras en un solo tipo primitivo
       A = Double.parseDouble(JOptionPane.showInputDialog("Ingrese calificacion A"));
       B = Double.parseDouble(JOptionPane.showInputDialog("Ingrese calificacion B"));
       C = Double.parseDouble(JOptionPane.showInputDialog("Ingrese calificacion C"));
       
       suma = A + B+ C;
       promedio = suma/3;

       JOptionPane.showMessageDialog(null,"Tu promedio es de: "+promedio);
    }
    
}
