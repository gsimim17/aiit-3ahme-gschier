package k8;

import k8.Cabrio;

// Listing 8.3 / 8.5

 public class ZweisitzerCabrio 
extends Cabrio {
    public boolean notsitze;
    
    public int alter() {
        return 12 * (2000 - erstzulassung);
    }
}
