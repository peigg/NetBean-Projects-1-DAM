/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.archivos;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.io.File;

/**
 *
 * @author Pablo
 */
//Este programa abre un archivo y escribe en el lo que lee en el teclado, después cierra el archivo
public class Archivos {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Introduce el texto que quieres escribir en el archivo: ");
        String texto = scan.nextLine();
        
        File archivo = new File("archivo.txt");
        try {
            FileWriter escritor = new FileWriter(archivo);
            escritor.write(texto);
            escritor.close();
        } catch (IOException e) {
            System.out.println("Ha ocurrido un error al escribir en el archivo.");
            e.printStackTrace();
        }
    }
}
