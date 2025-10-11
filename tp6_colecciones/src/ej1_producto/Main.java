/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej1_producto;

/**
 *
 * @author Jennifer
 */
public class Main {
    public static void main(String[] args) {
        
  //Instanciar inventario
    Inventario inventario = new  Inventario();
    
 //Instanciar productos
    Producto p1 = new Producto("ABC-123", "Campera", 25000.5, 5, CategoriaProducto.ROPA);
    Producto p2 = new Producto("JKL-345", "Arroz", 1000.0, 30, CategoriaProducto.ALIMENTOS);
    Producto p3 = new Producto("WRT-537", "Heladera", 75000.5, 2, CategoriaProducto.ELECTRONICA);
    Producto p4 = new Producto("PLK-678", "Remera", 5000.3, 13, CategoriaProducto.ROPA);
    Producto p5 = new Producto("ZVE-689", "Mantel", 7000.4, 9, CategoriaProducto.HOGAR);
    
 //Agregar productos al inventario.    
    inventario.agregarProducto(p1);
    inventario.agregarProducto(p2);
    inventario.agregarProducto(p3);
    inventario.agregarProducto(p4);
    inventario.agregarProducto(p5);
    
    System.out.println("");
    
// Listar todos los productos mostrando su información y categoría. 
    inventario.listarProductos();
     System.out.println("");
     
//Buscar un producto por ID y mostrar su información. 
    System.out.println("El producto es:  " + inventario.buscarProductoPorId("WRT-537"));
     System.out.println("");
    
//Filtrar y mostrar productos que pertenezcan a una categoría específica. 
      System.out.println("Los productos que pertenecen a la categoría son: ");
     System.out.println(inventario.filtrarPorCategoria(CategoriaProducto.ROPA));
    
    System.out.println("");
    
// Eliminar un producto por su ID 
    inventario.eliminarProducto("ZVE-689");
    System.out.println("");
    
//LIstar los productos restantes.
    inventario.listarProductos();
    System.out.println("");
    
//Actualizar el stock de un producto existente. 
 inventario.actualizarStock("JKL-345", 45);
 System.out.println("");
    
//Mostrar el total de stock disponible. 
    int stock =inventario.obtenerTotalStock();
     mostrarStock(stock);
     System.out.println("");
   
//Obtener y mostrar el producto con mayor stock. 
    System.out.println("El producto con mayor stock es: " + inventario.obtenerProductoConMayorStock().getNombre());
    System.out.println("");

//Filtrar productos con precios entre $1000 y $3000. 
     inventario.filtrarProductosPorPrecio(1000, 3000);
     
//Mostrar las categorías disponibles con sus descripciones. 
     inventario.mostrarCategoriasDisponibles();
}
    
    //MÉTODOS
    static void mostrarStock(int total){
        if( total>0){
             System.out.println("El stock disponible es: " + total);
        } else{
             System.out.println("No hay stock disponible. ");
        }
}
    
   
}
    
    
  

