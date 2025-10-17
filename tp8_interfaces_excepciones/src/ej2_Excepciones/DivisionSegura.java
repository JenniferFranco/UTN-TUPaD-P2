/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej2_Excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Jennifer
 */
public class DivisionSegura {
     public static void main(String[] args) {
         Scanner  input = new Scanner(System.in);
         
         try{
             System.out.print("Ingrese el número a dividir: ");
             int dividendo = Integer.parseInt(input.nextLine());
             
            System.out.print("Ingrese el número divisor: ");
            int divisor = Integer.parseInt(input.nextLine());
              
            int resultado = dividendo / divisor; // Esta es la línea que puede lanzar la excepción
            System.out.println("El resultado de la división es: " + resultado); 
            
         } catch(ArithmeticException ae ){
             System.out.println("Error: No se puede dividir por cero.");
             
         } catch (NumberFormatException e) {
            System.out.println("Error: Debes introducir números enteros.");
        }
         // Cerramos el scanner al final
         input.close();
     }
    
}
