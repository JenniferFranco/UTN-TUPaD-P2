/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej3_universidad;

/**
 *
 * @author Jennifer
 */
public class Main {
    public static void main(String[] args) {
        
        // Creamos Universidad
        Universidad uni = new Universidad("UTN");
        
       //Creamos profesores
       Profesor p1 = new Profesor("001", "Juan Pérez", "Inteligencia Artificial");
       Profesor p2 = new Profesor("002", "Ana Gómez", "Bases de Datos");
       Profesor p3 = new Profesor("003", "Luis Martin", "Inglés");
       
       //Creamos cursos
       Curso c1 = new Curso("DB202", "Bases de Datos Relacionales");
       Curso c2 = new Curso("AI303", "Machine Learning");
       Curso c3 = new Curso("CS101", "Inglés 1");
       Curso c4 = new Curso("DJ602", "Inglés 2");
       Curso c5 = new Curso("AI304", "Deep Learning");
       
        //Agregar profesores a la universidad.
        uni.agregarProfesor(p1);
        uni.agregarProfesor(p2);
        uni.agregarProfesor(p3);
        
        //Agregar cursos a la universidad.
        uni.agregarCurso(c1);
        uni.agregarCurso(c2);
        uni.agregarCurso(c3);
        uni.agregarCurso(c4);
        uni.agregarCurso(c5);
        
        //Asignar profesores a cursos
        uni.asignarProfesorACurso(c1.getCodigo(), p2.getId());
        uni.asignarProfesorACurso(c2.getCodigo(), p1.getId());
        uni.asignarProfesorACurso(c3.getCodigo(), p3.getId());
        uni.asignarProfesorACurso(c4.getCodigo(), p3.getId());
        uni.asignarProfesorACurso(c5.getCodigo(), p1.getId());
        System.out.println();

        //Listar profesores con sus cursos.
        System.out.println("--- Verificando asignaciones iniciales ---");
        uni.listarProfesores();
        System.out.println();
        
        //Listar cursos con su profesor.
        System.out.println("--- Verificando asignaciones iniciales ---");
        uni.listarCursos();
        System.out.println();

        //Cambiar el profesor de un curso y verificar que ambos lados quedan sincronizados.
         System.out.println("--- Cambiando profesor del curso DB202 a Juan Pérez (001) ---");
        uni.asignarProfesorACurso(c1.getCodigo(), p1.getId());
        System.out.println("Verificando el cambio... ");
        uni.listarCursos();
        System.out.println();
        uni.listarProfesores();   
        System.out.println();
        
        //Remover un curso y confirmar que ya no aparece en la lista del profesor.
        uni.eliminarCurso(c3.getCodigo());
        System.out.println("Verificando el cambio... ");
        uni.listarCursos();
        System.out.println();

        //Remover un profesor y dejar profesor = null.
        uni.eliminarProfesor(p2.getId());
        System.out.println("Verificando el cambio... ");
        uni.listarProfesores();

        //Mostrar un reporte: cantidad de cursos por profesor.
        System.out.println("\n--- Tarea 8: Reporte de cantidad de cursos por profesor ---");
            for (Profesor p : uni.getProfesores()) {
            System.out.println("- " + p.getNombre() + ": " + p.getCursos().size() + " cursos.");
        }
    }
}
