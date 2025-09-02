/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp_2;

/**
 *
 * @author Jennifer
 */
public class ArrayPreciosRecursividad {
      public static void main(String[] args) {
    
    //Declarar e inicializar el array
    double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99 };
    
   //Mostrar valores originales con recursividad
    System.out.println("Precios originales:");
    imprimirRecursivo(precios, 0);
    
     // Modificar el precio de un producto específico
   precios[2] = 129.99;
   
    //Mostrar valores modificados con recursividad
    System.out.println("Precios modificados");
    imprimirRecursivo(precios, 0);
      }

      //Funcion recursiva para recorrer el array
      static void imprimirRecursivo(double[]precios, int indice) {
          // Caso base: el índice llega al tamaño del array
          if(indice == precios.length){
              return;
      }
          //mostrar el elemento actual
         System.out.println("Precio: $" + precios[indice]);
         
        //Paso recursivo: llamar a la función con el índice siguiente
         imprimirRecursivo(precios, indice+1);
      
     }    
}
