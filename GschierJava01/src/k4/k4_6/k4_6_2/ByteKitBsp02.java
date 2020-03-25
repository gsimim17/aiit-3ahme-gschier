package k4;

import k4.ByteKitBsp01;

// Listing 4.13

public class ByteKitBsp02 {
    public void byteKitBsp02() {
        for (int i = 0; i < 256; ++i) {
            System.out.print("i=" + i);
            byte b = ByteKitBsp01.fromUnsignedInt(i);
            System.out.print(" b=" + ByteKitBsp01.toBitString(b));
            char c = ByteKitBsp01.toChar(b);
            System.out.print(" c=" + (c >= 32 ? c : '.'));
            System.out.println();
        }
    }
}
