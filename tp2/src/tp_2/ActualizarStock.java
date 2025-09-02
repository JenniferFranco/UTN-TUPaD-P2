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
public class ActualizarStock {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         
         //declaracion de variables
         int stock, cant_vendida, cant_recibida;
         
         //solicitar el stock actual
         System.out.println("Ingrese el stock actual del producto: ");
         stock = Integer.parseInt(input.nextLine());
         
         //solicitar la cantidad vendida
         System.out.println("Ingrese la cantidad vendida: ");
         cant_vendida = Integer.parseInt(input.nextLine());
         
         //solicitar la cantidad recibida
         System.out.println("Ingrese la cantidad recibida: ");
         cant_recibida = Integer.parseInt(input.nextLine());
         
         stock = actualizarStock( stock , cant_vendida, cant_recibida );
         System.out.println("El nuevo stock del producto es: " + stock);
   
     }
     
    static int actualizarStock(int stockActual, int cantidadVendida, int cantidadRecibida){
        return stockActual - cantidadVendida + cantidadRecibida;
    }
}
