/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej1;

/**
 *
 * @author Jennifer
 */
public class Pasaporte {
    //Atributos
   private String numero;
   private String fechaEmision;
   private Foto foto; //Composición
   private Titular titular; //Asociación bidireccional
   
    //Constructor
    public Pasaporte(String numero, String fechaEmision, String imagen, String formato) {
        this.numero = numero;
        this.fechaEmision = fechaEmision;
         //Creamos Foto junto a Pasaporte
        this.foto = new Foto(imagen, formato); 
    }
     
    //Getters and Setters
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(String fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public Foto getFoto() {
        return foto;
    }

    public void setFoto(Foto foto) {
        this.foto = foto;
    }
    
    
    public Titular getTitular() {
        return titular;
    }
    
  //Agregamos validación para la asoción bidireccional con Titular
    public void setTitular (Titular titular) {
            this.titular = titular;
            if(titular != null && titular.getPasaporte() != this){
                titular.setPasaporte(this);
            }
    }
    
    //Método mostrarFoto
    public void mostrarFoto(){
        System.out.println("La foto del pasaporte es: " + this.getFoto());
    }
    
    //Método toString
    @Override
    public String toString() {
        return "Pasaporte{" + "numero=" + numero + ", fechaEmision=" + fechaEmision + ", foto=" + foto + ", titular=" + titular.getNombre() + '}';
    }
    
   
}
