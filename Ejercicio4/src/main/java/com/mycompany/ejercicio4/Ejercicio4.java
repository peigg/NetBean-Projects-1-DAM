/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio4;

import java.util.Scanner;
/**
 *
 * @author Pablo
 */

//Este programa permite al usuario adivinar un número oculto aleatorio.
public class Ejercicio4 {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int numInt = 5;// declaramos la variable numInt para poder usarla en el switch
        int numMax = 10; // declaramos la variable numMax para poder usarla luego en el switch
        //Describimos el programa al usuario
        System.out.println("Este programa permite adivinar un número oculto aleatorio.");
        System.out.println("El programa muestra un pequeño menú en pantalla con las siguientes opciones (1. Configurar, 2. Jugar, 3. Salir).");
        String chr ="0";
        //Ciclo para que nos vuelva a salir el menú despues de ejecutar una opción, hasta que elijamos la opción 3.
        while (!chr.equals ("3")){
            //imprimimos menú y explicamos opciones
            System.out.println("                MENÚ:    ");
            System.out.println("Elige una de las siguientes opciones");
            System.out.println("1. Configurar  2. Jugar    3. Salir "); 
            System.out.println("Si el usuario selecciona la primera opción, se le solicitará por teclado el número de intentos permitidos (numInt) y el número máximo  (numMax) generado.");
            System.out.println("Si el usuario selecciona la opción 2,  el programa generará un número aleatorio entre 0 y numMax que será el número a adivinar (numOculto). A partir de este momento, se le solicitarán al usuario números hasta adivinar el número oculto.");
            System.out.println("Si el usuario pulsa la opción 3, el programa finaliza.");
            chr = scan.nextLine();
           switch (chr){
                //Se solicitan por teclado el número de intentos permitidos (numInt) y el número máximo (numMax) generado.
                case "1":
                    System.out.println("Introduce el numero de intentos permitidos");
                    numInt= Integer.parseInt(scan.nextLine());
                    System.out.println("Introduce el número máximo generado");
                    numMax=Integer.parseInt( scan.nextLine());
                    break;
                case "2":
                   //Obtenemos el número a adivinar
                   int numOculto = (int)Math.floor(Math.random()*numMax+1);
                   //damos oportunidades para adivinarlo
                   System.out.println("Tienes " + numInt + "intentos para adivinar el número oculto");
                   for (int i = 0;i < numInt;i++){
                       //pedimos un número y hacemos las comprobaciones necesarias
                       System.out.println("Introduce un número");
                      int numIntroducido=Integer.parseInt(scan.nextLine());
                      if (numIntroducido==numOculto){
                            System.out.println("Acertaste el número. Has necesitado " + i + " intentos.");
                            break;
                        } else if (numIntroducido > numOculto){
                            System.out.println("El número oculto es menor al número introducido");
                        } else{
                            System.out.println("El número oculto es mayor al número introducido");
                        }
                        if (i==numInt) {
                            System.out.println("Has agotado los intentos.");
                        }
                    } 
                    break;
                case "3":
                    System.out.println("Programa finalizado");
                    break;
                    
        }
        }
    }
}

