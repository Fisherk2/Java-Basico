/*
Ejercicio 7: Leer 10 enteros en una tabla. Guardar en otra tabla los elementos pares de la primera, 
y a continuacion los elementos impares.
 */
package ArreglosEjercicios;

import java.util.Scanner;

public class EJarreglos7 {

    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
        int tablaA[] = new int[10]; //Creamos la tabla A
        int contadorPares = 0, contadorImpares = 0;

        //Almacenamos los valores de la tabla A
        System.out.println("Introduzca los valores en la tabla A");
        for (int i = 0; i < 10; i++) {
            System.out.print("Introduzca valor " + (i + 1) + ": ");
            tablaA[i] = entry.nextInt();
            //Determinar cuantos numeros pares e impares vamos a generar
            if (tablaA[i] % 2 == 0) { //Si el valor introducido es par, se añadira a un contador de pares
                contadorPares++;
            } else { //Si no, se añadira a un contador de impares
                contadorImpares++;
            }
        }
        //Creamos las tablas B y C
        int tablaB[] = new int[contadorPares]; //Tabla B para pares
        int tablaC[] = new int[contadorImpares];//Tabla C para impares

        //Almacenamos los valores en las tablas de B y C
        contadorPares = 0; //Reiniciamos los contadores para el proposito del For
        contadorImpares = 0;

        for (int i = 0; i < 10; i++) { //El 10 es el numero de valores que se ingresaron en la tabla A
            if (tablaA[i] % 2 == 0) { //Si el valor es par, se almacena en la tabla B
                tablaB[contadorPares] = tablaA[i];//Se almacena aqui
                contadorPares++;//Se prepara el siguiente espacion en caso de haber otro par cuando se repita el ciclo
            } else {//Si el valor es impar, se almacena en la tabla C
                tablaC[contadorImpares] = tablaA[i];//Se almacena aqui
                contadorImpares++;//Se prepara el siguiente espacion en caso de haber otro impar que se repita el ciclo
            }
        }
        System.out.println("\nTabla B (valores PAR)");
        for (int i = 0; i < contadorPares; i++) {//Se uso el numero de contador de pares para saber cuando se termina las impresiones
            System.out.print(tablaB[i]+" - ");
        }
        System.out.println("");//Es para dar un salto de linea
        System.out.println("\nTabla C (Valores IMPAR)");//Se uso el numero de contador de impares para saber cuando se termina las impresiones
        for (int i = 0; i < contadorImpares; i++) {
            System.out.print(tablaC[i]+" - ");
        }
        System.out.println("");//Es para dar un salto de linea
    }
}
