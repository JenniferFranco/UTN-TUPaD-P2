/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej1_ECommerce;

/**
 *
 * @author Jennifer
 */
public class Cliente implements Notificable {
    //ATRIBUTOS
    private String nombre;
    private String email;
    
    //CONSTRUCTOR 
    public Cliente(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
    }

    //GETTER
    public String getNombre() {  return nombre; }

    public String getEmail() {return email;}
    
    //IMPLEMENTACIÓN MÉTODO ABSTRACTO
    @Override
    public void notificar(String mensaje) {
        System.out.println("Aviso para " +this.nombre + ": " + mensaje);
    }
    
}
