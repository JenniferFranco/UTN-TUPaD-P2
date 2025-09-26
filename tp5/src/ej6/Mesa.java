/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej6;

/**
 *
 * @author Jennifer
 */
public class Mesa {
    //Atributos
     private String numero; 
     private int capacidad;
     
     //Constructor 
    public Mesa(String numero, int capacidad) {
        this.numero = numero;
        this.capacidad = capacidad;
    }
    
    //Getters and setters
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
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
        return "Mesa{" + "numero=" + numero + ", capacidad=" + capacidad + '}';
    }
    
}
