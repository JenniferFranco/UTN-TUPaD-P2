/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej8;

/**
 *
 * @author Jennifer
 */
public class Documento {
    //Atributos
    private String titulo;
    private String contenido;
    private FirmaDigital firma; //Composición
    
    // Constructor 
    public Documento(String titulo, String contenido, String codigoHash, String fecha, Usuario user) {
        this.titulo = titulo;
        this.contenido = contenido;
        // Creamos la FirmaDigital junto con el Documento
        this.firma = new FirmaDigital(codigoHash,fecha, user);
    }
    
    //Getters and setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public FirmaDigital getFirma() {
        return firma;
    }

    public void setFirma(FirmaDigital firma) {
        this.firma = firma;
    }
    
    //Método para mostrar firma
    public void mostrarFirma(){
        System.out.println("La firma de este documento corresponde con el codigo: " + this.getFirma());
    }
            

    //Método toString
    @Override
    public String toString() {
        return "Documento{" + "titulo=" + titulo + ", contenido=" + contenido + ", firma=" + firma + '}';
    }
    
}
