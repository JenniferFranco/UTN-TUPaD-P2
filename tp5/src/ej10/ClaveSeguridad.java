/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej10;

/**
 *
 * @author Jennifer
 */
public class ClaveSeguridad {
    //Atributos
    private String codigo;
    private String ultimaModificacion;
    
     // Constructor 
     public ClaveSeguridad(String codigo, String ultimaModificacion) {
        this.codigo = codigo;
        this.ultimaModificacion = ultimaModificacion;
    }
     
    //Método toString
    @Override
    public String toString() {
        return "ClaveSeguridad{" + "codigo=" + codigo + ", ultimaModificacion=" + ultimaModificacion + '}';
    }

   
}
