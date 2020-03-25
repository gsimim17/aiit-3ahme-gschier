package k7;

import k7.FatherSonBsp01;
import k7.Father;

// Listing 7.16

public class Son
extends Father {
    private String s1 = FatherSonBsp01.getAndPrint("Son.s1");

    public Son() {
        FatherSonBsp01.getAndPrint("Son.<init>");
    }
}
