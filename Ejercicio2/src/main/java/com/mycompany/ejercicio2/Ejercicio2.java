/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio2;
import java.util.Scanner;

/**
 *
 * @author Pablo
 */
public class Ejercicio2 {
/*En este ejercicio pedimos por pantalla 5 números y comprobamos si son negativos y si son primos
    */
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //bucle para pedir número 5 veces
        for (int i=0; i<5;i++){
        //pedimos un número
             System.out.println("Introduce un número");
        //leemos el número
        int number = Integer.parseInt(scan.nextLine());
        //comprobamos si es negativo
        if (number<0) {
            System.out.println("El número es negativo");
        }
        //si es positivo, comprobamos si es primo
        else {
            if (esPrimo(number)==true){
                System.out.println("El número introducido es primo");
        } else System.out.println("El número introducido no es primo");
        }}
        }
    
    //método para calcular si un número es primo
    public static boolean esPrimo (int x){
        if (x <= 1) {
        return false;
    }
    for (int i = 2; i < Math.sqrt(x); i++) {
        if (x % i == 0) {
            return false;
        }
    }
    return true;
    }
}
