/*
 Leer numeros hasta que se introduzcan un 0. Para cada uno indicar si es par o impar
 */
package CiclosEjercicios;

import javax.swing.JOptionPane;

public class EJciclos2 {

    public static void main(String[] args) {
        int numero;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor que desea saber\n" + "Si desea terminar el proceso, teclee cero"));

        while (numero != 0) { //Mientras no cero, se va saber si es par o impar.
            if (numero % 2 == 0) {//Si es par, imprime el resultado como tal
                System.out.println("El numero " + numero + " es par");
            } else {//Si no, el resultado sera impar.
                System.out.println("El numero " + numero + " es impar");
            }
            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro valor que desea saber\n" + "Si desea terminar el proceso, teclee cero"));
        }
    }
}
