/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej1_ECommerce;

import java.util.ArrayList;

/**
 *
 * @author Jennifer
 */
public class Pedido implements Pagable {
    //ATRIBUTOS
    private ArrayList<Producto>productos;
    private Notificable cliente; 
    private EstadoPedido estado;

    //CONSTRUCTOR
    public Pedido(Notificable cliente) {
        this.productos  = new ArrayList<>();
        this.cliente = cliente;
        this.estado = estado.CREADO; //valor inicial para estado
        
        
        this.cliente.notificar("Estado del pedido: " + this.estado);
    }
    
    //MÉTODOS
    public void agregarProducto(Producto p){
        productos.add(p);
        System.out.println(p.getNombre() + " agregado al pedido.");
    }
    
    public void cambiarEstado(EstadoPedido nuevoEstado){
        this.estado = nuevoEstado;
        
        // El enum se convierte a String automáticamente (ej: "PREPARADO")
        this.cliente.notificar("El estado de tu pedido cambió a: " + this.estado);
    
    }
    
    //IMPLEMENTACIÓN MÉTODO ABSTRACTO
    @Override
    public double calcularTotal() {
        double total = 0;
        for (Producto p : productos) {
            total += p.calcularTotal();
        }
        return total;
    }
    
}
