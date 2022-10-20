/*
Realizar un juego para adivinar un numero. Para ello generar un numero aleatorio entre 0-100, y luego ir pidiendo
numeros indicando "Es mayor" o "Es menor" segun sea mayor o menor con respecto a N. El proceso termina
cuando el usuario acierta y muestra el numero de intentos.
 */
package CiclosEjercicios;

import javax.swing.JOptionPane;

public class EJciclos3 {

    public static void main(String[] args) {
        int numero,aleatorio,intentos=0;
        
        aleatorio= (int)(Math.random()*100);//La clase Math solo admite double, por lo tanto se antepone int para generar numeros int y admitirlos en la funcion. 
        /*"Random" genera un numero aleatorio entre 0 y 1 y te lo devuelve como double
                   Se multiplica por 100 para que genere un numero entre el 0 y el 100
                   Se antepone int para que el resultado sean numeros enteros.
                */
        do { 
            numero=Integer.parseInt(JOptionPane.showInputDialog("Adivine el numero"));
            intentos++;
            if (numero<aleatorio) {//Si el numero que ingresaste es menor al que se genero aleatoriamente, te saldra la pista que tu numero es menor que el que quieres adivinar
                JOptionPane.showMessageDialog(null, "El numero que ingreso es menor al que quiere adivinar");
            } else if(numero>aleatorio) {//Si el numero que ingresaste es mayor al que se genero aleatoriamente, te saldra la pista que tu numero es mayor que el que quieres adivinar
                JOptionPane.showMessageDialog(null, "El numero que ingreso es mayor al que quiere adivinar");
            }
        } while (numero!=aleatorio);
        JOptionPane.showMessageDialog(null,"Felicidades acertaste el numero "+aleatorio
                +"\nEl numero de intentos que hiciste fue: "+intentos);
    }
}
