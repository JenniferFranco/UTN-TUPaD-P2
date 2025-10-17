/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej1_ECommerce;

/**
 *
 * @author Jennifer
 */
public class SistemaECommerce {
    public static void main(String[] args) {
        
        //Instanciamos cliente
        Cliente cliente1 = new Cliente("Juan Rey", "juanrey@gmail.com");
        
        //Instanciamos pedidos
        Pedido pedido1 = new Pedido(cliente1);
        
        //Agregamos productos
        pedido1.agregarProducto(new Producto("Celular", 500.5));
        pedido1.agregarProducto(new Producto("Tablet", 700));
        
        //Calcular total
        double totalPedido = pedido1.calcularTotal();
        System.out.println("TOTAL DEL PEDIDO: $" + String.format("%.2f", totalPedido));
        
        // Se usa el Enum para cambiar el estado.
        pedido1.cambiarEstado(EstadoPedido.PREPARADO);
        
        //Instanciamos metodos de pagos
        Pago metodoTC = new TarjetaCredito("123456788");
        PagoConDescuento metodoPP = new PayPal(cliente1.getEmail());
        
        //Procesamos el pago
        System.out.println("--- Opción 1: Tarjeta de Crédito ---");
        metodoTC.procesarPago(totalPedido);
        
        System.out.println("--- Opción 2: PayPal ---");
        totalPedido = metodoPP.aplicarDescuento(totalPedido, 7);
         metodoPP.procesarPago(totalPedido);
        
        //Finalizamos el pedido 
        pedido1.cambiarEstado(EstadoPedido.ENVIADO);
        
        
    }
}
