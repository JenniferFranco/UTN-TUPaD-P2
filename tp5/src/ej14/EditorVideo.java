/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej14;

/**
 *
 * @author Jennifer
 */
public class EditorVideo {
    public void exportar(String formato, Proyecto proyecto){
        
        //Instanciamos Render - Relacion de creacion
        Render render = new Render(formato);
        
        System.out.println("Exportando el proyecto: " + proyecto.getNombre() + " en formato: " + render.getFormato());
    }
}
