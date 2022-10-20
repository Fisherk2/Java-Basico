package BASICO;

import javax.swing.JOptionPane;//Se genera automaticamente el importe del JOptionPane

public class JOptionPaneConsola {

    public static void main(String[] args) {
        String cadena;
        int entero;
        char letra;
        double decimal;
        
        cadena = JOptionPane.showInputDialog("Digite una cadena");
        /*Se genera una ventana emergente con el mensaje que esta entre comillas
                    Dentro de esta ventana se almacenara elementos del tipo String
                */
        
        entero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero entero"));
        /* No se puede guardar una variable int en una variable String (JOptionPane)
                    Se transforma el JOptionPane en int con Integer.parseInt */
        
        letra = JOptionPane.showInputDialog("Digite una letra").charAt(0);
        //Se almacenan los char poniendo un ".charAt" al final de la funcion como con los del sout
        
        decimal = Double.parseDouble(JOptionPane.showInputDialog("Escriba un valor decimal"));
        //Se transforma el JOptionPane en Double, siempre se inicia con mayuscula, solo admite punto, no comas.
        
        JOptionPane.showMessageDialog(null, "La cadena ingresada fue: "+cadena);
        JOptionPane.showMessageDialog(null, "El entero ingresado fue "+entero);
        JOptionPane.showMessageDialog(null, "El caracter es: "+letra);
        JOptionPane.showMessageDialog(null, "El decimal es: " + decimal);
        //Se pone null en parentComponent
    }
    
}
