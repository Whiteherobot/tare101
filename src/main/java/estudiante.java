

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PC-11
 */
public class estudiante {
    public String nombre;
    public String genero;
    public String edad ;
    public String peso;
  
    public static void main(String[] args) {
        var est1 = new estudiante();
        est1.nombre="Juan";
        est1.genero="Masculino";
        est1.edad="18";
        est1.peso="80";
        
        System.out.println("El nombre del estudiante es: "+est1.nombre);
        System.out.println("El genero del estudiante es: "+est1.genero);
        System.out.println("El edad del estudiante es: "+est1.edad);
        System.out.println("El peso del estudiante es: "+est1.peso);
        
        var est2 = new estudiante();
        est2.nombre="Maria";
        est2.genero="Femenino";
        est2.edad="30";
        est2.peso="65";
        
        System.out.println("El nombre del estudiante es: "+est2.nombre);
        System.out.println("El genero del estudiante es: "+est2.genero);
        System.out.println("El edad del estudiante es: "+est2.edad);
        System.out.println("El peso del estudiante es: "+est2.peso);
    }

}
