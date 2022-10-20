/*
 Ejercicio 6: Construir un programa que simule el funcionamiento de una calculadora que puede realizar las
cuatro operaciones aritmeticas basicas (Sumas, Restas, Producto y division) con valores numericos enteros.
El usuario debe especificar la operacion con el primer caracter del primer parametro de la linea de comandos:
S ó s: Suma
R ó r: Resta
P ó p ó M ó m: Producto
D ó d: Division
 */
package CondicionalesEjercicios;

import javax.swing.JOptionPane;

public class EJcondicionales6 {

    public static void main(String[] args) {
        int A,B,suma,resta,producto,division;
        A=Integer.parseInt(JOptionPane.showInputDialog("Primer valor"));
        B=Integer.parseInt(JOptionPane.showInputDialog("Segundo valor"));
        
        char operacion;
        operacion = JOptionPane.showInputDialog("¿Que operacion quiere realizar?").charAt(0);
        
        switch (operacion){
            case 's': //Si se teclea estos dos casos, se realiza las instrucciones
            case 'S': suma=A+B;
                      JOptionPane.showMessageDialog(null, "La suma es: "+suma);
                      break; //Rompe el proceso saliendose del switch
            case 'r':
            case 'R':resta=A-B;
                      JOptionPane.showMessageDialog(null, "La resta es: "+resta);
                      break;
            case 'P':
            case 'p':
            case 'M':
            case 'm':producto=A*B;
                      JOptionPane.showMessageDialog(null, "El producto es: "+producto);
                      break;
            case 'D':
            case 'd':division=A/B;
                      JOptionPane.showMessageDialog(null, "La division es: "+division);
                      break;
            default:JOptionPane.showMessageDialog(null, "ERROR, ninguna operacion a sido declarada");

        }
    }
    
}
