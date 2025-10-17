/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej1_ECommerce;

/**
 *
 * @author Jennifer
 */
public class PayPal implements PagoConDescuento {
    
    //ATRIBUTO
    private String email;
    
    //CONSTRUCTOR
    public PayPal(String email) {
        this.email = email;
    }

     //IMPLEMENTACIÓN MÉTODOS ABSTRACTOS
    @Override
    public double aplicarDescuento(double monto, int  descuento) {
        if (descuento < 0 || descuento > 100) {
            System.out.println("Porcentaje de descuento inválido. No se aplica descuento.");
            return monto;
        }
       return monto * (1 - (descuento / 100.0));
    }

    @Override
    public void procesarPago(double monto) {
         System.out.println("Procesando el pago por... $ " + monto);
         System.out.println("Pago con PayPal Aprobado.");
  
    }
    
}
