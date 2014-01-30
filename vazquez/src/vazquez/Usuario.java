/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package vazquez;

/**
 *
 * @author T107
 */
public class Usuario {
    //Paso1
    String nombre;
    String error;
    private int edad;
    //Paso2

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if(edad<0)edad=-edad;
        if(edad<18)edad=error;
        
        
        this.edad = edad;
    }
    
    
    
    
    
    
    
}
