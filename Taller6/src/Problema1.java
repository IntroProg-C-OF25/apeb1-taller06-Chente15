/*
Facturación de 2 productos: La empresa Amazon.com le contrata como desarrollador de Sistemas Informáticos para programar su sistema de compras online,
el cual calcule el precio total de la compra para un cliente. 
Para ello, se necesita utilizar estructuras secuenciales y de selección (if simple, doble y/o anidadas), sin aplicar ciclos repetitivos.

Requisitos:
La empresa inicialmente venderá solo 2 tipos de productos distintos, a costos variantes.
Al costo total de la factura, se debe incluir los gastos por concepto de transporte/envío del paquete, del cual no se aplican ningún tipo de descuentos o impuestos dada la excepción descrita en el punto 3.b.
El objetivo es presentar al usuario los detalles de su compra: costos, impuestos, descuentos, monto final dadas las siguientes condiciones: a. Si el subtotal de la compra (sin descuentos o gastos de envío),
supera los $1000, se le otorga un 20% de descuento; y si es al menos los $1000 el descuento es como mínimo 5%. b. Adicional, si la compra es mayor a $5000, el envío será gratuito. c. El IVA del 10% se debe aplicar a todos los artículos antes de agregar cualquier tipo de descuesto o promoción.

 /* @author Chente15
 */
import java.util.Scanner;

public class Problema1 {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        double product1, product2, iva, descuento = 0, costoEnvio, subtotal, subTotaliva, costoFinal;
        System.out.print("Dame 2 costos de los productos: ");
        product1 = tcl.nextDouble();
        product2 = tcl.nextDouble();
        System.out.print("Dame el costo del envio: ");
        costoEnvio = tcl.nextDouble();
        iva = (product1 + product2) * 0.10;
        subtotal = (product1 + product2);
        subTotaliva = subtotal + iva;
        if (subtotal > 1000) {
            System.out.print("El descuento es del 20%: ");
            descuento = subtotal * 0.20;
        } else if (subtotal >= 1000) {
            System.out.print("El descuento es del 5%: ");
            descuento = subTotaliva * 0.05;
        }
        if (subtotal > 5000) {
            System.out.print("Envio gratis: ");
            costoEnvio = 0;
        }
        costoFinal = (subTotaliva + costoEnvio) - descuento;
        System.out.println("subtotal = " + subtotal);
        System.out.println("Iva = " + iva);
        System.out.println("subtotal + iva = " + subTotaliva);
        System.out.println("costo de envio = " + costoEnvio);
        System.out.println("costoFinal = " + costoFinal);
    }

}
/***
*Dame el costo del envio: 200
*subtotal = 700.0
*Iva = 70.0
*subtotal + iva = 770.0
*costo de envio = 200.0
*costoFinal = 970.0
 */
