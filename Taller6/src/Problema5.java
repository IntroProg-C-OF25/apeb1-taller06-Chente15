/*
Determinar el tipo de operación matemática. Dado un número del 1 al 4 que representa una operación matemática básica 
(suma, resta, multiplicación, división),
muestra el nombre de la operación correspondiente.
Por ejemplo, si el usuario ingresa 1,
debe mostrar "Suma"; si ingresa 2, debe mostrar "Resta", y así sucesivamente.
 */
 /*@author Chente15
 */
import java.util.Scanner;

public class Problema5 {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int operacion;
        String nombreOpera = null;
        System.out.print("Ingrese un numereo del 1 al 4 para seleccionar la operacion: ");
        operacion = tcl.nextInt();
        switch (operacion) {
            case 1:
                nombreOpera = "Suma";
                break;
            case 2:
                nombreOpera = "Resta";
                break;
            case 3:
                nombreOpera = "Multiplicacion";
                break;
            case 4:
                nombreOpera = "Division";
                break;
        }
        System.out.println("La operacion seleccionada es = " + nombreOpera);

    }
}
/***
*run:
*Ingrese un numereo del 1 al 4 para seleccionar la operacion: 3
*La operacion seleccionada es = Multiplicacion
 */
