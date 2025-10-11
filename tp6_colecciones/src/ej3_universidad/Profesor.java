/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej3_universidad;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jennifer
 */
public class Profesor {
    //ATRIBUTOS
    private String id;
    private String nombre;
    private String especialidad; 
    private List<Curso> cursos;
        
   //CONSTRUCTOR
    public Profesor(String id, String nombre, String especialidad) {
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.cursos = new ArrayList<>(); // Inicializar la lista
    }
    
    //GETTERS (para acceder a los datos desde fuera) 
    public String getId() { return id;}
    public String getNombre() {return nombre;}
    public List<Curso> getCursos() { return cursos;}
    
    //SETTERS (para modificar los datos que pueden cambiar)
    public void setCursos(List<Curso> cursos) {
        this.cursos = cursos;
    }
    
    //MÉTODOS
  public void agregarCurso(Curso c) {
      if(!this.cursos.contains(c)){
          this.cursos.add(c);
          // Sincroniza el otro lado de la relación si no está ya establecido
          if(c.getProfesor() != this){
              c.setProfesor(this);
          }
      }
  }
  
    public void eliminarCurso(Curso c) {
        if(this.cursos.contains(c)){
            this.cursos.remove(c);
             // Sincroniza el otro lado, estableciendo el profesor del curso a null
            if (c.getProfesor() == this) {
                c.setProfesor(null);
            }
    }
}

    public void listarCursos() {
        if(cursos.isEmpty()){
             System.out.println("No dicta cursos actualmente");
        } else  {
             for(Curso c : cursos){ 
            System.out.println(c.getNombre() +" - "+ c.getCodigo());
            }
        }
    }
    
    public void mostrarInfo() {
        System.out.println(this);
    }

     //TO STRING
    @Override
    public String toString() {
        return "Profesor{" + "id=" + id + ", nombre=" + nombre + ", especialidad=" + especialidad + ", cantidad de cursos=" + cursos.size() + '}';
    }
    
}
