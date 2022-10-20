package BASICO;

public class TiposPrimitivos {
    
    public static void main(String[] args) {
         int edad = 2_100_300;
        /*caracteres numericos enteros (2147483),
                    Los guiones bajos sirven de referencia de apuntes numericos grandes, 
                    para distinguir los tres ceros
                    no afecta al valor de la variable
                    */
        byte señal = 127;//señales de unos y ceros, solo llega hasta el (-128 al 127)
        short seccion = 32_000;//valores enteros cortos (-32767 al 32767)
        long distancia = 7_000_234;//valores enteros mas grandes (2^63)
        float peso = 3.78f;/*decimales con precision 3.4e+38
                    Se pone una "f" al final del decimal para que el programa detecte que es un decimal
                    */
        double estatura = 1.998887;/*decimales con precision 3.4e+308
                    No es necesario poner una "f" al final ya que el programa si lo detecta con ese tipo
                    primitivo
                    */
        char genero = 'M';/*Valores alfanumericos (A-Z, a-z, 0-65535)
                    Solo se permite un caracter, se ponen dos comillas sencillas para inciar el caracter
                    */
        boolean decision = true;//Valores con true o false
        
        System.out.println("Valor de byte es: " + señal);
        System.out.println("Valor de short es: " + seccion);
        System.out.println("Valor de int es: " + edad);
        System.out.println("Valor de long es: " + distancia);
        System.out.println("Valor de float es: " + peso);
        System.out.println("Valor de double es: " + estatura);
        System.out.println("Valor de char es: " + genero);
        System.out.println("Valor de boolean es: " + decision);
    }
    
}
