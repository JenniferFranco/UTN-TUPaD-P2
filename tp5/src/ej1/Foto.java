/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej1;

public class Foto {
    //Atributos
    private String imagen;
    private String formato;
    
    //Constructor
    public Foto(String imagen, String formato) {
        this.imagen = imagen;
        this.formato = formato;
    }
    
    //Método toString
    @Override
    public String toString() {
        return "Foto{" + "imagen=" + imagen + ", formato=" + formato + '}';
    }
    
    
}
    

