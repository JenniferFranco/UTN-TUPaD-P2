/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej5;

/**
 *
 * @author Jennifer
 */
public class Computadora {
    
    //Atributos 
    private String marca;
    private String numeroSerie;
    private PlacaMadre placaMadre; //Composición
    private Propietario propietario; //Asociación bidireccional

    // Constructor
    public Computadora(String marca, String numeroSerie, String modelo, String chipset) {
        this.marca = marca;
        this.numeroSerie = numeroSerie;
        this.placaMadre = new PlacaMadre (modelo, chipset);
    }
    
    //Getters and setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    //Agregamos validación para la asoción bidireccional con Propietario
    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
        if(propietario != null && propietario.getComputadora() != this){
            propietario.setComputadora(this);
        }
    }

    public PlacaMadre getPlacaMadre() {
        return placaMadre;
    }

    public void setPlacaMadre(PlacaMadre placaMadre) {
        this.placaMadre = placaMadre;
    }
    
    
    //Método para mostrar placaMadre
    public void mostrarPlacaMadre(){
        System.out.println("La placa madre de esta computadora es: " + this.getPlacaMadre());
    }

    //Método toString
    @Override
    public String toString() {
        return "Computadora{" + "marca=" + marca + ", numeroSerie=" + numeroSerie + ", placaMadre=" + placaMadre + '}';
    }
    
}
