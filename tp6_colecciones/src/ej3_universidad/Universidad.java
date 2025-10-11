/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej3_universidad;

import ej2_biblioteca.Libro;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Jennifer
 */
public class Universidad {

    //ATRIBUTOS
   private String nombre;
   private List<Profesor> profesores;
   private List<Curso> cursos;

   //CONSTRUCTOR
    public Universidad(String nombre) {
        this.nombre = nombre;
        this.profesores = new ArrayList<>();
        this.cursos = new ArrayList<>();
    }
   
    //GETTERS (para acceder a los datos desde fuera) 
    public List<Profesor> getProfesores() {return profesores;}
    public List<Curso> getCursos() {return cursos;}
    
    //MÉTODOS
    public void agregarProfesor(Profesor p){
        if(!profesores.contains(p)){
            profesores.add(p);
        }
    }
    
    public void  agregarCurso(Curso c){
        if(!cursos.contains(c)){
            cursos.add(c);
         }
    }
    
    public Profesor buscarProfesorPorId(String id){
        Profesor profeEncontrado = null;
        Iterator<Profesor> it = this.profesores.iterator();
        while (it.hasNext() && profeEncontrado == null){
            Profesor  p = it.next();
            if(p.getId().equalsIgnoreCase(id)){
            profeEncontrado = p;
        }
    } return profeEncontrado;
    }
    
    public Curso buscarCursoPorCodigo(String codigo){
        Curso cursoEncontrado = null;
        Iterator<Curso> it = this.cursos.iterator();
        while (it.hasNext() && cursoEncontrado == null){
            Curso  c = it.next();
            if(c.getCodigo().equalsIgnoreCase(codigo)){
            cursoEncontrado = c;
        }
    } return cursoEncontrado;
    }
    
    public void asignarProfesorACurso(String codigoCurso, String idProfesor) {
        Curso c = buscarCursoPorCodigo(codigoCurso);
        Profesor p = buscarProfesorPorId(idProfesor);
        
        if(c != null && p != null) {
            c.setProfesor(p); // La lógica de sincronización está en Curso
           System.out.println("Asignación exitosa: " + p.getNombre() + " -> " + c.getNombre());
        } else{
            System.out.println("Error: No se encontró el curso o el profesor.");
        }
    }

    public void listarProfesores() {
        for (Profesor p : profesores){
            System.out.println(p);
        }
    }
    
     public void listarCursos() {
        for (Curso c : cursos){
            System.out.println(c);
        }
    }

    public void eliminarCurso(String codigo) {
        Curso c = buscarCursoPorCodigo(codigo);
        if(c != null){
            c.setProfesor(null);// Romper la relación antes de eliminar
            cursos.remove(c);
            System.out.println("Curso " + codigo + " eliminado.");
        } else{
            System.out.println("Error  curso no encontrado.");
        }
    }
     
     
    public void eliminarProfesor(String id) {
        Profesor p = buscarProfesorPorId(id);
        if(p != null){
            // Desvincular al profesor de todos sus cursos
            for (Curso c : cursos) {
                c.setProfesor(null);// Romper la relación antes de eliminar
            }
            profesores.remove(p);
            System.out.println(" Profesor " + id + " eliminado.");
        } else{
            System.out.println("Error profesor no encontrado.");
        }
    }
}

  
    
    

