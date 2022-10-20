/*
Ejercicio 4: Construir un programa que, dado un numero total de horas, devuelve el numero de semanas,
dias y horas equivalentes. Por ejemplo, dado un total de 1000 horas debe mostrar 5 semanas, 6 dias y 16 horas.
(Entrada Sout)
 */
package OperadoresEjercicios;

import java.util.Scanner;

public class EJoperadores4 {
/* 
Dia = 24 horas
Semanas = 7 dias o 168 horas
 */
    public static void main(String[] args) {
        Scanner entry1 = new Scanner(System.in);
        int horas, dias, semana,htotales;
        System.out.println("Ingrese el numero de horas que desea saber");
        horas = entry1.nextInt();
        
        semana=horas/168; //24*7= 168
        dias= horas%168/24; //Se saca el residuo de la division del numero de horas por semana y se divide entre 24
        htotales = horas%24; //Se saca el residuo de la division de horas del dia
        
        System.out.println("El numero de horas "+horas+" da como resultado:");
        System.out.println("\n"+semana+" Semanas");
        System.out.println(dias+" Dias");
        System.out.println(htotales+" Horas");
        
    }
    
}
