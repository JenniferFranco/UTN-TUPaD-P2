/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3;

public class Libro {
     // Atributos
    private String titulo;
    private String autor;
    private int anioPublicacion;
    
    //Constructor 
    public Libro (String titulo, String autor, int anioPublicacion){
            this.titulo = titulo;
            this.autor = autor;
            this.anioPublicacion = anioPublicacion;
            }
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    //Setter con validación para añoPublicacion
    public void setAnioPublicacion(int anioPublicacion) {
        if (anioPublicacion > 0 && anioPublicacion < 2025) {
        this.anioPublicacion = anioPublicacion;
        } else {
            System.out.println(" Año de publicación inválido ") ;    
        }
    }
    
     public void mostrarInfo(){
        System.out.println("Titulo: "+ titulo + " \nAutor: "+ autor + "\nAño Publicacion: " +  anioPublicacion) ;
    }
}
