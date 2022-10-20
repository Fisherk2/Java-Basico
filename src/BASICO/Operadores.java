package operadores;

import java.util.Scanner;

public class Operadores {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float numeroA, numeroB, suma, resta, mult, div, resto;

        System.out.println("Digite dos numeros");
        numeroA = entrada.nextFloat();
        numeroB = entrada.nextFloat();

        suma = numeroA + numeroB;//Adicion
        resta = numeroA - numeroB;//Sustraccion
        mult = numeroA * numeroB;//Producto
        div = numeroA / numeroB;//Cociente
        resto = numeroA % numeroB; //MOD, es el resultado del residuo entre esa division, se una %

        System.out.println("La suma es: " + suma);
        System.out.println("La resta es: " + resta);
        System.out.println("El producto es: " + mult);
        System.out.println("La division es: " + div);
        System.out.println("El residuo de la division es: " + resto);

        System.out.println("");//Es para crear un salto de linea (\n)

        int valorA = 5, valorB = 2;
        System.out.println("Antes el valor de A era: "+valorA);
        valorA = valorB;//El valor de B se va almacenar en la variable de A
        System.out.println("Ahora el valor de A es: " + valorA);
    }

}
