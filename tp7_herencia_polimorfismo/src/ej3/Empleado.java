/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej3;

/**
 *
 * @author Jennifer
 */
public abstract class Empleado {
    
    //ATRIBUTOS
    private String nombre;
    private String legajo;
    private String departamento;
    
    //CONSTRUCTOR
    public Empleado(String nombre, String legajo, String departamento) {
        this.nombre = nombre;
        this.legajo = legajo;
        this.departamento = departamento;
    }
    
    //GETTER
    public String getNombre() {
        return nombre;
    }
    
    
    //MÉTODO
    public abstract double calcularSueldo(); 
}
