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
public class CalcularCostoEnvio {
   
      public static void main(String[] args) {
           Scanner input = new Scanner(System.in);
           
           //declaracion de variables
           double precio, peso,costo, total  ;
           String zona;
                   
           //solicitar el precio
           System.out.println("Ingrese el precio del producto: ");
           precio = Double.parseDouble(input.nextLine());
           
           //solicitar el peso
           System.out.println("Ingrese el peso del paquete en kg: ");
           peso = Double.parseDouble(input.nextLine());
           
           //solicitar la zona
            do {
            System.out.print("Ingrese la zona de envío (Nacional/Internacional): ");
            zona = input.nextLine();
            if (!zona.equalsIgnoreCase("nacional") && !zona.equalsIgnoreCase("internacional")) {
                System.out.println("Zona no válida. Intente nuevamente.");
            }
        } while (!zona.equalsIgnoreCase("nacional") && !zona.equalsIgnoreCase("internacional"));
           
            //calcular el costo de envío
            costo = calcularCostoEnvio( peso, zona);
           System.out.printf("El costo de envío es: %.2f\n", costo);
           
           //calcular total a pagar
           total = calcularTotalCompra(precio, costo);
           System.out.printf("El total a pagar es: %.2f\n", total);
      }
      
      static double calcularCostoEnvio(double peso, String zona){
          double costo = 0; //valor por defecto
          if (zona.equalsIgnoreCase("nacional")){
              costo = 5 * peso;
          }else if (zona.equalsIgnoreCase("internacional")) {
               costo = 10 * peso;  
          } else {
              System.out.println("Zona no valida");
          }
          return costo;
      }
    
      
       static double calcularTotalCompra(double precioProducto, double costoEnvio){
           return precioProducto + costoEnvio; 
       }
      
}
