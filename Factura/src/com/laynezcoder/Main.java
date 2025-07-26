/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.laynezcoder;

import java.util.Scanner;

/**
 *
 * @author Laynecito
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Crear una nueva factura
        Factura factura = new Factura();
        Fecha fecha = new Fecha();

        System.out.println("Agregue el numero de factura");
        factura.setNumero(scanner.next());
        

        System.out.println("Agregue el cliente de la factura");
        factura.setCliente(scanner.next());

        System.out.println("Agregue el dia de la factura");
        fecha.setDia(scanner.nextInt());

        System.out.println("Agregue el mes de la factura");
        fecha.setMes(scanner.nextInt());

        System.out.println("Agregue el anio de la factura");
        fecha.setAnio(scanner.nextInt());

        factura.setFecha(fecha);

        // Agregar líneas de detalle a la factura
        String option = "S";
        do {
            Linea linea = new Linea();
            System.out.println("Agregue codigo del producto");
            linea.setCodigo(scanner.next());
            
            System.out.println("Agregue descripcion del producto");
            linea.setDescripcion(scanner.next());
            
            System.out.println("Agregue la cantidad del producto");
            linea.setCantidad(scanner.nextInt());
            
            System.out.println("Agregue precio del producto");
            linea.setPrecio(scanner.nextInt());
            
            factura.setLinea(linea);
            
            System.out.println("Desea seguir agregando productos (S/N)");
            option = scanner.next();

        } while (option.equals("S"));

        // Mostrar el total de la factura
        System.out.println("Total: " + factura.calcularTotal());

        // Opcional: Mostrar toda la factura completa
        System.out.println("\nDetalle completo de la factura:");
        System.out.println(factura.toString());
    }

}
