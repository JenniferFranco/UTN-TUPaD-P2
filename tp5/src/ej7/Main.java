/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej7;

/**
 *
 * @author Jennifer
 */
public class Main {
     public static void main(String[] args) {
          //Instanciamos motor
          Motor motor = new Motor("Naftero", "MTR-2023-45721");
          
          //Instanciamos vehiculo pasando motor como atributo
         Vehiculo vehiculo = new Vehiculo("AB1234NM", "Fiat", motor);
         
         //Instanciamos conductor
         Conductor conductor = new Conductor("Juan Rey", "02-12345678");
         
         // Vinculamos conductor con vehiculo 
         conductor.setVehiculo(vehiculo);
         
         //Mostramos los datos
         System.out.println(motor);
         System.out.println("");
        
         System.out.println(conductor);
         System.out.println("");
         
         System.out.println(vehiculo);
         System.out.println("");
         
     }
    
}
