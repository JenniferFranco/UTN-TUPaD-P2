/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej14;

/**
 *
 * @author Jennifer
 */
public class Main {
    public static void main(String[] args) {
         //Instanciamos proyecto 
         Proyecto proyecto = new Proyecto ("Documental", 23.35);
         
         //Instanciamos editorVideo
         EditorVideo editor = new EditorVideo();
         
         //Mostramos los datos
          System.out.println(proyecto);
          System.out.println("");
          
           //Llamamos al método  exportar
           editor.exportar("mp4", proyecto);
    }
    
}
