/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej6;

/**
 *
 * @author Jennifer
 */
public class Main {
     public static void main(String[] args) {
         //Instanciamos mesa
         Mesa mesa = new Mesa("34", 4);
         
         //Instanciamos reserva pasando mesa como atributo
         Reserva reserva = new Reserva("31-10-2025", "20:00", mesa);
         
         //Instanciamos cliente
         Cliente cliente = new Cliente("Juan Rey", "1145678934");
         
         // Vinculamos cliente con reserva
         reserva.setCliente(cliente);
         
         //Mostramos los datos
         System.out.println(mesa);
         System.out.println("");
         
         System.out.println(cliente);
          System.out.println("");
          
         System.out.println(reserva);
     }
    
}
