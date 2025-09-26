/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej9;

/**
 *
 * @author Jennifer
 */
public class Profesional {
    //Atributos 
    private String nombre; 
    private String especialidad; 
    
    // Constructor 
    public Profesional(String nombre, String especialidad) {
        this.nombre = nombre;
        this.especialidad= especialidad;
    }

    //Getters and setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }
    
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    //Método toString
    @Override
    public String toString() {
        return "Profesional{" + "nombre=" + nombre + ", especialidad=" + especialidad + '}';
    }
    
}
