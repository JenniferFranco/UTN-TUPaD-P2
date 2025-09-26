/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej12;

/**
 *
 * @author Jennifer
 */
public class Calculadora {
    public void calcular(Impuesto impuesto){
        System.out.println("La cantidad que debe  abonar  el contribuyente " + impuesto.getContribuyente().getNombre() +
                " es:   " + impuesto.getMonto());
    }
}
