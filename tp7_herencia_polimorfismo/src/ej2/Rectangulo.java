/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej2;

/**
 *
 * @author Jennifer
 */
public class Rectangulo extends FiguraGeometrica {

   //ATRIBUTOS
    private double base;
    private double altura;
    
    //CONSTRUCTOR 
    public Rectangulo(String nombre, double base, double altura) {
        // Llama al constructor de la clase padre (FiguraGeometrica)
        super(nombre);
        this.base = base;
        this.altura = altura;
    }
    
     // Implementación obligatoria del método abstracto
     @Override
    public double calcularArea() {
        return base * altura;
    }
}
