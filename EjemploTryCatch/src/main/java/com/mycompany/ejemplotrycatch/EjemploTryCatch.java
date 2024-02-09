/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejemplotrycatch;

/**
 *
 * @author Pablo
 */
import java.util.Scanner;
public class EjemploTryCatch {
    

    public static void main(String[] args) {
      


    Scanner sc = new Scanner(System.in);
    int num = 0;
    boolean correcto = false;
    
    while (!correcto) {
      try {
        System.out.print("Introduce un número entre 0 y 100: ");
        num = sc.nextInt();
        if (num >= 0 && num <= 100) {
          correcto = true;
        } else {
          System.out.println("El número debe estar comprendido entre 0 y 100.");
        }
      } catch (Exception e) {
        System.out.println("Entrada inválida. Introduce un número válido.");
        sc.nextLine();
      }
    }
    
    System.out.println("El número introducido es: " + num);
  }
}

