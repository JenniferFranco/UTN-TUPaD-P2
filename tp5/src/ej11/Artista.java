/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej11;

/**
 *
 * @author Jennifer
 */
public class Artista {
     //Atributos
    private String nombre;
    private String genero;
    
    // Constructor 
    public Artista(String nombre, String genero) {
        this.nombre = nombre;
        this.genero = genero;
    }
    
    //Getters and setters
     public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

     //Método toString
    @Override
    public String toString() {
        return "Artista{" + "nombre=" + nombre + ", genero=" + genero + '}';
    }

   
    
}
