/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej7;

/**
 *
 * @author Jennifer
 */
public class Vehiculo {
     //Atributos 
    private String patente;
    private String modelo;
    private Motor motor; //Agregación
    private Conductor conductor; //Asociación bidireccional
    
    // Constructor
      public Vehiculo(String patente, String modelo, Motor motor) {
        this.patente = patente;
        this.modelo = modelo;
        this.motor = motor;
    }
    
    //Getters and setters
    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Conductor getConductor() {
        return conductor;
    }

  //Agregamos validación para la asoción bidireccional con Conductor
    public void setConductor(Conductor conductor) {
        this.conductor = conductor;
        if(conductor  != null && conductor.getVehiculo ()!=this ){
            conductor.setVehiculo (this);
        }
    }
    
    //Método toString

    @Override
    public String toString() {
        return "Vehiculo{" + "patente=" + patente + ", modelo=" + modelo + ", motor=" + motor + ", conductor=" + this.getConductor().getNombre() + '}';
    }
    
  
}
