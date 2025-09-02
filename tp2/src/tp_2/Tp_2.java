/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp_2;

import java.util.Scanner;

/**
 *
 * @author Jennifer
 */
public class Tp_2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //declaración de variables
        int num;
        
        //solicito al usuario el num
        System.out.println("Ingrese un año: ");
        num = Integer.parseInt(input.nextLine());
        
        //Comparacion si es bisisesto
        if(esBisiesto(num)){
                System.out.println("El año " + num + " es bisiesto");
        
        } else {
            System.out.println("El año " + num + " no es bisiesto");
        }
        }
    
      //Funcion para la logica de calcular si es bisiesto
    static boolean esBisiesto (int num) {
        return ((num%4 == 0 && num%100!=0) || num%400 == 0);
    }
    }
    
