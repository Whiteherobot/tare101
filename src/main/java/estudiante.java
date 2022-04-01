
import com.mycompany.animales.Animales;

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
    public int edad ;
    public float peso;
  
    public static void main(String[] args) {
        var est = new estudiante();
        est.nombre="Juan";
        
        
        System.out.println("El nombre del estudiante es: "+est.nombre);
    }

}
