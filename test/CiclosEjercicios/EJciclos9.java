/*
Ejercicio 9: Una empresa que se dedica a la venta de desinfectantes necesita un programa para gestionar 
las facturas. En cada factura figura: el codigo del articulo, la cantidad vendida en litros y el precio por el
litro. Se pide de facturas introducidas: Facturacion total, cantidad en litros vendidos del articulo 1 y cuantas
facturas se emitieron de mas de $600.
 */
package CiclosEjercicios;

import javax.swing.JOptionPane;

public class EJciclos9 {

    public static void main(String[] args) {
        int codigo, litros, litros1 = 0, contador600 = 0;
        float precioLitro, importeFactura, facturacionTOTAL = 0;

        for (int i = 1; i <= 5; i++) {
            codigo = Integer.parseInt(JOptionPane.showInputDialog("Articulo " + i + "\nDigite el codigo del articulo"));
            litros = Integer.parseInt(JOptionPane.showInputDialog("Articulo " + i + "\nIngrese el numero de litros"));
            precioLitro = Float.parseFloat(JOptionPane.showInputDialog("Articulo " + i + "\nIngrese el precio por litro"));

            importeFactura = (float) litros * precioLitro;//importe por factura
            facturacionTOTAL += importeFactura;//Se va acumulando en la variable los importes

            if (codigo == 1) {
                litros1 += litros; //Se suma los litros vendidos del articulo 1
            }
            if (importeFactura > 600) {//Cuantas facturas se emitieron de mas de $600
                contador600++;
            }
        }
        System.out.println("RESUMEN DE VENTAS\n");
        System.out.println("Facturacion total: " + facturacionTOTAL
                + "\nNumero de litros vendidos del articulo 1: " + litros1
                + "\nNumero de facturas que se emitieron de mas de $600: " + contador600);
    }

}
