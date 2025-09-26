/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej12;

/**
 *
 * @author Jennifer
 */
public class Main {
    public static void main(String[] args) {
        //Instanciamos constribuyente
        Contribuyente contribuyente = new Contribuyente("Juan Rey", "23-45645678-0" );
        
        //Instanciamos Impuesto
        Impuesto impuesto = new Impuesto(3500.00);
        
        // Asociamos contribuyente con impuesto 
        impuesto.setContribuyente(contribuyente);
        
        //Instanciamos calculadora
        Calculadora calculadora = new Calculadora();
        
        //Mostramos los datos
        System.out.println(impuesto);
        System.out.println("");
        
        System.out.println(contribuyente);
        System.out.println("");
        
        //Llamamos al método calcular
        calculadora.calcular(impuesto);
    }
}
