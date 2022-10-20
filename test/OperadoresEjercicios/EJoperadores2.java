/*
Ejercicio 2: Guillermo tiene N dolares
Luis tiene la mitad de lo que posee Guilermo.
Juan tiene la mitad de lo que poseen Luis y Guillermo juntos.
Hacer un programa que calcule e imprima la cantidad de dinero
que tienen entre los tres
 */
package OperadoresEjercicios;

import java.util.Scanner;

public class EJoperadores2 {
// L=1/2G
//J= (L+G)/2
    public static void main(String[] args) {
        Scanner E = new Scanner (System.in);
        float G,L,J,total; //Variables de Guillermo, Luis y Juan, con el resultado
        
        System.out.println("Ingrese el dinero que tiene Guillermo");
        G = E.nextFloat();
        L= G/2;
        J= (L+G)/2;
        total= J+G+L;
        
        System.out.println("\n40La cantidad de dinero que tienen Luis, Guillermo y Juan es: "+total);
                
    }
    
}
