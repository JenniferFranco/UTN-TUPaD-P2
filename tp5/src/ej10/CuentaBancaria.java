/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej10;

/**
 *
 * @author Jennifer
 */
public class CuentaBancaria {
     //Atributos
    private String cbu;
    private double saldo;
    private Titular titular; // Asociación bidireccional
    private ClaveSeguridad clave; // Composición
    
     // Constructor 
      public CuentaBancaria(String cbu, double saldo, String codigo, String ultimaModificacion) {
        this.cbu = cbu;
        this.saldo = saldo;
        //Creamos ClaveSeguridad junto a CuentaBancaria
        this.clave = new ClaveSeguridad(codigo,ultimaModificacion);
    }
      
    //Getters and setters
    public String getCbu() {
        return cbu;
    }

    public void setCbu(String cbu) {
        this.cbu = cbu;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Titular getTitular() {
        return titular;
    }

     //Agregamos validación para la asoción bidireccional con Titular
    public void setTitular(Titular titular) {
        this.titular = titular;
        if(titular != null && titular.getCuentaBancaria() != this){
            titular.setCuentaBancaria(this);
        }
    }

    public ClaveSeguridad getClave() {
        return clave;
    }

    public void setClave(ClaveSeguridad clave) {
        this.clave = clave;
    }
    
      //Método para mostrar clave de seguridad
    public void mostrarClave(){
        System.out.println("La clave de seguridad de la cuenta es: " + this.getClave() );
    }
    
    //Método toString
    @Override
    public String toString() {
        return "CuentaBancaria{" + "cbu=" + cbu + ", saldo=" + saldo + ", titular=" + this.titular.getNombre() + ", clave=" + clave + '}';
    }
    
}
