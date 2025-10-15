/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej4;

/**
 *
 * @author Jennifer
 */
public class Gato extends Animal {
    
    public Gato(String nombre, String especie, double peso, String tipoAlimentacion) {
        // Llama al constructor de la clase padre (Animal)
        super(nombre, especie, peso, tipoAlimentacion);
    }
    
    @Override
    public void hacerSonido() {
        System.out.println("¡Miua Miau!");
    }
}
