/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej1_ECommerce;

/**
 *
 * @author Jennifer
 */
public class Producto implements Pagable {
    //ATRIBUTOS
    private String nombre;
    private double precio;
    
    //CONSTRUCTOR
    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }
    
    //GETTERS
    public double getPrecio() {  return precio;  }

    public String getNombre() {return nombre;}
    

    //IMPLEMENTACIÓN MÉTODO ABSTRACTO
    @Override
    public double calcularTotal() {
        return this.precio; //El total de un producto es su propio precio
    }
    
    //TO STRING
    @Override
    public String toString() {
        return nombre + " - $" + precio;
    }
}
