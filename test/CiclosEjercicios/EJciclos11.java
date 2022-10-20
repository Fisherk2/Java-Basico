/*
Ejercicio 11: Pedir 10 numeros al usuario, y mostrar al final si se ha introducido algun negativo
 */
package CiclosEjercicios;

import javax.swing.JOptionPane;

public class EJciclos11 {

    public static void main(String[] args) {
        int numero;
        boolean hay_negativos = false; //Es el interruptor de falso o verdadero
        
        for (int i = 1; i <= 10; i++) {
            numero=Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero que quieras"));
            
            if (numero<0) {//Si el numero es negativo cambia el interruptor a verdad
                hay_negativos = true;
            }
            }
        if(hay_negativos==true){
            System.out.println("Hay un numero negativo");
        }else{
            System.out.println("No existe ningun numero negativo");
        }
        }
    }
    
