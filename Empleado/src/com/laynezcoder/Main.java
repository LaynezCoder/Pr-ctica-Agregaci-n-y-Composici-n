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
        Empleado empleado = new Empleado("Juan Ramos", "123");
        System.out.println(empleado.toString());
        
        Computadora computadora = new Computadora("G16", "ASUS");
        computadora.setResponsable(empleado);
        System.out.println(computadora.toString());
        
    }
    
}
