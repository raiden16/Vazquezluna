/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication1;

/**
 *
 * @author T107
 */
public class TestCuestionario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for(Pregunta p:GenerarCuestionario.ObtenerCuestionario()){
            System .out.println(p.getTitulo());
            for(Opcion o:p.getOpciones()){
            System.out.println(o.getTitulo()+" "+o.isValor());
            }
        
        }
    }
    
}
