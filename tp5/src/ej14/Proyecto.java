/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej14;

/**
 *
 * @author Jennifer
 */
public class Proyecto {
     //Atributos
    private String nombre;
    private double duracionMin;
    
    //Constructor
     public Proyecto(String nombre, double duracionMin) {
        this.nombre = nombre;
        this.duracionMin = duracionMin;
    }
     
    //Getters and setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getDuracionMin() {
        return duracionMin;
    }

    public void setDuracionMin(double duracionMin) {
        this.duracionMin = duracionMin;
    }

    //Método toString
    @Override
    public String toString() {
        return "Proyecto{" + "nombre=" + nombre + ", duracionMin=" + duracionMin + '}';
    }

   
}
