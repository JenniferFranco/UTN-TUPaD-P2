/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej1;

public class Titular {
    //Atributos
    private  String nombre;
    private String dni;
    private Pasaporte pasaporte; // Asociación bidireccional
    
    //Constructor
    public Titular(String nombre, String dni) {
        this.nombre= nombre;
        this.dni = dni;
    }
    
    //Getters and Setters
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
    
    public Pasaporte getPasaporte() {
        return pasaporte;
    }

    //Agregamos validación para la asoción bidireccional con Pasaporte
    public void setPasaporte(Pasaporte pasaporte) {
    this.pasaporte = pasaporte;
    if (pasaporte != null && pasaporte.getTitular() != this) {
        pasaporte.setTitular(this);
    }
}
    //Método toString
    @Override
    public String toString() {
        return "Titular{" + "nombre=" + nombre + ", dni=" + dni + ", número de pasaporte=" + pasaporte.getNumero() + '}';
    }
     
    
}

