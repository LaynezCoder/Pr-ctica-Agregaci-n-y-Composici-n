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
        Empleado empleado = new Empleado();
        
        System.out.println("Ingrese el nombre del empleado:");
        empleado.setNombre(scanner.next());
        
        System.out.println("Ingrese la cedula del empleado:");
        empleado.setCedula(scanner.next());
        
        System.out.println(empleado.toString());
        
        Computadora computadora = new Computadora();
        System.out.println("Ingrese la marca de la computadora:");
        computadora.setMarca(scanner.next());
        
         System.out.println("Ingrese la serie de la computadora:");
        computadora.setSerie(scanner.next());
        
        computadora.setResponsable(empleado);
        System.out.println(computadora.toString());
        
    }
    
}
