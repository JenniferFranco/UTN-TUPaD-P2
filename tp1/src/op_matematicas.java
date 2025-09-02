
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Jennifer
 */
public class op_matematicas {
    public static void main(String[] args) {
        //Scanner para la entrada del usuario
        Scanner input = new Scanner(System.in); 
        
        //Declaracion de las variables
        int num1;
        int num2;
        int suma;
        int resta;
        int multiplicacion;
        double division;
        
        //Pedir los numeros
        System.out.print("Ingrese el primer número entero:");
        num1 = Integer.parseInt(input.nextLine());
        
        System.out.print("Ingrese el segundo número entero:");
        num2 = Integer.parseInt(input.nextLine());
        
        //Operaciones
        suma = num1 + num2;
        resta = num1 - num2;
        multiplicacion = num1 * num2;
        
        // La división conviene hacerla en double para que no se pierdan decimales
        division = 0;
        if (num2 != 0) {
            division = (double) num1 / num2;
        }
        
        //Mostrar resultados 
        System.out.println("Suma = " + suma);
        System.out.println("Resta = " + resta);
        System.out.println("Multiplicacion = " + multiplicacion);
        
        if (num2 != 0) {
            System.out.println("División: " + division);
        } else {
            System.out.println("No se puede dividir por cero.");
        }

    }
    
}

