/*
EJERCICIO 11:
Se tiene la siguiente informacion: - Nombres de 4 empleados.
                                               - Ingresos en concepto de sueldo, cobrado por cada empeado, en los ultimos 3 meses
Confeccionar el programa para:
a) Realizar la carga de la informacion mencionada.
b) Generar un vector que contenga el ingreso acumulado en sueldos en los ultimos 3 meses para cada empleado.
c) Mostrar por pantalla el total pagado en sueldos a todos los empleados en los ultimos 3 meses.
d) Obtener el nombre del empleado que tuvo el mayor ingreso acumulado.
 */
package MatrizEjercicios;

import java.util.Scanner;

/**
 *
 * @author Fisher
 */
public class Ejmatrices11 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        //CREAMOS LAS MATRICES Y ARREGLOS
        String[] nombres = new String[4]; //Empleados
        int[][] sueldos = new int[4][3];//Sueldos, matriz de 4 filas (empleados) y 3 columnas (meses)
        int[] sueldoTotal = new int[4];//Total pagado en sueldos de todos los empleados en los ultimos 3 meses

        //RELLENAMOS LOS NOMBRES Y LOS SUELDOS
        System.out.println("DIGITE LOS DATOS");
        for (int i = 0; i < nombres.length; i++) {//FILAS (EMPLEADOS)
            System.out.print("Rellene los nombres " + (i + 1) + ".- ");
            nombres[i] = teclado.next();
            System.out.println("");
            
            //CREAMOS UN SEGUNDO FOR PARA GUARDAR LOS SUELDOS
            for (int j= 0; j < sueldos[i].length; j++) { //COLUMNAS (sueldo por nombre)
                System.out.print("Ingrese el sueldo de "+nombres[i]+" del mes n°"+(j+1)+": ");
                sueldos[i][j]= teclado.nextInt();
            }
            System.out.println("");//SALTO DE LINEA POR CADA FILA (NOMBRE) INGRESADO
        }
        
        //VAMOS A CALCULAR LA SUMA DE LOS SUELDOS DE CADA EMPLEADO
        for (int i = 0; i < sueldoTotal.length; i++) {//FILAS (EMPLEADOS)
            int sumaSueldos=0;
            for (int j = 0; j < sueldos[i].length; j++) {//COLUMNAS (sueldos por nombre)
                sumaSueldos +=sueldos[i][j]; //Almacenamos los sueldos de cada empleado
            }
            sueldoTotal[i]=sumaSueldos;//La suma total de cada fila va a guardarse en un espacio del arreglo
        }
        //IMPRIMIMOS NOMBRES Y SUELDOS TOTALES
        System.out.println("LOS SUELDOS TOTALES DE LOS EMPLEADOS SON:");
        for (int i = 0; i < sueldoTotal.length; i++) {
            System.out.println("El sueldo del empleado "+nombres[i]+" de los ultimos 3 meses es: $"+sueldoTotal[i]);
        }
        //IMPRIMIMOS EL QUE TIENE MAYOR INGRESO ACUMULADO
        int sueldoMayor = sueldoTotal[0];
        String empleadoSueldoMayor=nombres[0];
        
        for (int i = 0; i < sueldoTotal.length; i++) {
            if(sueldoTotal[i]>sueldoMayor){
                sueldoMayor=sueldoTotal[i];
                empleadoSueldoMayor=nombres[i];
            }
        }
        System.out.println("EL EMPLEADO "+empleadoSueldoMayor+" TIENE EL SUELDO MAS GRANDE CON $"+sueldoMayor);
        

    }//PSVM

}
