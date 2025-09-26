/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej13;

/**
 *
 * @author Jennifer
 */
public class GeneradorQR {
    public void generar(String valor, Usuario user) {
        //Instanciamos CodigoQR - Relacion de creacion
        CodigoQR qr =new CodigoQR(valor);
        
        // Asociamos el Usuario
        qr.setUser(user);
        
        System.out.println("QR generado: " + qr);
    }
}
