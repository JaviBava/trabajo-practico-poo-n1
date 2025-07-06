/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ejercicio6.ejercicio6;

import java.util.Scanner;

/**
 *
 * @author Javier
 */
public class Usuario {
    String nombre;
    
    
    public Usuario(){
        Scanner in = new Scanner(System.in);
        System.out.println("Por favor, ingrese su nombre:");
        nombre = in.nextLine();
    }
    
    public void saludarUsuario(){
        System.out.println("Bienvenido " + nombre);
    }
}
