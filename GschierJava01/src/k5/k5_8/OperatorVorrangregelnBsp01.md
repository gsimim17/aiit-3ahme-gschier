```javascript
package k5;

// Listing 5.8 - 5.9

public class OperatorVorrangregelnBsp01 {
    public void operatorVorrangregelnBsp01() {
        // Listing 5.8
        
        /*
        int i = 55;
        int j = 97;
        if (i & 15 < j & 15) {
            System.out.println("LowByte(55) < LowByte(97)");
        } else {
            System.out.println("LowByte(55) >= LowByte(97)");
        }
        */
        
        // Fehler aufgrund von Operator-Vorrangregeln
        
        
        // Listing 5.9
        
        int i = 55;
        int j = 97;
        if ((i & 15) < (j & 15)) {
            System.out.println("LowByte(55) < LowByte(97)");
        } else {
            System.out.println("LowByte(55) >= LowByte(97)");
        }
    }
}
```
