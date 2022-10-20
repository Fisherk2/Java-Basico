package OperadoresEjercicios;
//Entrada con SOUT

import java.util.Scanner;


public class Ejoperadores5 {

    public static void main(String[] args) {
        Scanner E = new Scanner(System.in);
        float A,B,C,suma,promedio;
        //Se guardan las notas
        System.out.println("Ingrese las 3 calificaciones");
        A = E.nextFloat();
        B = E.nextFloat();
        C = E.nextFloat();
        //Se promedia las notas
        suma= A+B+C;
        promedio = suma/3;
        
        System.out.println("\nLa calificacion es: "+promedio);
        //El comando de \n sirve para dar un salto de linea (un ENTER)

    }
    
}
