/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.laynezcoder;

public class Empleado {
    private String nombre;
    private String cedula;
    
    public Empleado(String nombre, String cedula) {
        setNombre(nombre);
        setCedula(cedula);
    }

    public void setNombre(String pNombre) { 
        nombre = pNombre; 
    }

    public String getNombre() { 
        return nombre; 
    }

    public void setCedula(String pCedula) { 
        cedula = pCedula; 
    }
    
    public String getCedula() { 
        return cedula; 
    }

    public String toString() { 
        return "Empleado: " + nombre + ", Cédula: " + cedula + "\n"; 
    } 
}