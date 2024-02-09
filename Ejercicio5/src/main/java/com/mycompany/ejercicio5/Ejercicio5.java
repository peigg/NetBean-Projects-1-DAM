/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio5;
import java.util.Scanner;

/**
 *
 * @author Pablo
 */
/* Este programa calcula la división de dos números solicitados por teclado (dividendo y divisor). 
El programa solicitará números indefinidamente hasta que los dos números solicitados sean -1.
*/
public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Este programa calcula la división de dos números solicitados por teclado (dividendo y divisor). \n" +
"El programa solicitará números indefinidamente hasta que los dos números solicitados sean -1.");
        //pedimos por teclado dividendo y divisor
        System.out.println("Introduce un dividendo");
        int dividendo=Integer.parseInt(scan.nextLine());
        System.out.println("Introduce un divisor");
        int divisor=Integer.parseInt(scan.nextLine());
        //declaramos la variable que vamos a usar como contador
        int i = 0;
        //iniciamos un bucle booleano
        while (true){
        //En caso de que introduzcamos los números que pide el ejercicio, no necesitamos trabajar con excepciones
        if (dividendo==-1&&divisor==-1) {
        break;
        }
        //iniciamos la comprobación de excepciones
        try{
        int result=dividendo/divisor;
        System.out.println("El resultado de la division es: " + result);
        i++;
        }
        catch(ArithmeticException e){
        System.out.println("Error: el divisor no puede ser cero");
        }
    }
        System.out.println("El número total de divisiones es " + i  );
}}
