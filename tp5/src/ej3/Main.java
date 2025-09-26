/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej3;

/**
 *
 * @author Jennifer
 */
public class Main {
     public static void main(String[] args) {
         
         //Instanciamos autor
        Autor autor = new Autor("Gabriel García Márquez", "Colombiana");
        
         //Instanciamos editorial
        Editorial editorial = new Editorial("Sudamericana", "Buenos Aires");

        //Instanciamos libro
        Libro libro = new Libro("Cien años de soledad", "123", editorial);
        
         //Asociaciamos autor con libro
         libro.setAutor(autor);
        
        //Mostramos los datos
         System.out.println(autor); 
         System.out.println("");
          
         System.out.println(editorial);  
         System.out.println("");
         
         System.out.println(libro);  
        
        
    }
}
