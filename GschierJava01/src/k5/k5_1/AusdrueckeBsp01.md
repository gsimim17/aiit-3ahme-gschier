```javascript
package k5;

// Listing 5.1 - 5.2

public class AusdrueckeBsp01 {
    public void ausdrueckeBsp01() {
        int i = 3;
        
        // Listing 5.1
        
        /*
        int k;
        if (i >= 2) {
            k = 5;
        }
        System.out.println(k);
        */
        
        // Kompilier-Fehler: k nicht initialisiert
        
        
        // Listing 5.2
        
        /*
        int k;
        if (i >= 2) {
            k = 5;
        }
        if (i < 2) {
            k = 6;
        }
        System.out.println(k);
        */
        
        // Kompilier-Fehler: k nicht initialisiert
        
        
        int k = 0;
        if (i >= 2) {
            k = 5;
        }
        if (i < 2) {
            k = 6;
        }
        System.out.println(k);
    }
}
```
