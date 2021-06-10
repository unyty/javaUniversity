
import java.util.Scanner; //importar

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
        
        System.out.println("Proporciona el titulo: ");
        Scanner consola = new Scanner(System.in);
        var titulo = consola.nextLine();
        //System.out.println("usuario = " + usuario);
        System.out.println("Proporciona el autor");
        
        var autor = consola.nextLine();
        System.out.println(titulo + " fue escrito por "+autor);
    }
}
