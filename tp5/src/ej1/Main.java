/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej1;

/**
 *
 * @author Jennifer
 */
public class Main {
     public static void main(String[] args) {
         //Instanciamos titular
         Titular titular= new Titular("Juan Rey", "23567890"); 
         
         //Instanciamos  pasaporte
         Pasaporte pasaporte= new Pasaporte ("123498", "9/9/2025", "fotoDeJuan", "carnet");
         
         //Asociaciamos pasaporte con titular
         pasaporte.setTitular(titular);
         
         //Mostramos los datos
         System.out.println(pasaporte);
         System.out.println("");
         
         System.out.println(titular);
         System.out.println("");
         
         //Llamamos al método mostrarFoto
         pasaporte.mostrarFoto();
    }
    
}

