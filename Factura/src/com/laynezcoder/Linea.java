/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.laynezcoder;

public class Linea {
    private float cantidad;
    private String codigo;
    private String descripcion;
    private float precio;

    /* Constructor */
    public Linea(float pcantidad, String pcodigo, 
                String pdescripcion, float pprecio) {
        setCantidad(pcantidad);
        setCodigo(pcodigo);
        setDescripcion(pdescripcion);
        setPrecio(pprecio);
    }
    
    public Linea() {
        
    }

    public void setCantidad(float pcantidad) {
        cantidad = pcantidad;
    }

    public void setCodigo(String pcodigo) {
        codigo = pcodigo;
    }

    public void setDescripcion(String pdescripcion) {
        descripcion = pdescripcion;
    }

    public void setPrecio(float pprecio) {
        precio = pprecio;
    }

    /* Costo de una línea (cantidad por el precio) */
    public float calcularCosto() {
        return cantidad * precio;
    }

    /* Versión en texto con todos los datos de la línea */
    public String toString() {
        return cantidad + "\t" + codigo + "\t" + 
               descripcion + "\t" + precio + "\t" + 
               calcularCosto();
    }
}