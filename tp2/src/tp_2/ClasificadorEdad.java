/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp_2;

import java.util.Scanner;

/**
 *
 * @author Jennifer
 */
public class ClasificadorEdad {
     public static void main(String[] args) {
         
         Scanner input = new Scanner(System.in);
         
         //Solicitar al usuario la edad
         System.out.print("Ingrese su edad: ");
         int edad = Integer.parseInt(input.nextLine());
         
         clasificadorEdad(edad);
     }
     
     //Funcion para clasificar la edad
     static void clasificadorEdad(int num){
         if(num<12){
             System.out.println("Eres un Niño");
         }else if(num>= 12 &&num <= 17){
                 System.out.println("Eres un Adolescente");
             }else if(num <= 59){
                      System.out.println("Eres un Adulto");
                     } else {
                     System.out.println("Eres un Adulto mayor");
                     }
             }
         }
     

