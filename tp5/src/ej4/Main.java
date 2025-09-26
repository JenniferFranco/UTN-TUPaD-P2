/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej4;

/**
 *
 * @author Jennifer
 */
public class Main {
     public static void main(String[] args) {
    //Instanciamos Banco
    Banco banco = new Banco("Galicia", "257845670");
    
    //Instanciamos TarjetaDeCredito
    TarjetaDeCredito tarjeta1 = new TarjetaDeCredito("345673245", "09-2031", banco);
    
    //Instanciamos Cliente
    Cliente cliente1 = new Cliente("Juan Perez", "23456789");
    
    // Vinculamos cliente con tarjeta
    cliente1.setTarjeta(tarjeta1);
    
    //Mostramos los datos     
    System.out.println(cliente1);
    System.out.println(tarjeta1);
    System.out.println(banco);
   
    }
}
