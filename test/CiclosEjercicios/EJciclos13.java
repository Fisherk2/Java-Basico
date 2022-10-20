/*
GENERA LOS PRIMEROS 100 NUMEROS PRIMOS
 */
package CiclosEjercicios;

public class EJciclos13 {

    public static void main(String[] args) {

        String resultados = "";
        int contador = 0;
        int numero = 1;
        while (contador<100) {

            if (numeroPrimo(numero)) { //Si nos devuelve un primo, se imprimira en la consola
                resultados += contador + ".- "+numero+"\n"; //Se van acumulando tanto el contador como el numero
                contador++;
            }
            numero++;
        }
        System.out.println("LOS 100 NUMEROS PRIMOS SON:\n"+resultados);
    }

    /**
     * Metodo reutilizable que calcula si el numero ingresado es primo o no.
     *
     * @param numero
     * @return esPrimo
     */
    public static boolean numeroPrimo(int numero) {

        boolean esPrimo = true;

        for (int i = 2; i < numero; i++) { //Se inicia en 2 porque 1 y 0 son primos

            if (numero % i == 0) {
                esPrimo = false; //Si es multiplo de un numero mayor a 1 y menor al ingresado, no es primo
            }
        }

        return esPrimo;
    }

}
