/*
Clasificación de un triángulo Dado tres valores que representan las longitudes de los lados de un triángulo, determinar su tipo. 

Las reglas son:

Si todos los lados son iguales, mostrar "Triángulo equilátero".
Si dos lados son iguales, mostrar "Triángulo isósceles".
Si todos los lados son diferentes, mostrar "Triángulo escaleno".
Si la suma de dos lados no es mayor que el tercer lado, mostrar "No es un triángulo".

 /* @author Chente15
 */

import java.util.Scanner;

public class Problema2 {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        double lado1, lado2, lado3, tri;
        System.out.print("Dame 3 longitudes: ");
        lado1 = tcl.nextDouble();
        lado2 = tcl.nextDouble();
        lado3 = tcl.nextDouble();
        if (lado1 + lado2 <= lado3) {
            System.out.println("No es un triángulo: ");
        } else {
            if (lado1 + lado3 <= lado2) {
                System.out.println("No es un triángulo: ");
            } else {
                if (lado2 + lado3 <= lado1) {
                    System.out.println("No es un triángulo: ");
                } else {
                    if (lado1 == lado2) {
                        if (lado2 == lado3) {
                            System.out.println("Triángulo equilátero: ");
                        } else {
                            System.out.println("Triángulo isósceles: ");
                        }
                    } else {
                        if (lado1 == lado3) {
                            System.out.println("Triángulo isósceles: ");
                        } else {
                            if (lado2 == lado3) {
                                System.out.println("Triángulo isósceles: ");
                            } else {
                                System.out.println("Triángulo escaleno: ");
                            }
                        }
                    }
                }
            }
        }
    }
}
/***
*run:
*Dame 3 longitudes: 
*1 8 5
*No es un tri�ngulo
 */
 /*
run:
*Dame 3 longitudes: 5 5 5
*Tri�ngulo equil�tero
 */
 /*
*run:
*Dame 3 longitudes: 5 8 8
*Tri�ngulo is�sceles
 */
 /*
*run:
*Dame 3 longitudes: 4 5 7
*Tri�ngulo escaleno
 */
