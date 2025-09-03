/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp4;

public class Empleado {
    
    //Atributos
    private int id;
    private String nombre;
    private String puesto;
    private double salario;
    private static int totalEmpleados = 0;

    //Constructor recibe todos los atributos como parámetros
    public Empleado(int id, String nombre, String puesto, double salario) {
        totalEmpleados ++;
        this.id =  id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
    }
    
     //Constructor recibe nombre y  puesto
    public Empleado(String nombre, String puesto) {
        this(totalEmpleados, nombre, puesto, 5000);
    }
    
    //Métodos sobrecargados  para actualizar el Salario: 
    
    //recibe un porcentaje de aumento
    public void actualizarSalario( double aumento){
        this.salario += this.salario * aumento / 100;
    }
    //recibe una cantidad fija a aumentar.
    public void actualizarSalario (int aumento){
          this.salario += aumento;
    }
            
   //Retornar el total de empleados creados hasta el momento
    public static int mostrarTotalEmpleados() {
        return totalEmpleados;
    }
    

    @Override
    public String toString() {
        return "Empleado{" + "id=" + id + ", nombre=" + nombre + ", puesto=" + puesto + ", salario=" + salario + '}';
    }
    
    
    
}
