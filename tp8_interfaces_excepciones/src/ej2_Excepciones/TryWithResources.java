/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej2_Excepciones;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;

/**
 *
 * @author Jennifer
 */


public class TryWithResources {

    public static void main(String[] args) {
        
        
        try ( BufferedReader br = new BufferedReader(new FileReader("datos.txt")) ) {
            
            System.out.println("--- Contenido de 'datos.txt' ---");
            String linea;
            
            // br.readLine() puede lanzar IOException
            while ( (linea = br.readLine()) != null ) {
                System.out.println(linea);
            }
        } catch (FileNotFoundException e) {
            System.err.println("Error: El archivo 'datos.txt' no se pudo encontrar.");
        } catch (IOException e) {
            System.err.println("Error general de E/S: " + e.getMessage());
        }
        
        System.out.println("\n--- Fin del programa. El archivo ya fue cerrado. ---");
    }
}
