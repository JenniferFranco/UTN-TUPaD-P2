/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej1_producto;

/**
 *
 * @author Jennifer
 */
public enum  CategoriaProducto {
    ALIMENTOS("Productos comestibles"),
    ELECTRONICA("Dispositivos electrónicos"),  
    ROPA("Prendas de vestir"), 
   HOGAR("Artículos para el hogar");
   
   //ATRIBUTOS
 private final String descripcion;

 // CONSTRUCTOR CON PARAMETRO
 CategoriaProducto(String descripcion) {   
       this.descripcion = descripcion; 
}
   
 //GETTERS
public String getDescripcion() { return descripcion; }

}
