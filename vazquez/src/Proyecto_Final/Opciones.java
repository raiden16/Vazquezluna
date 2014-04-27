package Proyecto_Final;

import java.io.*;
public class Opciones {
    private int idop;
    private String opcion;
    private boolean respuesta;

    public Opciones(int idop, String opcion, boolean respuesta) {
        this.idop = idop;
        this.opcion = opcion;
        this.respuesta = respuesta;
    }

    public int getIdop() {
        return idop;
    }

    public void setIdop(int idop) {
        this.idop = idop;
    }

    public String getOpcion() {
        return opcion;
    }

    public void setOpcion(String opcion) {
        this.opcion = opcion;
    }

    public boolean isRespuesta() {
        return respuesta;
    }

    public void setRespuesta(boolean respuesta) {
        this.respuesta = respuesta;
    }
    
}
