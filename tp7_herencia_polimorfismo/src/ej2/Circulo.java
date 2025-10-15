/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej2;
/**
 *
 * @author Jennifer
 */
public class Circulo extends FiguraGeometrica {
    
    //ATRIBUTOS
    private double radio;
            
    public Circulo(String nombre, double radio) {
        // Llama al constructor de la clase padre (FiguraGeometrica)
        super(nombre);
        this.radio=radio;
    }
    
     // Implementación obligatoria del método abstracto
    @Override
    public double calcularArea() {
       return Math.PI * radio * radio;
    }
    
    
}
