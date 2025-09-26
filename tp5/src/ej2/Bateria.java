/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej2;

/**
 *
 * @author Jennifer
 */
public class Bateria {
    
    //Atributos
    private String modelo;
    private int capacidad; //mAh
     
    //Constructor
    public Bateria(String modelo, int capacidad) {
        this.modelo = modelo;
        this.capacidad = capacidad;
    }
    
    //Getters and Setters
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
    
     //Método toString
    @Override
    public String toString() {
        return "Bateria{" + "modelo=" + modelo + ", capacidad=" + capacidad + '}';
    }
    
    
}

