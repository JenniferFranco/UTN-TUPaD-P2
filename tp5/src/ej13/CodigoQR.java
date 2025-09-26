/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej13;

/**
 *
 * @author Jennifer
 */
public class CodigoQR {
    //Atributos
    private String valor;
    private Usuario user;
    
    //Constructor
     public CodigoQR(String valor) {
        this.valor = valor;
    }
     
     //Getters and setters
    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public Usuario getUser() {
        return user;
    }

    public void setUser(Usuario user) {
        this.user = user;
    }
    
//Método toString
    @Override
    public String toString() {
        return "CodigoQR{" + "valor=" + valor + ", user=" + user.getNombre() + '}';
    }
   
   
    
}
