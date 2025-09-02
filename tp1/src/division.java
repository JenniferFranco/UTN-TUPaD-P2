
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Jennifer
 */
public class division {
    public static void main(String[] args) {
        //Scanner para la entrada del usuario
        Scanner input = new Scanner(System.in); 
        
        //Declaracion de las variables
        int num1;
        int num2;
        int division;
        double division_mejorada;
        
        //Pedir los numeros
        System.out.print("Ingrese el primer número entero:");
        num1 = Integer.parseInt(input.nextLine());
        
        System.out.print("Ingrese el segundo número entero:");
        num2 = Integer.parseInt(input.nextLine());
        
        //Division int
        division = 0;
        if (num2 != 0) {
            division = num1 / num2;
        }
                
        // La división conviene hacerla en double para que no se pierdan decimales
        division_mejorada = 0;
        if (num2 != 0) {
            division_mejorada = (double) num1 / num2;
        }
        
        //Mostra resultado
        if (num2 != 0) {
            System.out.println("División int: " + division);
        } else {
            System.out.println("No se puede dividir por cero.");
        }
        
        if (num2 != 0) {
            System.out.println("División double: " + division_mejorada);
        } else {
            System.out.println("No se puede dividir por cero.");
        }

    }
}
