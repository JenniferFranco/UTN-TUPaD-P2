/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej4;

/**
 *
 * @author Jennifer
 */
public class Perro extends Animal{
    
    //ATRIBUTOS
    public String raza;
    
    public Perro(String nombre, String especie, double peso, String tipoAlimentacion, String raza) {
        // Llama al constructor de la clase padre (Animal)
        super(nombre, especie, peso, tipoAlimentacion);
        this.raza=raza;
    }
    
    @Override
    public void hacerSonido() {
        System.out.println("¡Guau Guau!");
    }
    
    @Override
    public void describirAnimal() {
        // Llama al método original del padre para no repetir código
        super.describirAnimal();
        // Añade los detalles específicos de esta clase
        System.out.println("raza: " + raza);
    }
}
