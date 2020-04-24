package ue02_serienschaltung;

public class Serienschaltung {
    double strom = 0;
    double spannung = 0;
    double[] widerstandsFeld = new double[20];
    int widerstandsFeldLength = widerstandsFeld.length;
    
    double updateSpannung() {
        double gesamtspannung = 0;
        
        for (int i = 0; i < widerstandsFeldLength; i++) {
            gesamtspannung += strom * widerstandsFeld[i];
        }
        
        return gesamtspannung;
    }
    
    void addWiderstand(double widerstandInOhm) {
        widerstandsFeldLength++;
        widerstandsFeld[widerstandsFeldLength-1] = widerstandInOhm;
        spannung = updateSpannung();
    }
    
    /*
    double getStrom() {
        
    }
    */
    
    void setStrom(double strom) {
        this.strom = strom;
        spannung = updateSpannung();
    }
    
    /*
    double getSpannung() {
        
    }
    */
    
    /*
    String toString() {
        protected Object clone() throws CloneNotSupportedException {
            return super.clone(); //To change body of generated methods, choose Tools | Templates.
        }
    }
    */

    void serienschaltung() {
        int arrayLength = widerstandsFeld.length;
        System.out.print("Serienschaltung{strom=" + strom + ", spannung=" + spannung + ", widerstandsFeld=" + arrayLength + "}\n");
    }
}
