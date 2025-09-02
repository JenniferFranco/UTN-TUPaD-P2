/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp_2;

/**
 *
 * @author Jennifer
 */
public class ArrayPrecios {
     public static void main(String[] args) {
    
    //Declarar e inicializar el array
    double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99 };
    
    //Mostrar valores originales con for-each
    System.out.println("Precios originales:");
    for(  double precio : precios)  {
         System.out.println("Precio: $ " + precio);
    }
    
   // Modificar el precio de un producto específico
   precios[2] = 129.99;
   
    //Mostrar valores modificados con for-each
   System.out.println("Precios modificados");
    for(  double precio : precios)  {
         System.out.println("Precio: $ " + precio);
    }
    }
}
