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
public class CalcularPrecioFinal {
      public static void main(String[] args) {
           Scanner input = new Scanner(System.in);
           
           //declaracion de variables
           double precioBase, descuento, impuesto, precioFinal;
           
           //solicitar precio base
           System.out.println("Ingrese el precio base del producto: ");
           precioBase = Double.parseDouble(input.nextLine());
           
           //solicitar impuesto
           System.out.println("Ingrese el impuesto en porcentaje (Ejemplo: 10 para 10%): ");
           descuento = Double.parseDouble(input.nextLine());
           
           //Solicitar descuento
           System.out.println("Ingrese el descuento en porcentaje (Ejemplo: 5 para 5%):");
           impuesto = Double.parseDouble(input.nextLine());
          
           //calcular precio final
           precioFinal = calcularPrecioFinal(precioBase, descuento, impuesto);
           System.out.println("El precio final del producto es: " + precioFinal);
      }
  static double calcularPrecioFinal(double precioBase, double impuesto, double descuento) {
      double precioFinal =  precioBase + (precioBase* (impuesto/100)) - (precioBase*(descuento/100));
      return precioFinal; 
  }
}
