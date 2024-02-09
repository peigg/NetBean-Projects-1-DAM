/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio3;
import java.util.Scanner;

/**
 *
 * @author Pablo
 */
public class Ejercicio3 {
    /*Este programa Java pide dos números por teclado, comprueba que son positivos y calcula su MCM. 
*/
    public static void main(String[] args) {
        Scanner scan= new Scanner (System.in);
        //pedimos dos números
        System.out.println("Introduce dos números");
        //leemos los números con el scanner
        int y =Integer.parseInt(scan.nextLine());
        int x =Integer.parseInt(scan.nextLine());
        //Comprobamos si son positivos
        if (y<0||x<0) System.out.println("Al menos uno de los números es negativo, se finaliza el programa");
        else {
            System.out.println("El MCM de los números introducidos es " + mcm(x,y));
    }
}
     
//función para calcular el máximo común divisor de dos números.
  public static int mcd(int x, int y) {
    while (y != 0) {
      int temp = y;
      y = x % y;
      x = temp;
    }
    return x;
}
  //función que calcula el mínimo común múltiplo en base al mcd
  public static int mcm(int x, int y) {
    return x * y / mcd(x, y);
  }
}
