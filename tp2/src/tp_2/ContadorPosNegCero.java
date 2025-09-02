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
public class ContadorPosNegCero {
     public static void main(String[] args) {
         
         Scanner input = new Scanner (System.in);
         
         //declaracion de variables
         int sumaPos = 0;
         int sumaNeg = 0;
         int sumaCero = 0;
         
         for(int i=1; i<11; i++){
             
             //Ingreso de los números
             System.out.print("Ingrese el número " + i +":");
             int num = Integer.parseInt(input.nextLine());
             
             if(num==0){
                 sumaCero += 1;
             }else if(num%2==0){
                 sumaPos += 1;
             }else {
                 sumaNeg += 1;
             }
         }
         
         System.out.println("Resultados:");
         System.out.println("Positivos: " + sumaPos);
         System.out.println("Negativos: " + sumaNeg);
         System.out.println("Ceros: "  + sumaCero);
         
     }
     
}
