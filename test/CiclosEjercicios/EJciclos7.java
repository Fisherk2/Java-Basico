/*
 Ejercicio 7: Pedir 10 numeros. Mostrar la media de los numeros positivos, la media de los numeros negativos
y la cantidad de ceros.
 */
package CiclosEjercicios;

import javax.swing.JOptionPane;

public class EJciclos7 {

    public static void main(String[] args) {
        int numero, suma_pos = 0, contadorS = 0, suma_neg = 0, contadorR = 0, contador0 = 0;
        float mediaPos, mediaNeg;

        for (int i = 1; i <= 10; i++) {
            numero = Integer.parseInt(JOptionPane.showInputDialog("Inserte los numeros"));

            if (numero == 0) {
                contador0++;//Si el numero es cero se aumenta el contador de ceros
            } else if (numero > 0) {//Si el numero es positivo, se acumula el contador y se hace la operacion de la suma
                suma_pos += numero; //Se hace la operacion para sacar la sumatoria de positivos
                contadorS++;//Se aumenta el contador de positivos
            } else {
                suma_neg += numero;//Se hace la operacion para sacar la sumatoria de negativos
                contadorR++;//Se aumenta el contador de negativos
            }
        }

        if (contadorS == 0) {//Si no se ingresaron numeros positivos
            System.out.println("No se puede sacar la media de los positivos");
        } else {
            mediaPos = (float) suma_pos / contadorS;//Se saca la media de positivos y se convierte todo a float
            System.out.println("La media de numeros positivos es de: " + mediaPos);
        }

        if (contadorR == 0) {//Si no se ingresaron numeros negativos
            System.out.println("No se puede sacar la media de los negativos");
        } else {
            mediaNeg = (float)suma_neg / contadorR;//Se saca la media de los negativos y se convierte todo a float
            System.out.println("La media de numeros negativos es de: " + mediaNeg);
        }
        System.out.println("La cantidad de ceros es: "+contador0);
    }

}
