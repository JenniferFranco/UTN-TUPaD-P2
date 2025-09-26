/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej11;

/**
 *
 * @author Jennifer
 */
public class Cancion {
    
    //Atributos
    private String titulo;
    private Artista artista; //Asociación unidireccional
    
    // Constructor 
    public Cancion(String titulo) {
        this.titulo = titulo;
    }
    
    //Getters and setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Artista getArtista() {
        return artista;
    }

    public void setArtista(Artista artista) {
        this.artista = artista;
    }

     //Método toString
    @Override
    public String toString() {
        return "Cancion{" + "titulo=" + titulo + ", nombre del artista=" + this.getArtista().getNombre() + '}';
    }
    

}
