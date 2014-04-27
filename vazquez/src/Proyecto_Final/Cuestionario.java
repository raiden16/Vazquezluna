
package Proyecto_Final;

import com.sun.corba.se.impl.io.IIOPOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Cuestionario {
    public static ArrayList<Opciones> agregarOpciones(int id, String name, boolean disp){
        ArrayList<Opciones> opc = new ArrayList<Opciones>();
        Opciones op = new Opciones(id,name,disp);
        
        opc.add(op);
        return opc;
    }
    public static void guardarPregunta(Pregunta p) throws Exception{
        
        ArrayList<Pregunta> pre = new ArrayList<Pregunta>();
        File file = new File("Proyecto_Final");
        
        if(file.exists()){
            pre = Cuestionario.leerPregunta();
        }
        
        FileOutputStream fos = new FileOutputStream(file);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        
        pre.add(p);
        oos.writeObject(pre);
        oos.close();
    }
    
    
    public static ArrayList<Pregunta> leerPregunta () throws Exception{
        File file = new File("Proyecto_Final");
        FileInputStream fis = new FileInputStream(file);
        ObjectInputStream ois = new ObjectInputStream(fis);
        
        ArrayList<Pregunta> pre = (ArrayList<Pregunta>) ois.readObject();
        ois.close();
        return pre;
    }
    
}
