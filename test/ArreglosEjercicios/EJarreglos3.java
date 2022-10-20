/*
 Ejercicio 3: Leer por teclado dos tablas de 10 numeros enteros y mezclarlas en una tercera de la forma: 
1° de A
1° de B
2° de A
2° de B.....etc.
 */
package ArreglosEjercicios;

import java.util.Scanner;

public class EJarreglos3 {
  /*
    Tenemos que crear dos arreglos para guardar los espacios que queden asi 1°A-1°B-2°A-2°B....
    por lo tanto quedaria asi:
    A[ ]= 1,3,5,7,9... *Estos numeros son las posiciones de los numeros enteros que vamos a introducir.
    B[ ]=2,4,6,8,10.....
    C[ ]= A[1], B[2], A[3], B[4]....
    */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int A[],B[],C[];
        
        A=new int [10]; //Arreglo A con 10 elementos 
        B= new int[10];//Arreglo B con 10 elementos
        C=new int [20];//Arreglo C con 20 elementos que almacenara los arreglos A y B.
        
        //Pedimos los valores de A
        System.out.println("Digitando el valor de A");
        for (int i = 0; i < 10; i++) {
            System.out.print((i+1)+".- Digite un numero para A: ");
            A[i]=entrada.nextInt(); //Se almacenan los valores en los espacios
        }
        //Pedimos los valores de B
        System.out.println("\nDigitando el valor de B");
        for (int i = 0; i < 10; i++) {
            System.out.print((i+1)+".- Digite un numero para B: ");
            B[i]=entrada.nextInt(); //Se almacenan los valores en los espacios
        }
        
        //Mezclar los dos arreglos en el C
        //Usamos contador i para A y B ; j para C
        int j=0;
        for (int i = 0; i < 10; i++) {
            C[j]=A[i]; //1°A ; se almacena un valor de A en el arreglo de C
            j++; //Se suma uno para que el arreglo de B se situe despues de 1°A
            C[j]=B[i];//1°B ; se almacena un valor de B en el arreglo de C
            j++; //Contador para el siguiente ciclo
        }
        //Imprimimos los resultados del tercer arreglo
        System.out.println("\nEl tercer arreglo es: ");
        for (int i = 0; i < 20; i++) {
            System.out.print(C[i]+" ");
        }
        System.out.println("");
    }
    
}
