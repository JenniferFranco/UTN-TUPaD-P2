/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej2;

/**
 *
 * @author Jennifer
 */
public class Usuario {
    //Atributos
    private String nombre;
    private String dni;
    private Celular celular; //Asociación bidireccional
    
    //Constructor
    public Usuario(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }
    
    //Getters and Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
      public Celular getCelular() {
        return celular;
    }
   
      //Agregamos validación para la asoción bidireccional con Celular
    public void setCelular(Celular celular) {
        this.celular = celular;
         if (celular  != null && celular.getUsuario() != this) {
            celular.setUsuario(this);
        }
    }
    
     //Método toString

    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", dni=" + dni + ", celular=" + celular.getModelo() + '}';
    }
    
}
