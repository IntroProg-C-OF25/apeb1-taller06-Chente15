/*
Costo de envío de paquetes Un servicio de envío cobra diferentes tarifas según la región y el peso del paquete.
Si el peso es menor de 5 kg y la región es "local", el costo es de $5. Si pesa entre 5 y 10 kg, el costo es de $10 para la región "nacional".
Para cualquier otro caso, el costo es de $15.

/*@author Chente15
 */
import java.util.Scanner;

public class Problema3 {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        double peso, costoEnvio;
        String region;
        System.out.print("Dame el peso del paquete en kg: ");
        peso = tcl.nextDouble();
        System.out.print("Dame la region (Local/Nacional): ");
        region = tcl.next().toLowerCase();
        if (peso < 5) {
            if (region.equals("local")) {
                costoEnvio = 5;
            } else {
                costoEnvio = 15;
            }
        } else {
            if (peso <= 10) {
                if (region.equals("nacional")) {
                    costoEnvio = 10;
                } else {
                    costoEnvio = 15;
                }
            } else {
                costoEnvio = 15;
            }
        }
        System.out.println("El costo de envío es: $" + costoEnvio);
    }
}
/***
*run:
*Dame el peso del paquete en kg: 4
*Dame la region (Local/Nacional): local
*El costo de env�o es: $5.0
*/
