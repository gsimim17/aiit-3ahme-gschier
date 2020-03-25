```javascript
package k5;

// Listing 5.6 - 5.7

public class ReferenzGleichheitBsp01 {
    public void referenzGleichheitBsp01() {
        String a = new String("hallo");
        String b = new String("hallo");
        
        // Listing 5.6
        System.out.println("a == b liefert " + (a == b));
        System.out.println("a != b liefert " + (a != b));
        
        // Listing 5.7
        System.out.println("a.equals(b) liefert " + a.equals(b));
    }
}
```
