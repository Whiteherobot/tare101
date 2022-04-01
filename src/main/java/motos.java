/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author PC-11
 */
public class motos {
    

    public String marca;
    public String placa;
    public String año ;
    public String modelo;
  
  
    public static void main(String[] args) {
        var moto1 = new motos();
        moto1.marca="Kawasaki";
        moto1.placa="MN 1026";
        moto1.año="2020";
        moto1.modelo="YZ";
        
        System.out.println("La marca de la moto es: "+moto1.marca);
        System.out.println("La placa de la moto es: "+moto1.placa);
        System.out.println("La año de la moto es: "+moto1.año);
        System.out.println("La modelo de la moto es: "+moto1.modelo);
        
        var moto2 = new motos();
        moto2.marca="Yamaha";
        moto2.placa="YZ 1030";
        moto2.año="2021";
        moto2.modelo="X";
        
        System.out.println("La marca de la moto es: "+moto2.marca);
        System.out.println("La placa de la moto es: "+moto2.placa);
        System.out.println("La año de la moto es: "+moto2.año);
        System.out.println("La modelo de la moto es: "+moto2.modelo);
    }
}


