/*
 Ejercicio 6: Diseñar un programa que muestre el producto de los 10 primeros numeros impares.
 */
package CiclosEjercicios;

public class EJciclos6 {

    public static void main(String[] args) {
        long producto = 1;
        
        for (int i = 1; i <= 20; i+=2) {//Se eligio hasta el 20 porque ahi terminan los primeros diez numeros impares, al igual, se empieza desde el uno porque es el primer numero impar.
            producto*=i; //Se almacenan los productos de los numeros impares
        }
        System.out.println("El resultado es: "+producto);
    }
    
}
