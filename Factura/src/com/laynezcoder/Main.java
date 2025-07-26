/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.laynezcoder;

/**
 *
 * @author Laynecito
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // Crear una nueva factura
        Factura factura = new Factura("0065433", "Juan Perez", 12, 5, 2002);
        
        // Agregar líneas de detalle a la factura
        factura.agregarLinea(2, "3702", "anillos", 5300);
        factura.agregarLinea(1, "2805", "pulsera", 8200);
        factura.agregarLinea(1, "1531", "cadena", 4100);
        
        // Mostrar el total de la factura
        System.out.println("Total: " + factura.calcularTotal());
        
        // Opcional: Mostrar toda la factura completa
        System.out.println("\nDetalle completo de la factura:");
        System.out.println(factura.toString());
    }
    
}
