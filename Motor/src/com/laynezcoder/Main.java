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
        Motor motor = new Motor();
        motor.setCilindros("6");
        motor.setVin("123");
        
        Vehiculo vehiculo = new Vehiculo("TOYOTA", "TUNDRA");
        vehiculo.setMotor(motor);
        
        System.out.println(vehiculo.toString());
        
    }
    
}
