/*
Convertir un número de mes a nombre. Dado un número del 1 al 12, que representa un mes del año, muestra el nombre del mes correspondiente. 
Por ejemplo, si el usuario ingresa 1, debe mostrar "Enero"; si ingresa 2, debe mostrar "Febrero", y así sucesivamente.
 */
 /*@author Chente15
 */
import java.util.Scanner;

public class Problema4 {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int mes;
        String nombreMes = null;
        System.out.print("Ingresa un numero del 1 al 12 para seleccionar el mes: ");
        mes = tcl.nextInt();
        switch (mes) {
            case 1:
                nombreMes = "Enero";
                break;
            case 2:
                nombreMes = "Febrero";
                break;
            case 3:
                nombreMes = "Marzo";
                break;
            case 4:
                nombreMes = "Abril";
                break;
            case 5:
                nombreMes = "Mayo";
                break;
            case 6:
                nombreMes = "Junio";
                break;
            case 7:
                nombreMes = "Julio";
                break;
            case 8:
                nombreMes = "Agosto";
                break;
            case 9:
                nombreMes = "Septiembre";
                break;
            case 10:
                nombreMes = "Octubre";
                break;
            case 11:
                nombreMes = "Noviembre";
                break;
            case 12:
                nombreMes = "Diciembre";
                break;
        }
        System.out.println("El mes seleccionado es = " + nombreMes);

    }
}
/***
*run:
*Ingresa un numero del 1 al 12 para seleccionar el mes: 8
*El mes seleccionado es = Agosto
*/