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
public class DescuentoEspecial {
    
    //variable global
    static final double DESCUENTO_ESPECIAL= 0.10;
    
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         
         //solicitar el precio del producto
         System.out.println("Ingrese el precio del producto: ");
         double precio = Integer.parseInt(input.nextLine());
         
         //mostrar el descuento especial y precio final
         calcularDescuentoEspecial( precio);
         
       
    }
     
     static void calcularDescuentoEspecial(double precio) {
         double descuentoAplicado = precio * DESCUENTO_ESPECIAL;
         double precio_final = precio - descuentoAplicado;
         
         System.out.println("El descuento especial aplicado es: " + DESCUENTO_ESPECIAL);
         System.out.println("El precio final con descuento es: " + precio_final );
         
     }
}
