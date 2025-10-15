/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej3;

import java.util.ArrayList;

/**
 *
 * @author Jennifer
 */
public class Main {
    public static void main(String[] args) {
        
        //Creamos una lista de empleados
        ArrayList <Empleado> empleados = new ArrayList<>();
        
        //Agregamos empleados con el método .add()
        empleados.add(new EmpleadoPlanta(750000, 15000.5, "Juan Rey", "000123", "Producción"));
        empleados.add(new EmpleadoTemporal(5000, 25, "Ana Peréz", "000124", "Eventos"));
        empleados.add(new EmpleadoTemporal(5000, 12, "María García", "000125", "Eventos"));
        
       
       //Invocar calcularSueldo() polimórficamente
       for (Empleado e : empleados) {
           System.out.println("El salario del empleado/a " + e.getNombre() +" es: $ " + e.calcularSueldo()); 
       }
       
       //Llamamos al método clasificarEmpleados
       clasificarEmpleados(empleados);
       
    }
    // Método para clasificar empleados con instanceof
    public static void clasificarEmpleados (ArrayList <Empleado>empleados){
        int contadorPlanta = 0;
        int contadorTemporal = 0;
        
        for (Empleado e : empleados){
        if (e instanceof EmpleadoPlanta) {
                contadorPlanta++;
            } else if (e instanceof EmpleadoTemporal) {
                contadorTemporal++;
            }
         }
        System.out.println("Total de empleados de Planta: " + contadorPlanta);
        System.out.println("Total de empleados Temporales: " + contadorTemporal);
        }
    
}
