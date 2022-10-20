package condicionales_if_else;

import javax.swing.JOptionPane;

public class Condicionales_If_Else {

    public static void main(String[] args) {
        int numero,dato = 5;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
        
        if (numero == dato){ // if (Condicion) { instruccion} por lo tanto, te devuelve un valor Boolean
            //Toda condicional o ciclo, para generar instrucciones, se abre-cierran llaves.
            //El doble igual no es de asignacion, es de comprobacion de igualdades
            JOptionPane.showMessageDialog(null, "El numero es 5");
            }
        else { //Si no se cumple el if, se salta su instruccion y hace la instruccion de else apartir de la llave
            //Esta instruccion no es obligatoria y puedes eliminar el else
            JOptionPane.showMessageDialog(null, "Su numero es distinto de 5");
            }
    /* Operadores de condicionales (Booleano)
        == Igualdad
        != Desigualdad
        > Mayor que... ; >= Mayor o igual que...
        < Menor que... ; <= Menor o igual que...
        */
        
    }
}
