package CiclosEjercicios;

//Determinar si el numero ingresado es primo
import java.util.Scanner;

public class EJciclos12 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        int numero = entrada.nextInt();

        boolean esPrimo = true;

        for (int i = 2; i < numero; i++) { //Se inicia en 2 porque 1 y 0 son primos

            if (numero % i == 0) {
                esPrimo = false; //Si es multiplo de un numero mayor a 1 y menor al ingresado, no es primo
                System.out.println("Es multiplo de "+i);
            }
        }
        if (esPrimo) {
            System.out.println("ES PRIMO");
        } else {
            System.out.println("POR LO TANTO NO ES PRIMO");

        }

    }

}
