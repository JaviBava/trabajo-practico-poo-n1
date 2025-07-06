/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.ejercicio4.ejercicio4;

/**
 *
 * @author Javier
 */
public class Ejercicio4 {

    public static void main(String[] args) {
        Numero num1 = new Numero(4);
        Numero num2 = new Numero(9);
        Numero num3 = new Numero(82);
        Numero num4 = new Numero(93);
        Numero num5 = new Numero(1555);
        
        System.out.println("El numero " + num1.valor + " es par? " + num1.esPar());
        System.out.println("El numero " + num2.valor + " es par? " + num2.esPar());
        System.out.println("El numero " + num3.valor + " es par? " + num3.esPar());
        System.out.println("El numero " + num4.valor + " es par? " + num4.esPar());
        System.out.println("El numero " + num5.valor + " es par? " + num5.esPar());
        
        
    }
}
