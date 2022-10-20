/*
Leer un numero y mostrar su cuadrado, repetir el proceso hasya que se introduzca un numero negativo.
 */
package CiclosEjercicios;

import javax.swing.JOptionPane;

public class EJciclos1 {

    public static void main(String[] args) {
        int numero, cuadrado;
        
        numero=Integer.parseInt(JOptionPane.showInputDialog("Inserte el numero que desea elevar al cuadrado (NO admite numeros negativos)"));
        
        while (numero>=0) {// Mientras el numero que ingresaste sea positivo o cero, seguira preguntando por valores hasta que ingreses un numero menor a cero        
            cuadrado= (int)Math.pow(numero, 2);//Antepones int para que la clase Math agarre los valores int de las variables y guardarlo en ese tipo primitivo
            
            JOptionPane.showMessageDialog(null, "El numero "+numero+" al cuadrado es "+cuadrado);
            
            numero=Integer.parseInt(JOptionPane.showInputDialog("Inserte otro numero que desea elevar al cuadrado (NO admite numeros negativos)"));
        }
        JOptionPane.showMessageDialog(null, "ERROR\n"+"Has ingresado un numero negativo ("+numero+")");
    }
}
