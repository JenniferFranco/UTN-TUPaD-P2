/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej2_biblioteca;

/**
 *
 * @author Jennifer
 */
public class Main {
    
    public static void main(String[] args) {
     // 1.  Creamos una biblioteca.
     Biblioteca biblio = new Biblioteca("FakeBiblioteca");
    
    //2.  Crear al menos tres autores
    Autor a1 = new Autor("1234", "Miguel de Cervantes", NacionalidadAutor.ESPAÑOL);
    Autor a2 = new Autor("4567", "Dante Alighieri ", NacionalidadAutor.ITALIANO);
    Autor a3 = new Autor("6789", "William Shakespeare", NacionalidadAutor.INGLES);
    
    //3.  Agregar 5 libros asociados a alguno de los Autores a la biblioteca.
    biblio.agregarLibro("978-84-241-1636-5", "Don Quijote de la Mancha", 1605, a1);
    biblio.agregarLibro("978-88-08-15174-8", "La Divina Comedia", 1320, a2);
    biblio.agregarLibro("978-0-7434-7711-6", "Romeo y Julieta", 1597, a3);
    biblio.agregarLibro("978-0-7434-7712-3", "Hamlet", 1602, a3);
    biblio.agregarLibro("978-0-7434-7710-9", "Macbeth", 1606, a3);
    
    //4.  Listar todos los libros con su información y la del autor.
     System.out.println("--- Libros disponibles en la biblioteca ---"); 
    biblio.listarLibros();
     System.out.println();
     
    //5.  Buscar un libro por su ISBN y mostrar su información.
    System.out.println( "El libro al que corresponde el ISBN es: " + biblio.buscarLibroPorIsbn("978-0-7434-7712-3").getTitulo());
    System.out.println();
    
    //6.  Filtrar y mostrar los libros publicados en un año específico.
     System.out.println("El libro al que corresponde es: " + biblio.filtrarLibrosPorAnio(1606));
     System.out.println();
     
    //7.  Eliminar un libro por su ISBN y listar los libros restantes.
    biblio.eliminarLibro("978-88-08-15174-8");
    System.out.println();
    
    //8.  Mostrar la cantidad total de libros en la biblioteca.
     System.out.println("La cantidad de libros de la biblioteca es: " + biblio.obtenerCantidadLibros());
     System.out.println();
     
     //9.  Listar todos los autores de los libros disponibles en la biblioteca.
      biblio.mostrarAutoresDisponibles();
    }
}
