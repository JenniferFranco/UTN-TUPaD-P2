/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej2_Excepciones;

import java.util.Scanner;

/**
 *
 * @author Jennifer
 */
public class ConversionCadenaANumero {
      public static void main(String[] args) {
           Scanner  input = new Scanner(System.in);
           
           try {
               System.out.print("Ingrese un texto: ");
               String texto =input.nextLine();
               
               int numero = Integer.parseInt(texto);  // Esta es la línea que puede lanzar la excepción
               
               System.out.println("Conversion exitosa. El número es: " + numero);
               
           } catch(NumberFormatException nfe){
               System.out.println("Error: El texto introducido no es un número entero válido.");
           }
           
            // Cerramos el scanner al final
            input.close();
      }
    
}
