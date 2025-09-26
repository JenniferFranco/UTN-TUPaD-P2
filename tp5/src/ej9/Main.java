/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej9;

/**
 *
 * @author Jennifer
 */
public class Main {
     public static void main(String[] args) {
         //Instanciamos paciente
         Paciente paciente = new Paciente("Juan Rey", "OSDE");
         
         //Instanciamos profesional
         Profesional profesional = new Profesional("Martín Peréz", "Cardiología");
         
         //Instanciamos citaMedica
         CitaMedica turno = new CitaMedica("30-09-2025", "14:15");
         
         //Asociamos citaMedica con paciente
         turno.setPaciente(paciente);
         
         //Asociamos citaMedica con profesional
         turno.setProfesional(profesional);
         
         //Mostramos los datos
         System.out.println(paciente);
         System.out.println("");
         
         System.out.println(profesional);
         System.out.println("");
         
         System.out.println(turno);
         System.out.println("");
     }
}
