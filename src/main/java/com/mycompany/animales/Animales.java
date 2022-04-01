/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.animales;

/**
 *
 * @author PC-11
 */
public class Animales {

    public String nombre;
    public String genero;
    public int edad ;
    public float peso;
  
    public static void main(String[] args) {
        var animal = new Animales();
        animal.nombre="Leon";
        
        
        System.out.println("El animal es un: "+animal.nombre);
    }
}
