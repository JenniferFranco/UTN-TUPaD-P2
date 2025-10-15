/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej1;

/**
 *
 * @author Jennifer
 */
public class Auto extends Vehiculo{
    
    //ATRIBUTOS
     private int cantidadPuertas;
     
    //CONSTRUCTOR
    public Auto(int cantidadPuertas, String marca, String modelo) {
        // Llama al constructor de la clase padre (Vehiculo)
        super(marca, modelo);
        this.cantidadPuertas = cantidadPuertas;
    }
   
    //TO STRING
    @Override
    public String toString() {
        return super.toString() + ", Cantidad de Puertas=" + cantidadPuertas;
    }
   
}
