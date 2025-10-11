/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej3_universidad;

/**
 *
 * @author Jennifer
 */
public class Curso {
    
    //ATRIBUTOS
    private String codigo;
    private String nombre; 
    private Profesor profesor;
    
   //CONSTRUCTOR
    public Curso(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }
    
    //GETTERS (para acceder a los datos desde fuera) 
    public String getCodigo() { return codigo;}
    public String getNombre() {return nombre;}
    public Profesor getProfesor() { return profesor;}
    
    //SETTERS (para modificar los datos que pueden cambiar)
    public void setProfesor(Profesor profesor) {
        // Si el curso ya tenía un profesor, hay que eliminar este curso de su lista
        if (this.profesor != null) {
            this.profesor.getCursos().remove(this);
        }
        // Asignar el nuevo profesor
        this.profesor = profesor;
        // Si el nuevo profesor no es nulo, agregar este curso a su lista
        if (profesor != null && !profesor.getCursos().contains(this)) {
            profesor.getCursos().add(this);
        }
    }
    
    //MÉTODOS
    public void mostrarInfo(){
        System.out.println(this);
    }
    
    //TO STRING
    @Override
    public String toString() {
        return "Curso{" + "codigo=" + codigo + ", nombre del curso =" + nombre + ", nombre del profesor=" + profesor.getNombre() + '}';
    }
    
}
