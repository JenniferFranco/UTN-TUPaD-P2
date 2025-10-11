/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej2_biblioteca;

import ej1_producto.CategoriaProducto;
import ej1_producto.Producto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Jennifer
 */
public class Biblioteca {
    
    //ATRIBUTOS
    private String nombre;
    List<Libro> libros;

    //CONSTRUCTOR
    public Biblioteca(String nombre) {
        this.nombre = nombre;
        this.libros = new ArrayList <>(); // Instanciar con una clase concreta (ArrayList)
    }
    
    //MÉTODOS
    public void agregarLibro(String isbn, String titulo,int anioPublicacion, Autor autor){
       libros.add(new Libro(isbn,titulo, anioPublicacion, autor));
    }
    
    public void listarLibros(){
        for(Libro libro : libros){
        System.out.println(libro);
        }
    }
    
    public Libro buscarLibroPorIsbn(String isbn){
        Libro libroEncontrado = null;
        Iterator<Libro> it = this.libros.iterator();
        while (it.hasNext() && libroEncontrado == null){
        Libro l = it.next();
            if(l.getIsbn().equalsIgnoreCase(isbn)){
            libroEncontrado = l;
        }
    } return libroEncontrado;
    }
    
    public void eliminarLibro(String isbn){
     // removeIf recorre la lista y elimina los elementos que cumplen la condición.
        boolean eliminado = libros.removeIf(libro-> libro.getIsbn().equalsIgnoreCase(isbn));
        if (eliminado) {
         System.out.println("Producto con ISBN '" + isbn + "' eliminado.");
        }else {
            System.out.println("No se encontró ningún producto con el ISBN: " + isbn);
        }
    }
    
    public int obtenerCantidadLibros(){
        return this.libros.size();
    }
     
    public  ArrayList<Libro> filtrarLibrosPorAnio(int anio){
        // 1. Crear una lista nueva para guardar los resultados.
    ArrayList<Libro> librosFiltrados = new ArrayList<>();
    
    // 2. Recorrer la lista original.
    for (Libro l : libros) {
        // 3. Si el anio coincide, añadir el producto a la nueva lista.
        if (l.getAnioPublicacion()== anio) {
            librosFiltrados.add(l);
        }
    }
    // 4. Devolver la lista con los resultados.
    return librosFiltrados;
    }
    
    public void mostrarAutoresDisponibles(){
     if (libros.isEmpty()) {
        System.out.println("No hay autores.");
        return;
    }
    ArrayList<Autor> autoresDisponibles = new ArrayList<>();
    System.out.println("--- Autores Disponibles ---");
    for (Libro l : libros) {
        // Si el autor NO está en nuestra lista de "ya mostradas"...
        if (!autoresDisponibles.contains(l.getAutor())) {
            System.out.println(l.getAutor().getNombre());
            autoresDisponibles.add(l.getAutor());
        }
     }
 }
}
