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
public class SumaPares {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int num;
        int suma = 0;
        
        System.out.println("Ingrese un número (0 para terminar): ");
        num = Integer.parseInt(input.nextLine());
        
        while(num!=0){
            if(num%2==0){
                suma += num;
            }
            System.out.println("Ingrese un número (0 para terminar): ");
            num = Integer.parseInt(input.nextLine());
        }
        System.out.println("La suma de los números pares es: " + suma);
    }
}
