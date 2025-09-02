/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3;

/**
 *
 * @author Jennifer
 */
public class Estudiante {
     // Atributos
    String nombre;
    String apellido;
    String curso;
    int calificacion;


    public void mostrarInfo() {
        System.out.println("\nNombre: "+ nombre + " \nApellido: "+ apellido +" \nCurso: " + curso + "\nCalificacion: " + calificacion) ;
    }
    
    public int  subirCalificacion( int puntos){
        return  calificacion += puntos;
    }
    
    public int bajarCalificacion( int puntos) {
        return  calificacion -= puntos;
    }
}
//Métodos requeridos: mostrarInfo(), subirCalificacion(puntos), bajarCalificacion(puntos).


//Tarea: Instanciar a un estudiante, mostrar su información, aumentar y disminuir calificaciones.