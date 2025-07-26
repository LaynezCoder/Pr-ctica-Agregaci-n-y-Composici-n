/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.laynezcoder;

public class Fecha {
    private int dia;
    private int mes;
    private int anio;

    /* Constructor */
    public Fecha(int pdia, int pmes, int panio) {
        setDia(pdia);
        setMes(pmes);
        setAnio(panio);
    }
    
    public Fecha ( ) {};

    public void setDia(int pdia) {
        dia = pdia;
    }

    public void setMes(int pmes) {
        mes = pmes;
    }

    public void setAnio(int panio) {
        anio = panio;
    }

    public String toString() {
        return dia + "/" + mes + "/" + anio;
    }
}