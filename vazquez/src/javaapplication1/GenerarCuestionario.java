/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication1;

import java.util.ArrayList;

/**
 *
 * @author T107
 */
public class GenerarCuestionario {
  static  ArrayList<Pregunta> ObtenerCuestionario(){
        ArrayList<Pregunta> cuestionario=new ArrayList<Pregunta>();
        ArrayList<Opcion> opciones1=new ArrayList<Opcion>();
        Opcion op11=new Opcion(1,"El Salvador",false);
        Opcion op12=new Opcion(2,"Peru",false);
        Opcion op13=new Opcion(3,"Mexico",false);
        Opcion op14=new Opcion(4,"Finlandia",true);
        
        opciones1.add(op11);
        opciones1.add(op12);
        opciones1.add(op13);
        opciones1.add(op14);
        Pregunta p1=new Pregunta(1,"¿Cual es el pais con el mejor sistema Educativo?",opciones1);
        cuestionario.add(p1);
        
            
            
        return cuestionario;  
    }
    
}
