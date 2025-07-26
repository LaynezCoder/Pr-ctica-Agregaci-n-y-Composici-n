/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.laynezcoder;

public class Vehiculo {  
    private String marca;  
    private String modelo;  
    private Motor motor;  

    public Vehiculo(String pMarca, String pModelo) {  
        setMarca(pMarca);  
        setModelo(pModelo);  
    }  

    public void setMarca(String pMarca) { 
        marca = pMarca; 
    }  

    public String getMarca() {  
        return marca; 
    }  

    public void setModelo(String pModelo) { 
        modelo = pModelo; 
    }  

    public String getModelo() {  
        return modelo; 
    }  

    public void setMotor(Motor pMotor) { 
        motor = pMotor;  // Corregido: estaba 'pmotor' (minúscula)
    }  

    public Motor getMotor() {  // Corregido: devuelve Motor, no String
        return motor; 
    }  

    public String toString() {  
        String motorInfo = (motor != null) ? motor.toString() : "Sin motor asignado";
        return "Vehículo: " + marca + ", Modelo: " + modelo + "\n" + motorInfo;  
    }  
}