/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej5;

/**
 *
 * @author Jennifer
 */
public class Main {
    public static void main(String[] args) {
        //Instanciamos computadora pasando los atributos para instanciar PlacaMadre
        Computadora computadora= new Computadora("HP", "5CD1234XYZ", "AORUS AX", "Intel Z690");
        
        //Instanciamos propietario 
        Propietario propietario = new Propietario("Juan Peréz", "23456789");
        
        // Vinculamos propietario con computadora
        propietario.setComputadora(computadora);
        
        //Mostramos los datos
        System.out.println(propietario);
        System.out.println("");
        System.out.println(computadora);
        
        System.out.println("");
        computadora.mostrarPlacaMadre();
    }
    
}
