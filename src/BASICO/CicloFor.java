package ciclofor;

import java.util.Scanner;

public class CicloFor {

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {// for(iteracion ó inicializacion); (condicion); (Incremento ó decremento de la iteracion){ instrucciones}
            System.out.println(i);
        }
        
        for (int i = 9; i >= 1; i--) {
            System.out.println(i);
        }
        
        System.out.println("\nCuantos numeros quiere ver en pantalla?");
        int contador;//Variable de veces que el ciclo quiere que se repita.
        Scanner entradai = new Scanner(System.in);
        contador = entradai.nextInt();
        
        for (int i = 2; i <= contador; i+=2) {//Salen solo numeros pares.
            System.out.println(i);
        }
        
        for (int i = 0,n=5; i < 5; i++,n+=5) { //Se puede agregar mas variables y condiciones al ciclo FOR
            System.out.println(i);// 0,1,2,3,4
            System.out.println(n);//5,10,15,20,25
        }
    }
}
