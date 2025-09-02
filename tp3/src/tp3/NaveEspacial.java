/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3;

public class NaveEspacial {
    //Atributos
    private String nombre;
    private int combustible;
    private final int MAX_COMBUSTIBLE  = 100;
    
    //Constructor 
    public NaveEspacial (String nombre, int combustible){
        this.nombre = nombre;
        this.combustible = combustible;
    }
    
    public void despegar(){
        if (combustible >= 60){
            combustible -= 60;
            System.out.println("La nave " + nombre + " esta despegando." + " Combustible: " + combustible);
        } else {
            System.out.println("No hay suficiente combustible para despegar.");
        }
        
    }
   
     public void  avanzar(int distancia) {
        if (combustible >= distancia) {  // consumo 1 a 1
            combustible -= distancia;
            System.out.println(nombre + " avanzó " + distancia + " unidades.");
        } else {
            System.out.println(nombre + " no tiene suficiente combustible para avanzar.");
        }
    }
    
    public void  recargarCombustible( int cantidad) {
        if ((combustible + cantidad) > MAX_COMBUSTIBLE) {
            combustible = MAX_COMBUSTIBLE;
            System.out.println("Tanque lleno al máximo (" + MAX_COMBUSTIBLE + ").");
        } else {
            combustible += cantidad;
            System.out.println("Se recargaron " + cantidad + " unidades. Combustible actual: " + combustible);
        }
    }

        // Mostrar estado de la nave
    public void mostrarEstado() {
        System.out.println("\n--- Estado de la nave ---");
        System.out.println("Nombre: " + nombre);
        System.out.println("Combustible: " + combustible + "/" + MAX_COMBUSTIBLE);
    }
}
