package BASICO;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Arreglos {

    //Tipo_de_variable[ ] nombre_del_array = new Tipo_de_variable [ dimension ];
    public static void main(String[] args) {
        //Forma 1 de dar valores: con valores propios
        //Forma A
        int[] numeros = new int[3];

        numeros[0] = 7; //nombre_del_array[ posicion ] = valor constante que le quieras dar a esa casilla
        numeros[1] = 5;
        numeros[2] = 9;

        //Forma B
        int[] numbers = {8, 3, 2}; //Tipo_de_variable[ ] nombre_del_array = {valor1,valor2,....,valorN};

        //Imprimir nuestros valores
        for (int i = 0; i < 3; i++) {//Imprimira de la posicion 0 al 2
            System.out.println(numbers[i]);//Se pone el nombre del array y dentro del corchete el iterado (para imprimir la posicion)
            System.out.println(numeros[i]);
        }
        //Forma 2 de dar valores: con entrada de consola
        //Forma A con for simple
        int Nelementos;
        Nelementos = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de caracteres que desea ingresar"));
        char[] letras = new char[Nelementos];

        System.out.println("Introduzca " + Nelementos + " elemento(s) del array");
        for (int i = 0; i < Nelementos; i++) {
            System.out.println((i + 1) + ".- Digite un caracter: ");//El i+1 es para que aparezca de esta manera (1.-), y no iniciar asi (0.-), es para fines esteticos
            Scanner entrada = new Scanner(System.in);
            letras[i] = entrada.next().charAt(0);
        }
        System.out.println("\nLos caracteres del arreglo son: ");//Impresion de resultados
        for (int i = 0; i < Nelementos; i++) {
            System.out.print(letras[i] + " ");
        }
        //Forma B con for each
        for (char j : letras) { //Creé la variable j para imprimir los valores de "letras"
            System.out.println("\nLetras: " + j);
        }
    }

}
