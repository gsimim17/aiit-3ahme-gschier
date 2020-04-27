package ue02_serienschaltung;

import java.util.Scanner;

public class SerienschaltungRechner {
    public static void main(String[] args) {
        double strom;
        double[] widerstandsFeld = new double[100];
        
        Scanner eingabe = new Scanner(System.in);
        
        System.out.print("Strom: ");
        strom = eingabe.nextDouble();
        
        int i = 0;
        
        do {
            System.out.print((i + 1) + ". Widerstand: ");
            widerstandsFeld[i] = eingabe.nextDouble();
            i++;
        } while (widerstandsFeld[i] >= 0 || widerstandsFeld[i] <= 10);
    }
}
