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
public class CalculadorDescuento {
     public static void main(String[] args) {
         
         Scanner input = new Scanner(System.in);
         
         //Declaracion de variables
         double precio, precioFinal;
         char categoria;
         String descuento;
         
         //Solicitar al usuario el producto
         System.out.print("Ingrese el precio del producto: ");
         precio = Double.parseDouble(input.nextLine());
         
         //Solicitar al usuario la categoria del producto
         System.out.println("Ingrese la categoria (A:10%, B:15% o C:20%):");
         categoria = input.nextLine().toUpperCase().charAt(0);
         
         //Aplicamos el descuento
         precioFinal = calcularDescuento(precio, categoria);
         
         //Convertimos el descuento para mostralo
         descuento = mostrarDescuento(categoria);
         
         System.out.println("Descuento aplicado: " + descuento);
         System.out.println("Precio final: " + precioFinal);
     }
    
     //Funcion para aplicar el descuento 
    static double calcularDescuento(double precio, char categoria){
         double precioFinal = precio;
         switch(categoria){
         case  'A' -> precioFinal = precio - (precio*0.10);
         case 'B' -> precioFinal  = precio - (precio*0.15);
         case  'C' -> precioFinal  =precio - ( precio*0.20);
         default -> System.out.println("Categoría no válida. No se aplica descuento."); 
     }
         return precioFinal;
     }
    
    //Funcion para converción del descuento
    static String mostrarDescuento(char categoria){
        String descuento = "Categoría no válida"; // valor por defecto
        switch(categoria){
         case  'A' -> descuento = "10%";
         case 'B' -> descuento  = "15%";
         case 'C' -> descuento  = "20%";
         default -> descuento = "Categoría no válida";
    }
        return descuento;
}
}
