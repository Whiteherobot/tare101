/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PC-11
 */
public class Perro {
    
    public String nombre;
    public String raza;
    public double peso ;
    public int edad;
    
     public static void main(String[] args) {
        var perro = new Perro();
        perro.raza="Pastor Alemán";
    
        perro.nombre="Pepe";
        
        System.out.println("El raza del perro es: "+perro.raza);
        System.out.println("El nombre del perro es: "+perro.nombre);
     }
}


