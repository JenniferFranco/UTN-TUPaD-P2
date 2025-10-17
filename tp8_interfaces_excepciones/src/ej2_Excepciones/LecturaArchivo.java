/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej2_Excepciones;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Jennifer
 */
public class LecturaArchivo {
    public static void main(String[] args) {
        Scanner lectorArchivo = null; // Lo declaramos fuera del try para usarlo en finally
        
        try{
            File archivo = new File("texto.txt");
            lectorArchivo = new Scanner(archivo); // Esta es la línea que puede lanzar la excepción
            System.out.println("--- Contenido de texto.txt' ---");
        } catch (FileNotFoundException e) {
            System.err.println("Error: El archivo 'texto.txt' no se pudo encontrar.");
        } finally {
            if (lectorArchivo != null) {
                System.out.println("\n--- Cerrando el archivo ---");
                lectorArchivo.close(); //libera los recursos
            }
      
    }
}
