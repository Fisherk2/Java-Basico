package BASICO;

public class Constantes {

    public static void main(String[] args) {
        
        //Las constantes siempre iran en mayusculas
        
        final int NUMERO = 10; //"final" es para declarar la constante fija que no puede cambiar en todo el programa
        
         NUMERO = 15; 
        /*Mientras no este la palabra final, el valor de la variable puede cambiar si el programa le asigna 
                        otro valor
                     */
        
        System.out.println(NUMERO);
    }
    
}
