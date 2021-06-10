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
        //definir variable
        int miVariableEntera=10;
        System.out.println(miVariableEntera);
        //modificar variable
        miVariableEntera=5;
        System.out.println(miVariableEntera);
        
        String miVariableCadena="variable string";
        
        System.out.println(miVariableCadena);
        
        miVariableCadena="chao";
        System.out.println(miVariableCadena);
        
        //inferencia de variable
        var miVariableEntera2 =10;
        System.out.println(miVariableEntera2);
        
        var miVariableCadena2 = "raro inferencia ...";
        System.out.println(miVariableCadena2);
        
        System.out.println("miVariableCadena2 = " + miVariableCadena2);
        
        //declaraciones raras de variables
        var miVariable =1;
        var _miVariable=2;
        var $miVariable=3; //WTF
        //var miVariáble=4; //jamas hacer esto pero se puede
    }
}
