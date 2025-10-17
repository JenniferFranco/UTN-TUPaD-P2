/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej1_ECommerce;

/**
 *
 * @author Jennifer
 */
public class TarjetaCredito implements Pago{
    //ATRIBUTO
    private String numTarjeta;
    
    //CONSTRUCTOR
    public TarjetaCredito(String numTarjeta) {
        this.numTarjeta = numTarjeta;
    }
    
     //IMPLEMENTACIÓN MÉTODO ABSTRACTO
    @Override
    public void procesarPago(double monto) {
        System.out.println("Procesando el pago por... $ " + monto);
        System.out.println("Pago con Tarjeta Aprobado.");
    }

   
}
