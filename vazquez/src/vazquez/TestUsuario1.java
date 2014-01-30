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
public class TestUsuario1 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] arg) {
        // TODO code application logic here
        Usuario u=new Usuario();
        u.setEdad(17);
        u.nombre="Pedro Manuel";
        u.error="No puedes acceder";
        System.out.println(u.getEdad());
        System.out.println(u.nombre);
        System.out.println(u.error);
        
    }
    
}
