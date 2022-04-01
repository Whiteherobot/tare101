/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PC-11
 */
public class Gato {

    public String nombre;
    public String raza;
    public String peso ;
    public String edad;
    
     public static void main(String[] args) {
        var gatito1 = new Gato();
        gatito1.raza= "Gato Persa";
        gatito1.nombre= "Pelusa";
        gatito1.peso= "8";
        gatito1.edad = "5";
        
        System.out.println("El raza del gato es: "+gatito1.raza);
        System.out.println("El nombre del gato es: "+gatito1.nombre);
        System.out.println("El peso del gato es: "+gatito1.peso);
        System.out.println("La edad del gato es: "+gatito1.edad);


        var gatito2 = new Gato();
        gatito2.raza="Angora";
        gatito2.nombre="Aslan";
        gatito2.peso= "10";
        gatito2.edad = "10";
        System.out.println("El raza del gato es: "+gatito2.raza);
        System.out.println("El nombre del gato es: "+gatito2.nombre);
        System.out.println("El peso del gato es: "+gatito2.peso);
        System.out.println("La edad del gato es: "+gatito2.edad);

     }
}
  

