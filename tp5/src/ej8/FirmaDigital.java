/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej8;

/**
 *
 * @author Jennifer
 */
public class FirmaDigital {
     //Atributos
    private String codigoHash;
    private String fecha;
    private Usuario user; // Agregación
    
    // Constructor con Usuario para la agregación
     public FirmaDigital(String codigoHash, String fecha, Usuario user) {
        this.codigoHash = codigoHash;
        this.fecha = fecha;
        this.user = user;
    }

    //Método toString
    @Override
    public String toString() {
        return "FirmaDigital{" + "codigoHash=" + codigoHash + '}';
    }
     
     
 }
 
