/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej2;

import java.util.ArrayList;

/**
 *
 * @author Jennifer
 */
public class Main {
    public static void main(String[] args) {
        //Creamos un ArrayList de tipo Figura
        ArrayList<FiguraGeometrica> figuras = new ArrayList<>();
        
        //Llenamos la lista usando el método .add()
        figuras.add(new Circulo("Círculo 1", 3));
        figuras.add(new Rectangulo("Rectangulo 1", 2, 4));
        figuras.add(new Circulo("Círculo 2", 5));
        figuras.add(new Rectangulo("Rectangulo 2", 3, 3));
       
       //Recorremos la lista y mostramos el área de cada figura
        for(FiguraGeometrica fig : figuras){
              System.out.println("Área de " + fig.getNombre() + ": " + fig.calcularArea());
        }


    }
}
