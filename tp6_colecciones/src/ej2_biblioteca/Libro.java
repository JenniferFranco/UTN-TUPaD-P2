/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej2_biblioteca;

/**
 *
 * @author Jennifer
 */
public class Libro {
    
    //ATRIBUTOS
    private String isbn; 
    private String titulo;
    private int anioPublicacion;
    private Autor autor;  
    
    //CONSTRUCTOR
    public Libro(String isbn, String titulo, int anioPublicacion, Autor autor) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.anioPublicacion = anioPublicacion;
        this.autor = autor;
    }
    
    //GETTERS (para acceder a los datos desde fuera) 
    public String getIsbn() {
        return isbn;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public Autor getAutor() {
        return autor;
    }

    public String getTitulo() {
        return titulo;
    }
    
    //MÉTODO
     public void mostrarInfo() {
         System.out.println(this);
 }   

    @Override
    public String toString() {
        return "Libro{" + 
                "isbn=" + isbn + 
                ", título=" + titulo + 
               ", año de publicacion=" + anioPublicacion + 
                ", autor=" + autor + '}';
    }
     
}
