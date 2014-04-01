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
public class Opcion {
    private int id;
    String Titulo;
    boolean valor; 
public Opcion(int id) {
        this.id = id;
    }
    public Opcion(String Titulo, boolean valor) {
        this.Titulo = Titulo;
        this.valor = valor;
    }

    public Opcion(int id, String Titulo, boolean valor) {
        this.id = id;
        this.Titulo = Titulo;
        this.valor = valor;
    }

   
    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public boolean isValor() {
        return valor;
    }

    public void setValor(boolean valor) {
        this.valor = valor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
}
