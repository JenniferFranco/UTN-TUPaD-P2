/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3;


public class Tp3 {

    public static void main(String[] args) {
        System.out.println("\n--- ESTUDIANTE ---");
        // Instanciar la clase Estudiante
        Estudiante estudiante1 = new Estudiante();
        
        // Asignar valores directamente
        estudiante1.nombre = "Ana";
        estudiante1.apellido = "Pérez";
        estudiante1.curso = "Matemática";
        estudiante1.calificacion = 7;
        
        // Mostrar información
        estudiante1.mostrarInfo();

        // Probar subir/bajar calificación
        estudiante1.subirCalificacion(2);
        estudiante1.mostrarInfo();

        estudiante1.bajarCalificacion(3);
        estudiante1.mostrarInfo();
        
        System.out.println("\n--- MASCOTA---");
        // Instanciar la clase Mascota con constructor
        Mascota mascota1 = new Mascota("Bruss", "Ovejero Aleman", 7 );
        
        // Mostrar información
        mascota1.mostrarInfo();
        
        //Probar cumplir años
        mascota1.cumplirAnios();
        mascota1.mostrarInfo();
          
        System.out.println("\n--- LIBRO ---");
         // Instanciar la clase Libro con constructor
         Libro libro1 = new Libro("Cien años de soledad", "Garcia Marquez", 1967);
         libro1.mostrarInfo();
         
          // Intentar modificar a un año inválido
        libro1.setAnioPublicacion(3000);
        
        // Intentar modificar a un año válido
        libro1.setAnioPublicacion(1999);
        libro1.mostrarInfo();
        
        System.out.println("\n--- GALLINA---");
         // Instanciar la clase Gallina con constructor
         Gallina gallina1 = new Gallina(1,2);
         gallina1.mostrarEstado();
         
         Gallina gallina2 = new Gallina(2, 3);
         
         // Mostrar estado inicial de cada gallina
        System.out.println("\n--- Estado inicial de las gallinas ---");
         gallina1.mostrarEstado();
         gallina2.mostrarEstado();
         
         //Simular acciones
         gallina1.ponerHuevo();
         gallina2.envejecer();
         gallina1.ponerHuevo();
         gallina2.ponerHuevo();
         gallina1.envejecer();
         gallina2.envejecer();
         
         // Mostrar estado final de cada gallina
        System.out.println("\n--- Estado final de las gallinas ---");
         gallina1.mostrarEstado();
         gallina2.mostrarEstado();
         
         System.out.println("\n--- NAVE ESPACIAL ---");
          // Instanciar la clase NaveEspacial con constructor
         NaveEspacial nave1 = new NaveEspacial("001", 50);
         
         //intentar despegar
         nave1.despegar();
         
         //Recargar cmbustible
         nave1.recargarCombustible(50);
         
         //Intentar avanzar
         nave1.avanzar(80);
         
         //Recargar cmbustible
         nave1.recargarCombustible(20);
         
         //Mostrar estado
         nave1.mostrarEstado();

         
    }
}

   
    

