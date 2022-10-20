package BASICO;
//Condicionales multiples o Switch

import javax.swing.JOptionPane;

public class Switch {

    public static void main(String[] args) {
    int dato;
    dato = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un numero entre el 1 y 5"));
    
    switch (dato){ //switch (condicional) { casos con su instruccion }
        case 1: JOptionPane.showMessageDialog(null, "Es el numero 1"); //Case (constante)
        break; //El break sirve para terminar la instruccion para que no se empalme con los demas casos y no se realicen simultaneamente, y asi terminar el proceso del switch
        case 2: JOptionPane.showMessageDialog(null, "Es el numero 2");
        break;
        case 3: JOptionPane.showMessageDialog(null, "Es el numero 3");
        break;
        case 4: JOptionPane.showMessageDialog(null, "Es el numero 4");
        break;
        case 5: JOptionPane.showMessageDialog(null, "Es el numero 5");
        break;
        default: JOptionPane.showMessageDialog(null, "No se ingreso ningun numero del 1 al 5");
        //El default es cuando ninguno de los casos son correspondidos con el condicional
    }
    }
    
}
