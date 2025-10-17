/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ej1_ECommerce;

/**
 *
 * @author Jennifer
 */
public interface PagoConDescuento extends Pago {
    
    //MÉTODOS
    double aplicarDescuento(double monto, int descuento);
}
