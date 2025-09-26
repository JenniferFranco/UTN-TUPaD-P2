/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej5;

/**
 *
 * @author Jennifer
 */
public class PlacaMadre {
    //Atributos
    private String modelo;
    private String chipset;
    
    //Constructor
    public PlacaMadre(String modelo, String chipset) {
        this.modelo = modelo;
        this.chipset = chipset;
    }
    
    //Método toString
    @Override
    public String toString() {
        return "PlacaMadre{" + "modelo=" + modelo + ", chipset=" + chipset + '}';
    }
    
}
