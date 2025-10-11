/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej2_biblioteca;

/**
 *
 * @author Jennifer
 */
public class Autor {
    
    //ATRIBUTOS
    private String id; 
    private String nombre;
    private NacionalidadAutor nacionalidad;  
    
//CONSTRUCTOR
    public Autor(String id, String nombre, NacionalidadAutor nacionalidad) {
        this.id = id;
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
    }
   
    //GETTERS (para acceder a los datos desde fuera) 
    public String getNombre() {
        return nombre;
    }
    
   //MÉTODOS
   public void mostrarInfo() {
       System.out.println(this);
 } 
   
   // TO STRING
    @Override
    public String toString() {
        return "Autor{" + "id=" + id + ", nombre=" + nombre + ", nacionalidad=" + nacionalidad + '}';
    }
   
}
