/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej12;

/**
 *
 * @author Jennifer
 */
public class Impuesto {
    //Atributos
    private double monto;
    private Contribuyente contribuyente;
    
    //Constructor
    public Impuesto(double monto) {
        this.monto = monto;
    }
    
     //Getters and setters
    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public Contribuyente getContribuyente() {
        return contribuyente;
    }

    public void setContribuyente(Contribuyente contribuyente) {
        this.contribuyente = contribuyente;
    }
    
    //Método toString
    @Override
    public String toString() {
        return "Impuesto{" + "monto=" + monto + ", contribuyente=" + contribuyente.getNombre() + '}';
    }
    
}
