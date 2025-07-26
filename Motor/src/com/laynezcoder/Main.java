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
        
        Motor motor = new Motor();
        
        System.out.println("Ingrese el numero de cilindros:");
        
        motor.setCilindros(scanner.next());
        
        System.out.println("Ingrese el VIN");
        motor.setVin(scanner.next());
        
        Vehiculo vehiculo = new Vehiculo();
        
        System.out.println("Ingrese la marca del vehiculo:");
        vehiculo.setMarca(scanner.next());
        
        System.out.println("Ingrese el modelo del vehiculo:");
        vehiculo.setModelo(scanner.next());
       
        vehiculo.setMotor(motor);
        
        System.out.println(vehiculo.toString());
        
    }
    
}
