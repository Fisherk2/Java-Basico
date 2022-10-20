/*
EJERCICIO 3:
Confeccionar una clase para administrar los dias que han faltado los 3 empleados de una empresa.
Definir un vector de 3 elementos de tipo String para cargar los nombres y una matriz irregular para cargar los dias que han 
faltado cada empleado (cargar el numero de dia que falto).
Cada fila de la matriz representan los dias de cada empleado.
Mostrar los empleados con la cantidad de inasistencias.
Cual empleado falto menos dias.
 */
package MatrizEjercicios;

import java.util.Scanner;

/**
 *
 * @author Fisher
 */
public class EjmatricesIrregulares3 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String[] nombres = new String[3];//Empleados
        int[][] dias = new int[3][];//Asignamos el numero de filas que son los mismos que el de los empleados
        int faltasPorEmpleado;

        //RELLENAMOS EMPLEADOS
        for (int i = 0; i < nombres.length; i++) {//FILAS
            System.out.print("Ingrese el nombre del empleado n°" + (i+1) + ": ");
            nombres[i] = teclado.next();
            System.out.print("¿Cuantas faltas tuvo el empleado " + nombres[i] + "?: ");
            faltasPorEmpleado = teclado.nextInt();
            dias[i] = new int[faltasPorEmpleado];//Asignamos el numero de columnas por cada fila iterada
            //RELLENAMOS POR ESPACIO LOS DIAS QUE FALTO
            System.out.println("¿Que dias falto?");
            for (int j = 0; j < dias[i].length; j++) {//COLUMNAS
                System.out.print("FALTA N°" + (j+1) + ": ");
                dias[i][j] = teclado.nextInt();
            }
        }
        //IMPRESION DE FALTAS POR EMPLEADO
        for (int i = 0; i < nombres.length; i++) {//FILAS
            System.out.println("El empleado " + nombres[i] + " tiene " + dias[i].length+" faltas");
        }
        //CALCULAMOS EL EMPLEADO CON MENOS ASISTENCIAS
        int faltaMenor = dias[0].length;
        String empleadoResponsable = nombres[0];
        for (int i = 0; i < nombres.length; i++) {//FILAS
            if (dias[i].length < faltaMenor) {
                faltaMenor = dias[i].length;
                empleadoResponsable = nombres[i];
            }
        }
        System.out.println("\nEl empleado con menos faltas fue "+empleadoResponsable
                +" con un numero de faltas de "+faltaMenor+" faltas");
        
    }

}
