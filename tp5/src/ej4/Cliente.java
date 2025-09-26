/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej4;

/**
 *
 * @author Jennifer
 */
public class Cliente {
    //Atributos
    private String nombre;
    private String dni;
    private TarjetaDeCredito tarjeta;  // Asociación bidireccional

    public Cliente(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getDni() {
            return dni;
        }

        public void setDni(String dni) {
            this.dni = dni;
        }

        public TarjetaDeCredito getTarjeta() {
            return tarjeta;
        }

        public void setTarjeta(TarjetaDeCredito tarjeta) {
            this.tarjeta = tarjeta;
            if (tarjeta != null && tarjeta.getCliente() != this){
                tarjeta.setCliente(this);// sincroniza relación
            }
        }

    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", dni=" + dni + ", tarjeta=" + tarjeta + '}';
    }
        
        
    
}

