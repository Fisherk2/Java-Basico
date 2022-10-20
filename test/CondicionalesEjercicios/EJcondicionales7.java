/*
Ejercicio 7: Hacer un programa que simule un cajero automatico con un saldo inicial de 1000 dolares, con el
siguiente menu de opciones:
1.-Ingresar dinero a la cuenta
2.-Retirar dinera de la cuenta
3.-Salir
 */
package CondicionalesEjercicios;

import javax.swing.JOptionPane;

public class EJcondicionales7 {

    public static void main(String[] args) {
        final int saldo0 = 1000;
        float saldof;
        int operacion;

        operacion = Integer.parseInt(JOptionPane.showInputDialog("¿Que operacion quiere realizar?\n"//Realice salto de linea para que quede mas estetico
                + "Teclee 1 si quiere: Ingresar dinero a la cuenta\n"
                + "Teclee 2 si quiere: retirar dinero de la cuenta\n"
                + "Teclee 3 si quiere: salir"));

        switch (operacion) {
            case 1:
                float suma;
                suma = Float.parseFloat(JOptionPane.showInputDialog("¿Cuanto dinero desea ingresar"));//Si se usa Integer.parseInt, solo va guardar numeros enteros y no los decimales en caso de haber ingresado con decimal.
                saldof = saldo0 + suma;
                JOptionPane.showMessageDialog(null, "Uste acaba de ingresar $"+suma+"\n"+"Ahora tiene $"+saldof+" de saldo");
                break;
            case 2:
                float resta;
                resta = Float.parseFloat(JOptionPane.showInputDialog("¿Cuanto dinero desea retirar"));
                if (resta>saldo0) { //Si excede el retiro del saldo inicial, marcara error porque no puedes sacar mas dinero del que tienes.
                JOptionPane.showMessageDialog(null, "Uste ha querido de retirar $"+resta+"\n"
                        +"NO puede retirar esa cantidad de dinero porque excede a su saldo actual de $"+saldo0+"\n"
                        +"Porfavor ingrese otro valor");
                }else{
                saldof = saldo0 - resta;
                JOptionPane.showMessageDialog(null, "Uste acaba de retirar $"+resta+"\n"+"Ahora tiene $"+saldof+" de saldo");
                }
                break;
            case 3:
                break;
            default: JOptionPane.showMessageDialog(null, "Uste digito otra operacion, porfavor, ingrese los correctos");

        }
    }

}
