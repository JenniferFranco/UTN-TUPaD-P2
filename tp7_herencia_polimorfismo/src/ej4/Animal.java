/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej4;

/**
 *
 * @author Jennifer
 */
public class Animal {
    //ATRIBUTOS
    private String nombre;
    private String especie;
    private double peso;
    private String tipoAlimentacion;
    
    //CONSTRUCTOR 
    public Animal(String nombre, String especie, double peso, String tipoAlimentacion) {
        this.nombre = nombre;
        this.especie = especie;
        this.peso = peso;
        this.tipoAlimentacion = tipoAlimentacion;
    }
    
    //GETTER
    public String getNombre() {return nombre;}

    public String getEspecie() {return especie;}
    
    //MÉTODOS
    
     // Método que será sobrescrito por las subclases
   public void hacerSonido() {
       System.out.println("El animal hace un sonido.");
   }
   
   // Método que usa el método polimórfico
   public void describirAnimal() {
       System.out.println(this);  
   }

    //TO STRING
    @Override
    public String toString() {
        return "Animal de " + "especie=" + especie + ", peso=" + peso + ", tipoAlimentacion=" + tipoAlimentacion;
    }
   
}
