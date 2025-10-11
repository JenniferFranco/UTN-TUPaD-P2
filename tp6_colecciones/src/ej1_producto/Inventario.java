/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej1_producto;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Jennifer
 */
public class Inventario {
    
     //ATRIBUTOS
    private ArrayList<Producto> productos;
    
    //CONSTRUCTOR --el constructor inicializa una lista vacía--
    public Inventario() {
        this.productos = new ArrayList <>  () ;
    }
    
    //MÉTODOS
public void agregarProducto(Producto p){
    this.productos.add(p);
    System.out.println("Producto '" + p.getNombre() + "' agregado.");
}

public void listarProductos() {
    if(productos.isEmpty()){
        System.out.println("El inventario está vacío.");
        return;
    }
    System.out.println("--- Lista de Productos en Inventario ---");
    for (Producto p: productos)  {
        System.out.println(p);
    }   
}

/* FORMA DE RECORRER ARRAYLIST
public Producto buscarProductoPorId(String id) {
    Producto productoEncontrado = null;
    int i = 0;
    
    // El bucle continúa mientras:
        // 1. El índice 'i' no se haya salido de los límites de la lista.
        // 2. Y (!) el código del producto en la posición 'i' NO sea igual al buscado.
    while (i <this.productos.size() && !this.productos.get(i).getId().equalsIgnoreCase(id)) {
        i ++;
    }
    // Al salir del bucle, pueden haber pasado dos cosas:
        // 1. 'i' es igual a productos.size() -> Se recorrió todo y no se encontró.
        // 2. 'i' es menor a productos.size() -> El bucle se detuvo porque encontró una coincidencia en la posición 'i'.
   
    if(i < this.productos.size()){
         // Si 'i' está dentro de los límites, significa que encontramos el producto.
        productoEncontrado = this.productos.get(i);
    }
        return productoEncontrado ; // Devuelve el objeto encontrado o el valor null inicial
} */

//FORMA MÁS UNIVERSAL DE RECORRER CUALQUIER COLECCION
public Producto buscarProductoPorId(String id) {
    Producto productoEncontrado = null;
    Iterator<Producto> it = this.productos.iterator();
    while (it.hasNext() && productoEncontrado == null){
        Producto p = it.next();
        if(p.getId().equalsIgnoreCase(id)){
            productoEncontrado = p;
        }
    } return productoEncontrado;
}

public void eliminarProducto(String id) {
    // removeIf recorre la lista y elimina los elementos que cumplen la condición.
    boolean eliminado = productos.removeIf(producto -> producto.getId().equalsIgnoreCase(id));

    if (eliminado) {
        System.out.println("Producto con ID '" + id + "' eliminado.");
    } else {
        System.out.println("No se encontró ningún producto con el ID: " + id);
    }
}

public void actualizarStock(String id, int nuevaCantidad) {
    Producto pEncontrado= this.buscarProductoPorId(id);
    if (pEncontrado != null) {
        pEncontrado.setCantidad(nuevaCantidad);
        System.out.println("Stock del producto '" + pEncontrado.getNombre() + "' actualizado a " + nuevaCantidad + ".");     
    } else {
        System.out.println("No se pudo actualizar. No se encontró producto con ID: " + id);
    }
}
    
 public ArrayList<Producto> filtrarPorCategoria(CategoriaProducto categoria) {
     // 1. Crear una lista nueva para guardar los resultados.
    ArrayList<Producto> productosFiltrados = new ArrayList<>();
    
    // 2. Recorrer la lista original.
    for (Producto p : productos) {
        // 3. Si la categoría coincide, añadir el producto a la nueva lista.
        if (p.getCategoria() == categoria) {
            productosFiltrados.add(p);
        }
    }
    // 4. Devolver la lista con los resultados.
    return productosFiltrados;
}
 
public int obtenerTotalStock() {
    int total = 0;
      for(Producto p: productos){
        total += p.getCantidad();
      } return total;
}


public Producto obtenerProductoConMayorStock() {
    if (productos.isEmpty()) {
        System.out.println("El inventario está vacío.");
        return null; // No hay productos para devolver.
    }

    // Suponemos que el primer producto es el que tiene mayor stock.
    Producto pConMayorStock = productos.get(0);

    // Recorremos el resto de la lista para comparar.
    for (Producto pActual : productos) {
        if (pActual.getCantidad() > pConMayorStock.getCantidad()) {
            // Si encontramos uno con más stock, lo guardamos.
            pConMayorStock = pActual;
        }
    }
    return pConMayorStock;
}

public ArrayList<Producto> filtrarProductosPorPrecio(double min, double max) {
    ArrayList<Producto> productosEnRango = new ArrayList<>();
    for (Producto p : productos) {
        if (p.getPrecio() >= min && p.getPrecio() <= max) {
            productosEnRango.add(p);
        }
    }
    return productosEnRango;
}
        
 public void mostrarCategoriasDisponibles() {
    if (productos.isEmpty()) {
        System.out.println("No hay productos en el inventario.");
        return;
    }

    ArrayList<CategoriaProducto> categoriasMostradas = new ArrayList<>();
    System.out.println("--- Categorías Disponibles en Inventario ---");
    for (Producto p : productos) {
        // Si la categoría del producto actual NO está en nuestra lista de "ya mostradas"...
        if (!categoriasMostradas.contains(p.getCategoria())) {
            System.out.println(p.getCategoria().getDescripcion());
            categoriasMostradas.add(p.getCategoria());
        }
    }
}
}
