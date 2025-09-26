/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej7;

/**
 *
 * @author Jennifer
 */
public class Motor {
    //Atributos 
    private String tipo;
    private String numeroSerie;
    
    // Constructor
    public Motor(String tipo, String numeroSerie) {    
        this.tipo = tipo;
        this.numeroSerie = numeroSerie;
    }
    
//Getters and setters
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }
    
    //Método toString
    @Override
    public String toString() {
        return "Motor{" + "tipo=" + tipo + ", numeroSerie=" + numeroSerie + '}';
    }
   
    
    
}
