/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej3;

/**
 *
 * @author Jennifer
 */
public class EmpleadoTemporal extends Empleado{
     //ATRIBUTOS
    private double precioPorHora;
    private int horasTrabajadas;
    
    //CONSTRUCTOR
    
    public EmpleadoTemporal(double precioPorHora, int horasTrabajadas, String nombre, String legajo, String departamento) {
        // Llama al constructor de la clase padre (Empleado)
        super(nombre, legajo, departamento);
        this.precioPorHora = precioPorHora;
        this.horasTrabajadas = horasTrabajadas;
    }

    @Override
    public double calcularSueldo() {
        return precioPorHora * horasTrabajadas;
    }
}
