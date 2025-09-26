/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej7;

/**
 *
 * @author Jennifer
 */
public class Conductor {
     //Atributos
    private String nombre;
    private String licencia;
    private Vehiculo vehiculo;//Asociación bidireccional
    
    // Constructor
     public Conductor(String nombre, String licencia) {
        this.nombre = nombre;
        this.licencia = licencia;
    }
    
    //Getters and setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLicencia() {
        return licencia;
    }

    public void setLicencia(String licencia) {
        this.licencia = licencia;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    //Agregamos validación para la asoción bidireccional con Vehiculo
    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
        if(vehiculo  != null && vehiculo.getConductor()!=this ){
            vehiculo.setConductor(this);
        }
    }
    
    //Método toString
    @Override
    public String toString() {
        return "Conductor{" + "nombre=" + nombre + ", licencia=" + licencia + ", modelo del vehiculo=" + this.getVehiculo().getModelo() + ", patente del vehiculo=" 
                + this.getVehiculo().getPatente() +'}';
    }

}
