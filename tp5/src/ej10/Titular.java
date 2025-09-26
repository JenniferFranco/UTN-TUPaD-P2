/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej10;

/**
 *
 * @author Jennifer
 */
public class Titular {
     //Atributos nombre, dni
    private String nombre;
    private String dni;
    private CuentaBancaria cuentaBancaria; //Asociación bidireccional
    
     // Constructor 
    public Titular(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }
    
    //Getters and setters
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

    public CuentaBancaria getCuentaBancaria() {
        return cuentaBancaria;
    }
    
     //Agregamos validación para la asoción bidireccional con cuentaBancaria
    public void setCuentaBancaria(CuentaBancaria cuentaBancaria) {
        this.cuentaBancaria = cuentaBancaria;
        if(cuentaBancaria != null && cuentaBancaria.getTitular() != this){
            cuentaBancaria.setTitular(this);
        }
    }
    
    //Método toString
    @Override
    public String toString() {
        return "Titular{" + "nombre=" + nombre + ", dni=" + dni + ", CBU de la cuentaBancaria=" + this.cuentaBancaria.getCbu() + '}';
    }

}
