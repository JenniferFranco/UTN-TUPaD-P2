/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp4;

public class Tp4 {

    public static void main(String[] args) {
        
        // Mostrar total de empleados antes de empezar
        System.out.println("Total de empleados: " + Empleado.mostrarTotalEmpleados());
        
        // Crear empleados con diferentes constructores
        Empleado empleado1 = new Empleado(100, "Juan Perez", "Analista", 3000);
        Empleado empleado2 = new Empleado("Ana Maria", "Gerente");
        Empleado empleado3 = new Empleado("Jennifer Franco", "Desarrolladora");
        
        // Mostrar empleados
         System.out.println(empleado1);
         System.out.println(empleado2);
         System.out.println(empleado3);
          
         //Aplicar aumentos de salario
         empleado1.actualizarSalario(2.5); // aumento del 2.5%
         empleado2.actualizarSalario(5.0); // aumento del 5%
         empleado3.actualizarSalario(3000); //aumento fijo de 3000
         
         System.out.println("Salarios de los empleados despues del aumento");
          // Mostrar empleados con salarios actualizados
         System.out.println(empleado1);
         System.out.println(empleado2);
         System.out.println(empleado3);
        
        // Mostrar total de empleados
        System.out.println("Total de empleados: " + Empleado.mostrarTotalEmpleados());
    }
    
}
