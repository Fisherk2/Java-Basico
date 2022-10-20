package ciclodowhile;

import java.util.Scanner;

public class CicloDoWhile {

    public static void main(String[] args) {
        int i = 1, j = 9, k = 1;

        do {//do{instruccion} while(condicion);
            //Ejecuta una instruccion antes de hacer el ciclo, y si cumple, vuelve a repetir el ciclo hasta que la condicion sea falsa (Entra por lo menos una vez en el ciclo)               
            System.out.println(i);
            i++;
        } while (i <= 10); //Se termina el proceso si se no se cumple esta condicion

        do {
            System.out.println(j);
            j--;
        } while (j >= 1);

        int contador;//Es la variable que va determinar cuantos ciclos se va repetir.
        System.out.println("\n¿Cuantos numeros quiere ver en pantalla?");
        Scanner entradak = new Scanner(System.in);
        contador = entradak.nextInt();

        do {
            System.out.println(k);
            k++;
        } while (k <= contador);//Si el contador llega a ser igual o menor que el contador del ciclo (k), se termina el proceso.

    }

}
