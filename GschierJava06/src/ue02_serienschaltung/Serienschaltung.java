package ue02_serienschaltung;

public class Serienschaltung {
    private double strom;
        private double spannung;
        private double [] widerstandsFeld;
        
        private void updateSpannung() {
            double rges = 0.0;
            
            for (double r : widerstandsFeld) {
                rges += r;
            }
            spannung = strom * rges;
        }
        
        public void addWiderstand(double widerstandInOhm) throws InvalidResistorValueException {
            if (widerstandInOhm < 0 || widerstandInOhm > 10E6) {
                throw new InvalidResistorValueException(widerstandInOhm);
            }
            if (widerstandsFeld == null) {
                widerstandsFeld = new double [1];
                widerstandsFeld[0] = widerstandInOhm;
            } else {
                double [] f = new double[widerstandsFeld.length + 1];
                for (int i = 0; i < widerstandsFeld.length; i++) {
                    f[i] = widerstandsFeld[i];
                }
                f[widerstandsFeld.length] = widerstandInOhm;
                widerstandsFeld = f;
            }
            updateSpannung();
        }
        
        public double getStrom() {
            return strom;
        }
        
        public void setStrom(double strom) {
            this.strom = strom;
            updateSpannung();
        }
        
        public double getSpannung() {
            return spannung;
        }

        @Override
        @SuppressWarnings("ImplicitArrayToString")
        public String toString() {
            return "TestSerienschaltung{" + "strom=" + strom + ", spannung=" + spannung + ", widerstandsFeld=" + widerstandsFeld + '}';
        }
}
