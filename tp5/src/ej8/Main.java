/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej8;

/**
 *
 * @author Jennifer
 */
public class Main {
     public static void main(String[] args) {
         
         //Instanciamos usuario
         Usuario user = new Usuario("Juan Rey", "juanrey@gmail.com");
         
          //Instanciamos documento pasando los atributos para instanciar firmaDigital y vinculamos con FirmaDigrital  Usuario
          Documento documento  = new Documento("Contrato de alquiler", "Condiciones de alquiler", "A9F3B7C4D8E1", "30-09-2025", user);
         
         //Mostramos los datos
         System.out.println(user);
         System.out.println("");
         
         System.out.println(documento);
         System.out.println("");
          
         documento.mostrarFirma();
     }
    
}
