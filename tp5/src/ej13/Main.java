/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej13;

/**
 *
 * @author Jennifer
 */
public class Main {
    public static void main(String[] args) {
        //Instanciamos usuario
        Usuario user = new Usuario("Juan Rey", "juanrey@gmail.com");
        
        //Instanciamos GeneradorQR
        GeneradorQR generador = new GeneradorQR();
        
          //Mostramos los datos
          System.out.println(user);
          System.out.println("");
          
           //Llamamos al método generar
           generador.generar("12345ABC", user);
    
   }
    
}
