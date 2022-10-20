/*
Pedir numeros hasta que se introduzxa uno engativo, y calcular la media.
 */
package CiclosEjercicios;

import javax.swing.JOptionPane;

public class EJciclos4 {

    public static void main(String[] args) {
        int numero,elementos=0,sumatoria=0;//La sumatoria va guardando la suma de cada ciclo
        float media;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Inserte los numeros que desea sacar media"));
        
        while (numero>=0) {
            sumatoria+=numero;//Suma iterativa
            elementos++; //Se va sumando el numero de ciclos que se repite, o en este caso, el numero de veces introducido en la entrada
            
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite otro numero"));
        }
        
        if (elementos==0) {//La division entre cero no existe
            JOptionPane.showMessageDialog(null, "ERROR, La division entre cero no existe");
        }else{
            media = (float)sumatoria/elementos;//Se convierte la funcion a float.
            System.out.println("La media es: "+media);
        }
    }
}
