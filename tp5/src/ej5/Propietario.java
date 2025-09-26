/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej5;

/**
 *
 * @author Jennifer
 */
public class Propietario {
    
    //Atributos
    private String nombre;
    private String dni;
    private Computadora computadora; //Asociación bidireccional
    
    //Constructor
    public Propietario(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Computadora getComputadora() {
        return computadora;
    }

     //Agregamos validación para la asoción bidireccional con Computadora
    public void setComputadora(Computadora computadora) {
        this.computadora = computadora;
        if(computadora != null && computadora.getPropietario() != this){
            computadora.setPropietario(this);
        }
     }
    
    //Método toString
    @Override
    public String toString() {
        return "Propietario{" + "nombre=" + nombre + ", dni=" + dni + ", computadora=" + computadora + '}';
    }
    
}
    
