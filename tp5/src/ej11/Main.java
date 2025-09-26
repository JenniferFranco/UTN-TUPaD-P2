/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej11;

/**
 *
 * @author Jennifer
 */
public class Main {
    public static void main(String[] args) {
        
        //Instanciamos artista
        Artista artista = new Artista("Gustavo Cerati", "Rock");
        
        //Instanciamos cancion
        Cancion cancion = new Cancion("Crimen");
        
        //Asociamos artista con cancion
        cancion.setArtista(artista);
        
        //Instanciamos reproductor
        Reproductor reproductor = new Reproductor();
        
        //Mostramos los datos
        System.out.println(artista);
        System.out.println("");
        
        System.out.println(cancion);
        System.out.println("");
        
        
        //Llamamos al método reproducir
        reproductor.reproducir(cancion);
        
     }
    }

