/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ejercicio7.ejercicio7;

/**
 *
 * @author Javier
 */
public class CuentaBancaria {
    String titular;
    double saldo;
    
    public CuentaBancaria(String titular, double saldo){
        this.titular = titular;
        this.saldo = saldo;
    }
    
    public void retirarDinero(double monto){
        if (monto <= saldo){
            saldo -= monto;
            System.out.println("¡Retiro exitoso!");
            System.out.println("Su saldo actual es: " + saldo);
        } else {
            System.out.println("Su saldo es insuficiente para realizar la operacion.");
        }
    }
}
