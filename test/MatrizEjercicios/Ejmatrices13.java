/*
EJERCICIO 13:
Sumar, restar y multiplicar una matriz de 3 x 3
 */
package MatrizEjercicios;

/**
 *
 * @author Fisher
 */
public class Ejmatrices13 {

    public static void main(String[] args) {

        int[][] matrizUno, matrizDos, matrizSuma, matrizResta, matrizMultiplicacion;
        matrizUno = new int[3][3];
        matrizDos = new int[3][3];
        matrizSuma = new int[3][3];
        matrizResta = new int[3][3];
        matrizMultiplicacion = new int[3][3];

        //RELLENAMOS LOS DATOS DE LA PRIMER Y SEGUNDA MATRIZ CON NUMEROS ALEATORIOS
        for (int i = 0; i < matrizUno.length; i++) {
            for (int j = 0; j < matrizUno[i].length; j++) {
                matrizUno[i][j] = (int) (Math.random() * 9);
            }
        }
        for (int i = 0; i < matrizDos.length; i++) {
            for (int j = 0; j < matrizDos[i].length; j++) {
                matrizDos[i][j] = (int) (Math.random() * 9);
            }
        }

        //SUMA DE MATRIZ UNO Y DOS
        for (int i = 0; i < matrizSuma.length; i++) {
            for (int j = 0; j < matrizSuma[i].length; j++) {
                matrizSuma[i][j] = matrizUno[i][j] + matrizDos[i][j];
            }
        }
        //RESTA DE MATRIZ UNO Y DOS
        for (int i = 0; i < matrizResta.length; i++) {
            for (int j = 0; j < matrizResta[i].length; j++) {
                matrizResta[i][j] = matrizUno[i][j] - matrizDos[i][j];
            }
        }
        //MULTIPLICACION DE MATRIZ UNO Y DOS
        for (int i = 0; i < matrizMultiplicacion.length; i++) {
            for (int j = 0; j < matrizMultiplicacion[i].length; j++) {
                matrizMultiplicacion[i][j] = matrizUno[i][j] * matrizDos[i][j];
            }
        }

        //IMPRESION DE LA PRIMER MATRIZ
        System.out.println("PRIMER MATRIZ: ");
        for (int i = 0; i < matrizUno.length; i++) {
            for (int j = 0; j < matrizUno[i].length; j++) {
                System.out.print("[" + matrizUno[i][j] + "] ");
            }
            System.out.println("");
        }
        //IMPRESION DE LA SEGUNDA MATRIZ
        System.out.println("SEGUNDA MATRIZ: ");
        for (int i = 0; i < matrizDos.length; i++) {
            for (int j = 0; j < matrizDos[i].length; j++) {
                System.out.print("[" + matrizDos[i][j] + "] ");
            }
            System.out.println("");
        }
        //IMPRESION DE RESULTADOS
        System.out.println("SUMA DE MATRICES UNO Y DOS FUE:");
        for (int i = 0; i < matrizSuma.length; i++) {
            for (int j = 0; j < matrizSuma[i].length; j++) {
                System.out.print("[" + matrizSuma[i][j] + "] ");
            }
            System.out.println("");
        }
        System.out.println("RESTA DE MATRICES UNO Y DOS FUE:");
        for (int i = 0; i < matrizResta.length; i++) {
            for (int j = 0; j < matrizResta[i].length; j++) {
                System.out.print("[" + matrizResta[i][j] + "] ");
            }
            System.out.println("");
        }
        System.out.println("MULTIPLICACION DE MATRICES UNO Y DOS FUE:");
        for (int i = 0; i < matrizMultiplicacion.length; i++) {
            for (int j = 0; j < matrizMultiplicacion[i].length; j++) {
                System.out.print("[" + matrizMultiplicacion[i][j] + "] ");
            }
            System.out.println("");
        }
    }//PSVM

}
