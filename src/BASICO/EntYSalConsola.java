package BASICO;

import java.util.Scanner;//Se importa de la libreria de java para realizar el Scanner

public class EntYSalConsola {

    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in); //Un Scanner puede almacenar muchos tipos primitivos
        //Funcion Scanner es para realizar una entrada de valores a la consola para guardarlos

        int numero;//Se crea una variable para almacenar el valor de la entrada
        System.out.println("Digite tu numero");
        numero = entrada.nextInt();//Estara guardando el valor int dentro de la variable que creamos para almacenar
        
        float numero1;
        System.out.println("Digite tu numero con decimal");//En algunos dispositivos, el punto no sirve de entrada para los decimales, se pone una coma
        numero1 = entrada.nextFloat();//Cambiara el ".next" dependiendo del tipo primitivo
        
        double numero2;
        System.out.println("Digite tu numero con muchos decimales");
        numero2 = entrada.nextDouble();//Cambiara el ".next" dependiendo del tipo primitivo
        
        char caracter;
        System.out.println("Digite un caracter");
        caracter = entrada.next().charAt(0);//"charAt" te va guardar el primer caracter o segundo dependiendo del numero dentro del parentesis (solo se usa .next)
        
        Scanner entrada1 = new Scanner (System.in); //Debes crear un Scanner si hay un tipo no primitivo
        String cadena;
        System.out.println("Digite una cadena");
        cadena = entrada1.nextLine();
        /*Las cadenas se guardan con ".next" y ".nextline"
                   ".nextLine" sirve para almacenar con espacio mientras que el ".next" termina antes de un espacio
                 */
        
        System.out.println("El primer numero que usted tecleo es: "+numero);
        System.out.println("El segundo numero que usted tecleo fue: "+numero1);
        System.out.println("El tercer numero que usted tecleo fue: "+numero2);
        System.out.println("La cadena que uste tecleo es: "+cadena);
        System.out.println("El caracter que se almaceno fue: "+caracter);

    }
    
}
