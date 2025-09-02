/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3;

public class Mascota {
    // Atributos
    String nombre;
    String especie;
    int edad;
    
    //Constructor
    public Mascota ( String nombre,  String especie ,int edad){
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
    }
    
    public void mostrarInfo(){
        System.out.println("\nNombre: "+ nombre + " \nEspecie: "+ especie + "\nEdad: " + edad) ;
    }
    
    public void cumplirAnios(){
        edad +=1;
        System.out.println(nombre + " ha cumplido un año más. Ahora tiene " + edad + " años.");
    }
}
