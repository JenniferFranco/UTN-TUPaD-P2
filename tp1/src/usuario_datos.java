
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Jennifer
 */
public class usuario_datos {
    public static void main(String[] args) {
        // Scanner input necesara para la entrada del usuario
        Scanner input = new Scanner(System.in);

        //Declaracion de variables
        String nombre;
        int edad;
        
        // Pedir nombre
        System.out.print("Ingrese su nombre: ");
        nombre = input.nextLine();
        
        // Pedir edad
        System.out.print("Ingrese su edad: ");
        edad = Integer.parseInt(input.nextLine());
        
        // Mostrar resultados
        System.out.println("Hola " + nombre + ", tenes " + edad + " años.");
        
    }
        
}
