/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej3;

/**
 *
 * @author Jennifer
 */
public class EmpleadoPlanta extends Empleado{  
    
    //ATRIBUTOS
    private double sueldoBase;
    private double bono;
    
    //CONSTRUCTOR
    public EmpleadoPlanta(double sueldoBase, double bono, String nombre, String legajo, String departamento) {
         // Llama al constructor de la clase padre (Empleado)
        super(nombre, legajo, departamento);
        this.sueldoBase = sueldoBase;
        this.bono = bono;
    }
    
 // Implementación obligatoria del método abstracto
    @Override
    public double calcularSueldo() {
       return sueldoBase + bono;
    }
    
}
