/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejerciciomatrices;
import java.util.Random;

/**
 *
 * @author Pablo
 */
public class EjercicioMatrices {

    public static void main(String[] args) {
    int[][][] matriz = new int[2][3][3];
    Random random = new Random();

    // Llenar las matrices con valores aleatorios
    for (int n = 0; n < 2; n++) {
      for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
          matriz[n][i][j] = random.nextInt(10); // Genera valores aleatorios entre 0 y 9
        }
      }
    }

    // Imprimir las matrices originales
    System.out.println("Matriz 1:");
    imprimirMatriz(matriz[0]);
    System.out.println("Matriz 2:");
    imprimirMatriz(matriz[1]);

    // Sumar las matrices
    int[][] suma = new int[3][3];
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        suma[i][j] = matriz[0][i][j] + matriz[1][i][j];
      }
    }

    // Imprimir la matriz suma
    System.out.println("Matriz suma:");
    imprimirMatriz(suma);

    // Multiplicar las matrices
    int[][] producto = new int[3][3];
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        int total = 0;
        for (int k = 0; k < 3; k++) {
          total += matriz[0][i][k] * matriz[1][k][j];
        }
        producto[i][j] = total;
      }
    }

    // Imprimir la matriz producto
    System.out.println("Matriz producto:");
    imprimirMatriz(producto);
  }

  // Función para imprimir una matriz
  public static void imprimirMatriz(int[][] matriz) {
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        System.out.print(matriz[i][j] + " ");
      }
      System.out.println();
    }
    System.out.println();
  }
}

