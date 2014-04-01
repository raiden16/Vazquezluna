
package javaapplication1;

import java.util.ArrayList;

/**
 *
 * @author T107
 */
public class Pregunta {
    int id;
    String Titulo;
    ArrayList<Opcion> opciones;

    public Pregunta(int id, String Titulo, ArrayList<Opcion> opciones) {
        this.id = id;
        this.Titulo = Titulo;
        this.opciones = opciones;
    }

    
    


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    
    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public ArrayList<Opcion> getOpciones() {
        return opciones;
    }

    public void setOpciones(ArrayList<Opcion> opciones) {
        this.opciones = opciones;
    }
    
    
}
