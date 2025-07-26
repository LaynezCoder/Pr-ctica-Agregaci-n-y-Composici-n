package com.laynezcoder;

public class Motor {
    private String vin;
    private String cilindros;

    public void setVin(String pVin) { 
        vin = pVin; 
    }

    public String getVin() {
        return vin; 
    }

    public void setCilindros(String pCilindros) { 
        cilindros = pCilindros; 
    }

    public String getCilindros() {
        return cilindros; 
    }

    public String toString() {
        return "Motor: " + vin + ", Cilindros: " + cilindros + "\n"; 
    }
}