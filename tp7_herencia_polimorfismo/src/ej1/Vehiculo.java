/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej1;

/**
 *
 * @author Jennifer
 */
public class Vehiculo {
    
    //ATRIBUTOS
    private String marca;
    private String modelo;
    
    //CONSTRUCTOR 
    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }
    
    
    //MÉTODOS
    public void mostrarInfo(){
        System.out.println(this);
    }

    //TO STRING
    @Override
    public String toString() {
        return  "marca=" + marca + ", modelo=" + modelo ;
    }
    
    
}
