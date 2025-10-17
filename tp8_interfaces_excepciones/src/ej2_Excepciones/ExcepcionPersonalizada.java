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
public class ExcepcionPersonalizada {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         
         try {
             System.out.println("Ingrese una edad");
             int edad = Integer.parseInt(input.nextLine());
             
             validarEdad(edad); //Llamamos a nuestro método que puede fallar
             
             System.out.println("La edad " + edad + " es válida.");
         } catch (NumberFormatException e){
             System.out.println("Error: El valor introducido no es un número.");
         }catch(EdadInvalidaException eie){
             System.out.println("Error de validación: " + eie.getMessage());
         }
         
         input.close();
     }
     
     public static void  validarEdad(int edad) throws EdadInvalidaException  {
         if(edad < 0 || edad > 120) {
             throw new EdadInvalidaException("La edad debe estar entre 0 y 120.");
         }
             
     }

}

