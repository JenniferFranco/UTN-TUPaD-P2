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
public class CalcularMayor {
    
     public static void main(String[] args) {
    Scanner input = new Scanner (System.in);
    int num1, num2, num3, mayor;
    
    num1 = solicitarNum( "primer", input);
    num2 = solicitarNum( "segundo", input);
    num3 = solicitarNum( "tercer", input);
   
    mayor = calcularMayor (num1, num2, num3);
    System.out.println("El número mayor es: " + mayor);
}
  
     //Funcion para solicitar numero
    static int solicitarNum (String orden, Scanner input){
        System.out.print("Ingrese el " + orden + " número: ");
        int  num = Integer.parseInt(input.nextLine());
        return num; 
     }
    
    //Funcion para calcular el mayor
    static int calcularMayor(int num1, int num2, int num3){
        if(num1 > num2 && num1 > num3){
            return num1;
        }else{
            if(num2 > num1 && num2 > num3){
                return num2;
            }else {
                return num3;
            }
        } 
    }
}
