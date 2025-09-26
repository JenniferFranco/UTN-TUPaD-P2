/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej2;

/**
 *
 * @author Jennifer
 */
public class Main {
    public static void main(String[] args) {
         //Instanciamos bateria
        Bateria bateria1 = new Bateria("EB-BGR530BBE", 2600);
        
         //Instanciamos  celular
        Celular cel1 = new Celular("123456789", "Samsung","A23", bateria1);
        
        //Instanciamos  usuario
        Usuario user1 = new Usuario("Juan Rey", "23456789");
        
        //Asociaciamos usuario con celular
        cel1.setUsuario(user1);
        
        //Mostramos los datos
        System.out.println(cel1);
        System.out.println("");
        
        System.out.println(user1);
        System.out.println("");
        
        System.out.println(bateria1);
    }
    
}
