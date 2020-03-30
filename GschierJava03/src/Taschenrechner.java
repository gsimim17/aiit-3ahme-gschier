package ue01_taschenrechner;

import java.util.Scanner;

public class Taschenrechner {
    double a;
    double b;
    
    public void Taschenrechner(double a, double b) {
        Scanner eingabe = new Scanner(System.in);
        
        System.out.print("Wert a: ");
        a = eingabe.nextDouble();
        this.a = a;
        System.out.print("Wert b: ");
        b = eingabe.nextDouble();
        this.b = b;
    }
    
    public double getAdditionResult() {
        double w = a + b;
        
        return w;
    }
    
    public double getSubtractionResult() {
        double w = a - b;
        
        return w;
    }
    
    public double getMultiplicationResult() {
        double w = a * b;
        
        return w;
    }
    
    public double getDivisionResult() {
        double w = a / b;
        
        return w;
    }
}
