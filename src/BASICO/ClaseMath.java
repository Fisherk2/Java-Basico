package BASICO;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Random;

/**
 * La clase Math contiene metodos estaticos para realizar operacion, eso quiere
 * decir que no se necesita instanciar con un nuevo objeto para usar todos su
 * metodos. Ademas, la clase Math tiene una referencia a las dos constantes mas
 * utilizadas en matematicas con una precision de 15 decimales, tales como PI y
 * el numero de EULER. Ademas veremos otras clases y metodos que tambien nos
 * servira en las matematicas.
 *
 * @author Fisher
 */
public class ClaseMath {

    public static void main(String[] args) {
        ClaseMath navegador = new ClaseMath();
        
        navegador.metodosBasicos();
        navegador.reduccionDecimales();
        navegador.numerosAleatorios();

    }

    /**
     * Metodos estaticos basicos que tiene la clase MATH.
     */
    private void metodosBasicos() {
        //RAIZ CUADRADA
        System.out.println("RAIZ CUADRADA:");
        double raiz = Math.sqrt(9);//Se utiliza la clase math.sqrt para sacar raiz cuadrada solo usando tipo double
        int raizA = (int) Math.sqrt(64);//Se puede usar int si pones un prefijo (int)
        System.out.println(raiz);
        System.out.println(raizA);
        //POTENCIAS
        System.out.println("POTENCIAS:");
        double base = 5, exponente = 2;//Se asigna el valor de la base y del exponente
        double potencia = Math.pow(base, exponente);//Se usa pow para sacar un exponente de un numero, se ingresa la base, luego el exponente.
        System.out.println(potencia);
        //REDONDEO
        System.out.println("REDONDEO:");
        double N = 62.23;
        long redondeo = Math.round(N);//Se una round para redondear al valor mas cercano
        System.out.println(redondeo);
        float M = 467.92f;
        int redondeo1 = Math.round(M);//Se una round para redondear al valor mas cercano 
        System.out.println(redondeo1);
        //GENERAR UN NUMERO ALEATORIO
        System.out.println("GENERAR UN NUMERO ALEATORIO:");
        int numeroRandom = (int) (Math.random() * 9); //Agarrara un numero del 0 al 9
        System.out.println(numeroRandom);
        //CONVERSION DE GRADOS A RADIANES Y VICEVERSA
        double anguloGrados = 45;
        System.out.println("GRADOS A RADIANES:");
        double anguloRadianes = Math.toRadians(anguloGrados);//Grados a radianes
        System.out.println(anguloRadianes + " rad");
        System.out.println("RADIANES A GRADOS:");
        anguloGrados = Math.toDegrees(anguloRadianes);//Radianes a Grados
        System.out.println(anguloGrados + "°");
        //FUNCIONES TRIGONOMETRICAS
        double resultadoTgm, unidadTgm = 0.707;
        resultadoTgm = Math.sin(anguloRadianes); //SENO, parametro RAD, devuelve unidades
        System.out.println("SENO DE " + anguloGrados + "° : " + resultadoTgm);
        resultadoTgm = Math.cos(anguloRadianes); //COSENO, parametro RAD, devuelve unidades
        System.out.println("COSENO DE " + anguloGrados + "° : " + resultadoTgm);
        resultadoTgm = Math.tan(anguloRadianes); //TAN, parametro RAD, devuelve unidades
        System.out.println("TANGENTE DE " + anguloGrados + "° : " + resultadoTgm);

        anguloRadianes = Math.asin(unidadTgm);//ARC SENO, parametro unidades, devuelve RAD
        anguloGrados = Math.toDegrees(anguloRadianes);//Radianes a Grados
        System.out.println("ARC SENO DE " + unidadTgm + ": " + anguloGrados + "°");
        anguloRadianes = Math.acos(unidadTgm);//ARC COSENO, parametro unidades, devuelve RAD
        anguloGrados = Math.toDegrees(anguloRadianes);//Radianes a Grados
        System.out.println("ARC COSENO DE " + unidadTgm + ": " + anguloGrados + "°");
        anguloRadianes = Math.atan(unidadTgm);//ARC TAN, parametro unidades, devuelve RAD
        anguloGrados = Math.toDegrees(anguloRadianes);//Radianes a Grados
        System.out.println("ARC TANGENTE DE " + unidadTgm + ": " + anguloGrados + "°");
        //CONSTANTE PI Y NUMERO DE EULER
        System.out.println("CONSTANTES DISPONIBLES:");
        System.out.println("Numero PI: " + Math.PI);
        System.out.println("Numero e: " + Math.E);
    }

    /**
     * Formas de reducir y redondear numeros con decimales extensos:
     * DECIMALFORMAT, STRING.FORMAT, MATH.ROUND, BIGDECIMAL
     */
    private void reduccionDecimales() {
        //REDUCCION DE DECIMALES
        double raiz = Math.sqrt(2);
        //Usando DecimalFormat
        System.out.println("REDUCCION DE 4 DECIMALES:");
        DecimalFormat df = new DecimalFormat("#.0000");//Formato para reducir los decimales de un numero
        System.out.println(df.format(raiz));//Valor con 4 decimales
        //Usando String.format
        System.out.println("REDUCCION DE 2 DECIMALES:");
        System.out.println(String.format("%.2f", raiz));//Valor con 2 decimales
        //Usando Math.round
        System.out.println("REDUCCION DE 3 DECIMALES:");
        System.out.println((double) Math.round(raiz * 1000d) / 1000);//Valor con 3 decimales
        //Usando BigDecimal
        System.out.println("REDUCCION DE 5 DECIMALES:");
        BigDecimal bd = new BigDecimal(raiz);
        bd = bd.setScale(5, RoundingMode.HALF_UP); //MOSTRAR 5 DECIMALES redondeando hacia arriba
        System.out.println(bd.doubleValue());//Valor con 5 decimales
    }

    /**
     * Generar un numero aleatorio de dos formas distintas: MATH.RANDOM, CLASE
     * RANDOM
     */
    private void numerosAleatorios() {
        int aleatorio;
        //Metodo Math.random()
        System.out.println("GENERAR UN NUMERO ALEATORIO DEL 0 AL 100:");
        aleatorio = (int) (Math.random() * 100);//Generamos un numero aleatorio del 0 al 100
        System.out.println(aleatorio);
        //Clase Random
        System.out.println("GENERAR UN NUMERO ALEATORIO DEL 0 AL 10:");
        Random r = new Random();
        aleatorio = (int) (r.nextDouble() * 10);//Generamos un numero aleatorio del 0 al 10
        System.out.println(aleatorio);
    }

}
