/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ejercicio5.ejercicio5;

/**
 *
 * @author Javier
 */
public class Rectangulo {
    double base;
    double altura;
    
    public Rectangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }
    
    public double area(){
        return base * altura;
    }
    
}
