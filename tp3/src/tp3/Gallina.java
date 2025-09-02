/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3;

public class Gallina {
    // Atributos
    private int idGallina;
    private int edad;
    private int huevosPuestos;
    
    //Constructor 
    public Gallina(int idGallina, int edad){
        this.idGallina = idGallina;
        this.edad = edad;
        this.huevosPuestos = 0; // siempre inicia en 0
    }
    
    public void ponerHuevo(){
         huevosPuestos += 1;
         System.out.println("Gallina " + idGallina + " ha puesto un huevo. Total: " + huevosPuestos);
    }
    
    public void envejecer(){
         edad += 1;
         System.out.println("Gallina " + idGallina + " ha envejecido. Ahora tiene " + edad + " años.");
    }
    
    public void mostrarEstado(){
        System.out.println(" \nidGallina: "+ idGallina + " \nEdad: "+ edad + "\nCantidad de huevos puestos: " +  huevosPuestos) ;
    }
  
}
