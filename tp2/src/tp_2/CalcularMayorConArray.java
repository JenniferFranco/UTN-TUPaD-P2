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
public class CalcularMayorConArray {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
         int[] nums ={ solicitarNum("primer", input),
               solicitarNum("segundo", input),
               solicitarNum("tercer", input) };

         int  mayor = calcularMayor (nums);
         System.out.println("El número mayor es: " + mayor);  
        
    }
         //Funcion para solicitar numero
    static int solicitarNum (String orden, Scanner input){
        System.out.print("Ingrese el " + orden + " número: ");
        int  num = Integer.parseInt(input.nextLine());
        return num; 
     }
    
    //Funcion para calcular el mayor recorriendo un array
    static int calcularMayor (int[] nums){
        int mayor = nums[0]; 
        for(int i=0; i<nums.length; i++){
           if(nums[i]>mayor){
               mayor = nums[i];
           } 
        } return mayor;
    }
}

    
    