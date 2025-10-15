/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej1;

/**
 *
 * @author Jennifer
 */
public class Main {
    public static void main(String[] args) {
        // 1. Instanciar un auto
        Auto miAuto = new Auto(4, "Ford", "Focus");

        // 2. Mostrar su información completa
        System.out.println("Información del auto:");
        miAuto.mostrarInfo();
    }
}
