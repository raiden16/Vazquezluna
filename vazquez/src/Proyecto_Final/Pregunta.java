package Proyecto_Final;


import java.io.*;
import java.util.*;

public class Pregunta {
    private int id;
    private String pregunta;
    private ArrayList<Opciones> opciones;

    public Pregunta(int id, String pregunta, ArrayList<Opciones> opciones) {
        this.id = id;
        this.pregunta = pregunta;
        this.opciones = opciones;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    public ArrayList<Opciones> getOpciones() {
        return opciones;
    }

    public void setOpciones(ArrayList<Opciones> opciones) {
        this.opciones = opciones;
    }

}
