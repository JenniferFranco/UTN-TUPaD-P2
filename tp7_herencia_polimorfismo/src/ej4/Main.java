/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej4;

import java.util.ArrayList;

/**
 *
 * @author Jennifer
 */
public class Main {
    public static void main(String[] args) {
        
        //Creamos una lista de animales
        ArrayList<Animal> animales = new ArrayList<>();
        
        //Añadimos animales a la lista con el método .add()
        animales.add(new Perro("Booby", "perro", 25.5, "omnivora", "bulldog francés"));
        animales.add(new Perro("Mancha", "perro", 50.7, "omnivora", "dogo"));
        animales.add(new Gato("Sensei", "gato", 15, "omnivora"));
        animales.add(new Vaca("Lola", "vaca", 88, "hervibora"));
        
        
        //Llamamos al método describirAnimal()
        for (Animal a: animales){
            System.out.println("--- Ficha de " + a.getNombre()+ " ---");
            a.describirAnimal();
            System.out.println();
        }
        
        //Llamamos al método  hacerSonido()
        for (Animal a: animales){
              System.out.println(a.getEspecie() + " hace... ");
            a.hacerSonido();
            System.out.println();
        }
        
    }
}
