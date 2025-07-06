/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ejercicio3.ejercicio3;

/**
 *
 * @author Javier
 */
public class Libro {
    String titulo;
    String autor;
    int anio;
    
    public Libro(String titulo, String autor, int anio){
        this.titulo = titulo;
        this.autor = autor;
        this.anio = anio;
    }
    
    public void infoLibro(){
        System.out.println("El titulo del libro es: " + titulo);
        System.out.println("Su autor es: " + autor);
        System.out.println("Fue publicado en: " + anio);
    }
}
