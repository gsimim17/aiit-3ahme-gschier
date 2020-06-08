package ue05_koerpergruppe;

public abstract class Koerper {
    
    public static final double DICHTE_EICHE = 670;
    public static final double DICHTE_BUCHE = 690;
    
    private double dichte;

    public Koerper(double dichte) throws IllegalArgumentException {
        if (dichte < 0) {
            throw new IllegalArgumentException("Invalid parameter dichte");
        }
        this.dichte = dichte;
    }

    public double getDichte() {
        return dichte;
    }

    public void setDichte(double dichte) {
        this.dichte = dichte;
    }
    
    public abstract double oberflaeche ();
    
    public abstract double volumen ();
    
    public double masse () {
        return volumen() * dichte;
    }
}
