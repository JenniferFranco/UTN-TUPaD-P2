/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej1_producto;

/**
 *
 * @author Jennifer
 */
public class Producto {
    
    //ATRIBUTOS
    private final  String id; //  el ID es inmutable 
    private String nombre;
    private double precio; 
    private int cantidad;
    private CategoriaProducto categoria;

    
    //CONSTRUCTOR
    public Producto(String id, String nombre, double precio, int cantidad, CategoriaProducto categoria) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
        this.categoria = categoria;
    }

    // GETTERS (para acceder a los datos desde fuera) 
    public String getId() { return id;}
    public String getNombre() { return nombre;}
    public double getPrecio() {return precio; }
    public int getCantidad() { return cantidad;}
    public CategoriaProducto getCategoria() { return categoria; }
    
    // SETTERS (para modificar los datos que pueden cambiar)
    public void setPrecio(double precio) {
        if(precio>0){ /// Validación básica
        this.precio = precio;
         }
    }

    public void setCantidad(int cantidad) {
         if(cantidad>0){ /// Validación básica
        this.cantidad = cantidad;
        }
    }
    
    //MÉTODOS
   public void mostrarInfo() {
       System.out.println(this); //llama al toString()
   }

   //TO STRING
    @Override
    public String toString() {
        return "Producto{" + 
                "id=" + id +
                ", nombre=" + nombre +
                ", precio= $" + precio + 
                ", cantidad=" + cantidad +
                ", categoria=" + categoria.getDescripcion() + 
                '}';
    }
   
   
}
