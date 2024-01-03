/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.util.ArrayList;

/**
 *
 * @author USUARIO
 */
public class Cancion implements Comparable<Cancion>{
    private String titulo;
    private String cantante; 
     private String imagen;
     private int postActual;
      private int posPrevia;
      private int semanas;
      private ArrayList<Integer> historial;

    public Cancion(String titulo, String cantante, String imagen, int postActual, int posPrevia, int semanas, ArrayList<Integer> historial) {
        this.titulo = titulo;
        this.cantante = cantante;
        this.imagen = imagen;
        this.postActual = postActual;
        this.posPrevia = posPrevia;
        this.semanas = semanas;
        this.historial = historial;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCantante() {
        return cantante;
    }

    public void setCantante(String cantante) {
        this.cantante = cantante;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public int getPostActual() {
        return postActual;
    }

    public void setPostActual(int postActual) {
        this.postActual = postActual;
    }

    public int getPosPrevia() {
        return posPrevia;
    }

    public void setPosPrevia(int posPrevia) {
        this.posPrevia = posPrevia;
    }

    public int getSemanas() {
        return semanas;
    }

    public void setSemanas(int semanas) {
        this.semanas = semanas;
    }

    public ArrayList<Integer> getHistorial() {
        return historial;
    }

    public void setHistorial(ArrayList<Integer> historial) {
        this.historial = historial;
    }


    @Override
    public int compareTo(Cancion o) {
        return Integer.compare(this.postActual, o.postActual);
    }
    
}
