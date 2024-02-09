/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bisiesto;
import java.util.Scanner;

/**
 *
 * @author Pablo
 */
public class Bisiesto {

    public static void main(String[] args) {
        System.out.println("Introduce un número para comprobar si es bisiesto");
        Scanner scan = new Scanner(System.in);
        int anio = Integer.parseInt(scan.nextLine());
        if ((anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0)))
	System.out.println("El año es bisiesto");
else
	System.out.println("El año no es bisiesto");
    }
}
