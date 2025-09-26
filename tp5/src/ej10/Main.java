/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej10;

/**
 *
 * @author Jennifer
 */
public class Main {
     public static void main(String[] args) {
    //Instanciamos Titular
    Titular titular = new Titular("Juan Rey", "23456789");
    
    //Instanciamos cuentaBancaria pasando los atributos para instanciar ClaveSeguridad 
    CuentaBancaria cuenta = new CuentaBancaria("345678899064", 56779.40, "abc123", "25-09-2025");
    
    // Vinculamos cuentaBancaria con titular
    cuenta.setTitular(titular);
     
    //Mostramos los datos
    System.out.println(titular);
    System.out.println("");
    
    //Mostramos la claveSeguridad
    cuenta.mostrarClave();
    System.out.println("");
    
    System.out.println(cuenta);
  }       
}
