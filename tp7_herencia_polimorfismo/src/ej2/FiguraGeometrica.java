/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej2;

/**
 *
 * @author Jennifer
 */
public abstract class FiguraGeometrica {
    
    //ATRIBUTO
    private String  nombre;
    
    //CONSTRUCTOR
    public FiguraGeometrica(String nombre) {    
        this.nombre = nombre;
    } 
    
    //GETTER
    public String getNombre() {
        return nombre;
    }
    

    //MÉTODOS
    public abstract double calcularArea(); 
    
}
