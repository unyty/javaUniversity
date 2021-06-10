/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author unyty
 */
public class HolaMundo {
    public static void main(String[] args) {
        var usuario = "juan";
        var titulo = "ingeniero";
        var union = titulo + " " + usuario;
        System.out.println("union = " + union);
        
        var i = 3;
        var j = 4;
        
        System.out.println(i+j);//suma numeros
        
        System.out.println(i+j+usuario); //primero suma y luego cadena
        System.out.println(usuario+i+j); //manejo de todo como cadena
        System.out.println(usuario+(i+j)); //primero suma luego concatenacion 
        
        
    }
}
