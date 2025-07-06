/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.ejercicio5.ejercicio5;

/**
 *
 * @author Javier
 */
public class Ejercicio5 {

    public static void main(String[] args) {
        Rectangulo rectanguloUno = new Rectangulo(15.5, 19.0);
        Rectangulo rectanguloDos = new Rectangulo(3.9, 8.2);
        Rectangulo rectanguloTres = new Rectangulo(50.7, 28.3);
        
        System.out.println("El area del primer rectangulo es: " + rectanguloUno.area());
        System.out.println("El area del segundo rectangulo es: " + rectanguloDos.area());
        System.out.println("El area del tercer rectangulo es: " + rectanguloTres.area());
    }
}
