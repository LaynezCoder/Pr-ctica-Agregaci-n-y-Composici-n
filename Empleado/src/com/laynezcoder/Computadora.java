/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.laynezcoder;

public class Computadora {
    private String serie;
    private String marca;
    private Empleado responsable = null;

    public Computadora(String pserie, String pmarca) {
        setSerie(pserie);
        setMarca(pmarca);
    }

    public void setSerie(String pSerie) {
        serie = pSerie;
    }

    public String getSerie() {
        return serie;
    }

    public void setMarca(String pMarca) {
        marca = pMarca;
    }

    public String getMarca() {
        return marca;
    }

    public void setResponsable(Empleado pResponsable) {
        responsable = pResponsable;
    }

    public Empleado getResponsable() {
        return responsable;
    }

    public String toString() {
        String responsableStr = (responsable != null) ? responsable.toString() : "Sin responsable asignado";
        return "Computadora: " + marca + ", Serie: " + serie + "\n" + "\tResponsable: " + responsableStr;
    }
}