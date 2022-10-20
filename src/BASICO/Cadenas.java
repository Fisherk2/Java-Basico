/*
CADENAS DE CARACTERES
 */
package BASICO;

public class Cadenas {

    public static void main(String[] args) {
        //String permite declarar variables para alojar cadenas de caracteres (Texto)
        String nombre = "fisHeR";
        String strNumero, abreviacion;
        int numero, numChar1, numChar2;

        //variable.equals compara cadenas en ves de usar == (nombre=="Fisher")
        if (nombre.equals("Fisher")) {
            System.out.println("Su nombre es " + nombre);
        }
        if (nombre.equalsIgnoreCase("Fisher")) { //Compara cadenas sin importar si es en mayusculas o minusculas
            nombre = "Fisher"; //Corregimos la falta de ortografia
            System.out.println("Su nombre es: "+nombre);
        } else {
            System.out.println("Su nombre es incorrecto");
        }

        //Podemos convertir cualquier dato primitivo en Cadena con el metodo .valueOf
        strNumero = String.valueOf(33);
        //Al igual se puede convertir un String u otro dato primitivo a cualquier dato primitivo con el metodo .parse(Dato primitivo)
        numero = Integer.parseInt(strNumero) + 3; //36

        System.out.println("Impresion de valor String: " + strNumero);
        System.out.println("Impresion de valor entero: " + numero);

        //Se puede medir el numero de caracteres y espacios de una cadena con el metodo .length
        numChar1 = nombre.length(); //6
        numChar2 = strNumero.length();//2

        System.out.println("Numero de espacios utilizados en el nombre de " + nombre + ": " + numChar1);
        System.out.println("Numero de espacios utilizados en el numero " + strNumero + ": " + numChar2);

        //Puedes imprimir el numero de espacios y caracteres en un rango especifico de posiciones con el metodo . substring(desde,hasta)
        abreviacion = nombre.substring(0, 4);//Fish
        System.out.println("El nombre " + nombre + " estara abreviado asi: " + abreviacion);

    }

}
