/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejemploarray;

/**
 *
 * @author Pablo
 */
public class EjemploArray {

    public static void main(String[] args) {
        //declaramos variable
        String[] semana = {"Lunes","Martes","Miércoles","Jueves","Viernes","Sábado","Domingo"};
        //salida de información
        //utilizamos bucle for-in
        for (String dia: semana){
            /* La cabecera del buble incorpora la declaracion de la variable dia a modo de contenedor temporal de cada uno de los elementos que forman el array semana.
            En cada una de las alteraciones del bucle, se irá cargando en la variable dia el valor de cada uno de los elementos que forman el array semana,
            desde el primero hasta el ultimo.
            */
         System.out.println(dia);   
        }
       
    }
}
