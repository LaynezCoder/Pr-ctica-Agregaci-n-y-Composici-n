/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.laynezcoder;

import java.util.Vector;

public class Factura {
    private String numero;
    private String cliente;
    private Fecha fecha;
    private Vector detalle;

    /* Constructor */
    public Factura(String pnumero, String pcliente, int pdia, int pmes, int panio) {
        setNumero(pnumero);
        setCliente(pcliente);
        fecha = new Fecha(pdia, pmes, panio);
        detalle = new Vector();
    }

    public void setNumero(String pnumero) {
        numero = pnumero;
    }

    public void setCliente(String pcliente) {
        cliente = pcliente;
    }

    /* Subtotal de la factura, sin impuesto */
    private float calcularSubtotal() {
        Linea lineaDetalle;
        float subtotal = 0;
        for(int i = 0; i < detalle.size(); i++) {
            lineaDetalle = (Linea) detalle.get(i);
            subtotal += lineaDetalle.calcularCosto();
        }
        return subtotal;
    }

    /* Impuesto de la factura (13% del subtotal) */
    private float calcularImpuesto() {
        return calcularSubtotal() * 0.13f;
    }

    /* Total de la factura (subtotal mas impuesto) */
    public float calcularTotal() {
        return calcularSubtotal() + calcularImpuesto();
    }

    /* Agrega una línea de detalle a la factura */
    public void agregarLinea(int pcantidad, String pcodigo, 
                            String pdescripcion, float pprecio) {
        detalle.add(new Linea(pcantidad, pcodigo, pdescripcion, pprecio));
    }

    /* Versión en texto de todos los datos de la factura */
    public String toString() {
        String msg = "===============\n";
        msg += "La Perla\n\n";
        msg += "Número: " + numero + "\n";
        msg += "Cliente: " + cliente + "\n";
        msg += "\t" + fecha.toString() + "\n";
        msg += "====================\n";
        msg += "Cant\tCódigo\tDescripción\tPrecio\tCosto\n";
        
        Linea linea;
        for(int i = 0; i < detalle.size(); i++) {
            linea = (Linea) detalle.get(i);
            msg += linea.toString() + "\n";
        }
        
        msg += "\t\t====================\n";
        msg += "\t\tSubtotal: " + this.calcularSubtotal() + "\n";
        msg += "\t\tImpuesto: " + this.calcularImpuesto() + "\n";
        msg += "\t\tTotal: " + this.calcularTotal() + "\n";
        msg += "===============\n";
        return msg;
    }
}