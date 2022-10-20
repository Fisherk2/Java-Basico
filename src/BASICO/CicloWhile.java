package ciclowhile;

import java.util.Scanner;

public class CicloWhile {

    public static void main(String[] args) {
        int i=1,j=9,k=2; //Se comienza el contador de ciclos (ó iterador)
        //Va sumando de forma ascendente hasta el 10
        while (i<=10) { //while (condicion) {instrucciones}        
            System.out.println(i);//Va imprimiendo los numeros que pasan por el ciclo
            i++; //Es lo mismo que i=1+1 ó i+=1
        }
        //Va restando de forma descendente hasta el 1
        while (j<=1) {            
            System.out.println(j);//Va imprimiendo los numeros que pasan por el ciclo
            j--; //Es lo mismo que j=1-1 ó j-=1            
        }
        int contador; //Las veces que el usuario quiere que se repita el ciclo
        
        System.out.println("\n¿Cuantos numeros quiere en pantalla?");
        Scanner entradak = new Scanner(System.in);
        contador=entradak.nextInt();
        
        while (k<=contador) {
            System.out.println(k);
            k+=2;//Avanza de dos en dos k=k+2
        }
    }
    
}
