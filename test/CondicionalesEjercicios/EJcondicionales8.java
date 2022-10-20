/*
SISTEMAS DE USUARIO Y CONTRASEÑA
 */
package CondicionalesEjercicios;

import java.util.Scanner;

public class EJcondicionales8 {

    public static void main(String[] args) {
        
        String nombre,contraseña;
        
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese su nombre de usuario: ");
        nombre = entrada.nextLine();
        System.out.print("Ingrese la contraseña: ");
        contraseña = entrada.nextLine();
        
        //Esta comparando los valores del nombre y contraseña que ingreso el usuario
        if (nombre.equals("Fisher")&&contraseña.equals("123456")){
            System.out.println("\nPuedes entrar al sistema");
        }else{
            System.out.println("\nNombre y contraseña incorrectos");
        }
        
    }
    
}
