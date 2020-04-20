package ue02_serienschaltung;

public class Serienschaltung {
    double strom = 0;
    double spannung = 0;
    double[] widerstandsFeld = new double[0];
    
    void updateSpannung() {
        for (int i = 0; widerstandsFeld != null; i++) {
        }
    }
    
    void addWiderstand(double widerstandInOhm) {
        widerstandsFeld = new double[1];
    }
    
    double getStrom() {
        
    }
    
    void setStrom(double strom) {
        
    }
    
    double getSpannung() {
        
    }
    
    String toString() {
        
    }
    
    
    void serienschaltung() {
        int arrayLength = widerstandsFeld.length;
        System.out.println("Serienschaltung{strom=" + strom + ", spannung=" + spannung + ", widerstandsFeld=" + arrayLength + "}\n");
    }
}
