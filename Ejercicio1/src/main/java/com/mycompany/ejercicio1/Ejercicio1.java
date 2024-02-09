/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio1;
import java.util.Scanner;

/**
 *
 * @author Pablo
 */
/*Este programa muestra la tabla de multiplicar de un número leido desde teclado utilizando al menos tres bucles diferentes. 

El número leído desde teclado debe ser menor que 30. 

En caso contrario se mostrará un mensaje por pantalla y el programa finalizará.

*/

public class Ejercicio1{
    
    public static void main(String[] args) {
        //imprimimos mensaje
        System.out.println("introduce un número");
        //activamos scanner
        Scanner scan = new Scanner (System.in);
        //leemos número
        int numero = Integer.parseInt(scan.nextLine());
        //comprobamos si el número es menor que 0 o mayor que 30
        //Si no cumple la condición imprimimos mensaje y finalizamos programa.
        if ( numero<0||numero>30){
            System.out.println("El número es mayor que 30 o negativo, finaliza el programa");
        }
        //Si cumple la condición, imprimimos la tabla del número introducido
        else {
            for (int i=0;i<3 ;i++){
                for (int j=0; j<4; j++){
                    for (int k=0; k<3; k++){
                        int num = i*12 + j*3 + k;
                        if (num <= 10){
                            System.out.print(" " + num*numero + " ");
                        }
                    }
                    System.out.println("");
                }
                System.out.println("");
            }
        }
    }
}

